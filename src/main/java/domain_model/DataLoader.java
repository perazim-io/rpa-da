package domain_model;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.gson.Gson;
import database.Myfirebase;
import datamodellers.*;

import java.util.*;
import java.util.concurrent.*;

public enum DataLoader {
    instance;
    private Firestore firestore = Myfirebase.getInstance().getFirestore();
    private Map<String, List<Object>> dataMap = new HashMap<>();
    private Executor executor = Executors.newFixedThreadPool(10);

    public static DataLoader getInstance() {
        return instance;
    }

    // This is the entry point
    public void loadData() {
        System.out.println("Starting to run!!!");
        String spaceEntity = "spaceEntity";
        String spaceAttributePath = "spaceAttribute";
        String spaceRelationPort = "spaceRelationPort";
        String spaceRelationLink = "spaceRelationLink";
        String entityCanvas = "entityCanvas";
        String linkCanvas = "linkCanvas";

        // load into class Map
        Map<String, Class> classMap = new HashMap<>();
        classMap.put(spaceEntity, SpaceEntity.class);
        classMap.put(linkCanvas, LinkCanvas.class);
        classMap.put(spaceAttributePath, SpaceAttribute.class);
        classMap.put(spaceRelationPort, SpaceRelationPort.class);
        classMap.put(spaceRelationLink, SpaceRelationLink.class);
        classMap.put(entityCanvas,EntityCanvas.class);

        // load the others

        Map<String, FutureTask> ftMap = new HashMap<>();
        classMap.forEach((collectionName, className) -> {
            FutureTask ft = new FutureTask(new LoadFirebaseData(collectionName, className));
            ftMap.put(collectionName, ft);
            executor.execute(ft);
        });


        ftMap.forEach((collectionName, futureTask) -> {
            try {
                Object dataList = futureTask.get();
                this.dataMap.put(collectionName, (List<Object>) dataList);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        process(); // begin the processing of data

    }

    private void process() {
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

    private class LoadFirebaseData implements Callable {
        private String collectionName;
        private Class clazz;

        public LoadFirebaseData(String collectionName, Class clazz) {
            this.collectionName = collectionName + "/1010/" + collectionName + "/9EfnEpevW2KN9uuH5Cj5/" + collectionName;
            this.clazz = clazz;
        }

        @Override
        public Object call() throws Exception {
            final List<Object> retList = new ArrayList<>();
            final StringBuffer errorBuffer = new StringBuffer();
            try {
                ApiFuture<QuerySnapshot> snapshot = firestore.collection(this.collectionName).get();
                List<QueryDocumentSnapshot> querySnapshot = snapshot.get().getDocuments();
                querySnapshot.forEach(queryDocumentSnapshot -> {
                    Map<String, Object> dataMap = queryDocumentSnapshot.getData();
                    Gson gson = new Gson();
                    String jsonString = gson.toJson(dataMap);
                    errorBuffer.append(jsonString);
                    Object dataObj = gson.fromJson(jsonString, this.clazz);
                    retList.add(dataObj);
                });
            } catch (Exception e) {
                System.out.println("=========== ERROR HERE ============");
                e.printStackTrace();
                System.out.println(errorBuffer.toString());
                errorBuffer.setLength(0);
            }
            return retList;
        }
    }
}
