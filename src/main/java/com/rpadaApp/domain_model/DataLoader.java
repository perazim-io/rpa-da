package com.rpadaApp.domain_model;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.gson.Gson;
import com.rpadaApp.database.Myfirebase;
import com.rpadaApp.datamodellers.*;

import java.util.*;
import java.util.concurrent.*;

public enum DataLoader {
    instance;
    private Firestore objModellerFirestore = Myfirebase.getInstance().getObjModellerFirestore();
    private Firestore tenantConfigFirestore = Myfirebase.getInstance().getTenantConfigFirestore();
    private Map<String, List<Object>> persistanceDataMap = new HashMap<>();
    private Map<String,Domain> domainMap = new HashMap<>();
    private Executor executor = Executors.newFixedThreadPool(10);

    public static DataLoader getInstance() {
        return instance;
    }

    public void init(){
        //query microservice details
        String tenantId = "1010";
        String collectionPath = "microservicesDetails/"+tenantId+"/microservicesDetails";
        final List<MicroServiceDetails> microServiceDetailsList = new ArrayList<>();
        final StringBuffer errorBuffer = new StringBuffer();
        try {
            ApiFuture<QuerySnapshot> snapshot = tenantConfigFirestore.collection(collectionPath).get();
            List<QueryDocumentSnapshot> querySnapshot = snapshot.get().getDocuments();
            querySnapshot.forEach(queryDocumentSnapshot -> {
                Map<String, Object> dataMap = queryDocumentSnapshot.getData();
                dataMap.put("id",queryDocumentSnapshot.getId());
                Gson gson = new Gson();
                String jsonString = gson.toJson(dataMap);
                errorBuffer.append(jsonString);
                MicroServiceDetails dataObj = gson.fromJson(jsonString, MicroServiceDetails.class);
                microServiceDetailsList.add(dataObj);
            });
        }catch (Exception e){
            e.printStackTrace();
        }

        loadData(microServiceDetailsList.get(2),tenantId);
    }

    public Domain getDomainObject(String microserviceId) {

        return this.domainMap.get(microserviceId);
    }

    // This is the entry point
    public void loadData(MicroServiceDetails microService,String tenantId) {
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
            FutureTask ft = new FutureTask(new LoadFirebaseData(collectionName, className, microService.getMicroserviceId(),tenantId));
            ftMap.put(collectionName, ft);
            executor.execute(ft);
        });


        ftMap.forEach((collectionName, futureTask) -> {
            try {
                Object dataList = futureTask.get();
                this.persistanceDataMap.put(collectionName, (List<Object>) dataList);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Domain domain =dataConverter.getInstance().convertToDomainData(persistanceDataMap,microService);// begin the processing of data
        this.domainMap.put(microService.getMicroserviceId(),domain);
        System.out.println(domainMap.toString());
    }


    private class LoadFirebaseData implements Callable {
        private String collectionName;
        private Class clazz;

        public LoadFirebaseData(String collectionName, Class clazz,String microServiceId,String tenantId) {
            this.collectionName = collectionName + "/"+tenantId+"/" + collectionName + "/"+microServiceId+"/" + collectionName;
            this.clazz = clazz;
        }

        @Override
        public Object call() throws Exception {
            final List<Object> retList = new ArrayList<>();
            final StringBuffer errorBuffer = new StringBuffer();

            try {
                ApiFuture<QuerySnapshot> snapshot = objModellerFirestore.collection(this.collectionName).get();
                List<QueryDocumentSnapshot> querySnapshot = snapshot.get().getDocuments();
                querySnapshot.forEach(queryDocumentSnapshot -> {
                    Map<String, Object> dataMap = queryDocumentSnapshot.getData();
                    dataMap.put("id",queryDocumentSnapshot.getId());
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
