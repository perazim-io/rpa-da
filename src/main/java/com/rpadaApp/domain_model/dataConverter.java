package com.rpadaApp.domain_model;

import com.google.gson.Gson;
import com.rpadaApp.datamodellers.*;

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

    public Domain convertToDomainData(Map<String, List<Object>> persistanceDataMap,MicroServiceDetails microService){
        List<SpaceEntity> spaceEntityList = (List<SpaceEntity>) (List) persistanceDataMap.get("spaceEntity");
        List<LinkCanvas> linkCanvasList = (List<LinkCanvas>) (List) persistanceDataMap.get("linkCanvas");
        List<SpaceAttribute> attributeList = (List<SpaceAttribute>) (List) persistanceDataMap.get("spaceAttribute");
        List<SpaceRelationPort> relPortList = (List<SpaceRelationPort>)(List) persistanceDataMap.get("spaceRelationPort");
        List<SpaceRelationLink> relLinkList = (List<SpaceRelationLink>) (List) persistanceDataMap.get("spaceRelationLink");
        List<EntityCanvas> entityCanvasList = (List<EntityCanvas>) (List) persistanceDataMap.get("entityCanvas");

        System.out.println("relation link="+relLinkList);

        List<DRelationPort> dRelationPorts =(List<DRelationPort>) (List) convetToDomain(relPortList,DRelationPort.class);
//        List<DSpaceAttribute> dSpaceAttributes=(List<DSpaceAttribute>) (List) convetToDomain(attributeList,DSpaceAttribute.class);
        List<DSpaceEntity> dSpaceEntites=(List<DSpaceEntity>) (List) convetToDomain(spaceEntityList,DSpaceEntity.class);
        List<DRelationLink> dRelationLinks=(List<DRelationLink>)(List) convetToDomain(relLinkList,DRelationLink.class);


        dSpaceEntites.forEach(dSpaceEntity -> {
            dSpaceEntity.setMicroserviceName(microService.getMicroserviceName());
            dSpaceEntity.setProjectName(microService.getProjectName());
            List<SpaceAttribute>attrs= attributeList.stream().filter(att-> att.getEntityCode().equals(dSpaceEntity.getEntityCode())).collect(Collectors.toList());
            System.out.println(dSpaceEntity.getProjectName());
            List<DSpaceAttribute> attrs1=(List<DSpaceAttribute>) (List) convetToDomain(attrs,DSpaceAttribute.class);
            attrs1.forEach(dSpaceAttribute -> {
                dSpaceAttribute.setMicroserviceName(microService.getMicroserviceName());
                dSpaceAttribute.setProjectName(microService.getProjectName());
                boolean match = dRelationPorts.stream().noneMatch(dRelationPort -> dRelationPort.getAttributeId().equals(dSpaceAttribute.getId()));
                if(!match){
                    List<DRelationPort> ports = dRelationPorts.stream().filter(port->port.getAttributeId().equals(dSpaceAttribute.getId())).collect(Collectors.toList());
                    System.out.println("ports=="+ports.size());
                    ports.forEach(dRelationPort -> {
                        dRelationLinks.stream().forEach(link->{
                            if(dRelationPort.getPort().equals("IN")){
                                link.getInRelationPortId().equals(dRelationPort.getId());
                                List<DRelationLink> inLinks=dRelationPort.getInLinks();
                                if (inLinks == null) {
                                    inLinks = new ArrayList<DRelationLink>();
                                } else {
                                    inLinks.add(link);
                                }
                                dRelationPort.setInLinks(inLinks);
                                LinkCanvas canvasData =linkCanvasList.stream().filter(linkCanvas -> linkCanvas.getRelationLinkId().equals(link.getId())).findFirst().get();
                                link.setLinkCanvasData(canvasData);
                            }else {
                                if(link.getOutRelationPortId().equals(dRelationPort.getId())){
                                    List<DRelationLink> outLinks=dRelationPort.getOutLinks();
                                    if (outLinks == null) {
                                        outLinks = new ArrayList<DRelationLink>();
                                    } else {
                                        outLinks.add(link);
                                    }
                                    outLinks.add(link);
                                    dRelationPort.setOutLinks(outLinks);
                                    LinkCanvas canvasData =linkCanvasList.stream().filter(linkCanvas -> linkCanvas.getRelationLinkId().equals(link.getId())).findFirst().get();
                                    link.setLinkCanvasData(canvasData);
                                }
                            }
                        });
                    });
                    dSpaceAttribute.setSpaceRelationPorts(ports);
                }
            });

            dSpaceEntity.setSpaceAttributes(attrs1);
            EntityCanvas canvasData = entityCanvasList.stream().filter(entityCanvas -> entityCanvas.getEntityId().equals(dSpaceEntity.getId())).findAny().orElse(null);
            dSpaceEntity.setCanvasData(canvasData);
        });


        Domain domain = new Domain();
        domain.setMicroServiceId(microService.getMicroserviceId());
        domain.setDSpaceEntities(dSpaceEntites);


        return domain;

    }
}
