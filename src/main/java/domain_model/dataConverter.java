package domain_model;


import datamodellers.*;

import java.util.List;
import java.util.Map;

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

    public void processData(Map<String, List<Object>> dataMap){
        List<SpaceEntity> spaceEntityList = (List<SpaceEntity>) (List) dataMap.get("spaceEntity");
        List<LinkCanvas> linkCanvasList = (List<LinkCanvas>) (List) dataMap.get("linkCanvas");
        List<SpaceAttribute> attributeList = (List<SpaceAttribute>) (List) dataMap.get("spaceAttribute");
        List<SpaceRelationPort> relPortList = (List<SpaceRelationPort>)(List) dataMap.get("spaceRelationPort");
        List<SpaceRelationLink> relLinkList = (List<SpaceRelationLink>) (List) dataMap.get("spaceRelationLink");
        List<EntityCanvas> entityCanvasList = (List<EntityCanvas>) (List) dataMap.get("entityCanvas");

        System.out.println(spaceEntityList.size());
        System.out.println(linkCanvasList.size());
        System.out.println(attributeList.size());
        System.out.println(relPortList.size());
        System.out.println(relLinkList.size());
        System.out.println(entityCanvasList.size());
    }
}
