package domain_model;


import com.google.gson.Gson;
import datamodellers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class dataConverter {
    private static dataConverter _instance;

    public static dataConverter getInstance(){
        if (_instance == null) {
            _instance = new dataConverter();
        }
        return _instance;
    }

    private dataConverter(){

    }

    public <V> List<Object> convetToDomain(List<V> dataList, Class clazz){
//        final StringBuffer errorBuffer = new StringBuffer();
        List<Object> retList = new ArrayList<>();
            dataList.forEach(data->{
                try {
                    Gson gson = new Gson();
                    String jsonString = gson.toJson(data);
//                    errorBuffer.append(jsonString);
                    Object obj = gson.fromJson(jsonString, clazz);
                    retList.add(obj);
                }catch (Exception e){
                    System.out.println("=====Error Occured======");
                    e.printStackTrace();
                }
            });
        return retList;
    }

    public Domain convertToDomainData(Map<String, List<Object>> persistanceDataMap,String microServiceId){
        List<SpaceEntity> spaceEntityList = (List<SpaceEntity>) (List) persistanceDataMap.get("spaceEntity");
        List<LinkCanvas> linkCanvasList = (List<LinkCanvas>) (List) persistanceDataMap.get("linkCanvas");
        List<SpaceAttribute> attributeList = (List<SpaceAttribute>) (List) persistanceDataMap.get("spaceAttribute");
        List<SpaceRelationPort> relPortList = (List<SpaceRelationPort>)(List) persistanceDataMap.get("spaceRelationPort");
        List<SpaceRelationLink> relLinkList = (List<SpaceRelationLink>) (List) persistanceDataMap.get("spaceRelationLink");
        List<EntityCanvas> entityCanvasList = (List<EntityCanvas>) (List) persistanceDataMap.get("entityCanvas");


        List<DRelationPort> dRelationPorts =(List<DRelationPort>) (List) convetToDomain(relPortList,DRelationPort.class);
//        List<DSpaceAttribute> dSpaceAttributes=(List<DSpaceAttribute>) (List) convetToDomain(attributeList,DSpaceAttribute.class);
        List<DSpaceEntity> dSpaceEntites=(List<DSpaceEntity>) (List) convetToDomain(spaceEntityList,DSpaceEntity.class);


        dSpaceEntites.forEach(dSpaceEntity -> {
            List<SpaceAttribute>attrs= attributeList.stream().filter(att-> att.getEntityCode().equals(dSpaceEntity.getEntityCode())).collect(Collectors.toList());
            System.out.println(dSpaceEntity.getEntityCode());
            List<DSpaceAttribute> attrs1=(List<DSpaceAttribute>) (List) convetToDomain(attrs,DSpaceAttribute.class);
            attrs1.forEach(dSpaceAttribute -> {
                boolean match = dRelationPorts.stream().noneMatch(dRelationPort -> dRelationPort.getAttributeId().equals(dSpaceAttribute.getId()));
                if(!match){
                    List<DRelationPort> ports = dRelationPorts.stream().filter(port->port.getAttributeId().equals(dSpaceAttribute.getId())).collect(Collectors.toList());
                    dSpaceAttribute.setSpaceRelationPorts(ports);
                }
            });

            dSpaceEntity.setSpaceAttributes(attrs1);
            EntityCanvas canvasData = entityCanvasList.stream().filter(entityCanvas -> entityCanvas.getEntityId().equals(dSpaceEntity.getId())).findAny().orElse(null);
            dSpaceEntity.setCanvasData(canvasData);
        });

        dSpaceEntites.forEach(ent->{
            List<DRelationPort> names = null;
            ent.getSpaceAttributes().forEach(dSpaceAttribute -> {
                    System.out.println(dSpaceAttribute.getAttrName()+"==="+dSpaceAttribute.getSpaceRelationPorts());
            });
        });

        Domain domain = new Domain();
        domain.setMicroServiceId(microServiceId);
        domain.setDSpaceEntities(dSpaceEntites);

        return domain;

    }
}


//        System.out.println(spaceEntityList.size());
//                System.out.println(linkCanvasList.size());
//                System.out.println(attributeList.size());
//                System.out.println(relPortList.size());
//                System.out.println(relLinkList.size());
//                System.out.println(entityCanvasList.size());
