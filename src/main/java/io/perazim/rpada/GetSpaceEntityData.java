package io.perazim.rpada;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.gson.Gson;
import database.Myfirebase;
import datamodellers.EntityCanvas;
import datamodellers.SpaceEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class GetSpaceEntityData {

    private static GetSpaceEntityData _instance;
    private Firestore firestore = Myfirebase.getInstance().getFirestore();
    private AtomicBoolean dataLoaded = new AtomicBoolean(false);
    private ApiFuture<QuerySnapshot> spaceEntityData;

    public static GetSpaceEntityData getInstance() {
        if (_instance == null) {
            _instance = new GetSpaceEntityData();
        }
        return _instance;
    }

    private GetSpaceEntityData() {

    }

    public void init(){
        String EntityPath = "spaceEntity/1010/spaceEntity/dZZN6Gjn8sjPa6JTFDrf/spaceEntity";

        //querying data from firebase
        try {
            spaceEntityData = firestore.collection(EntityPath).get();
            this.dataLoaded.set(true);
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    public boolean isDataLoaded() {
        return this.dataLoaded.get();
    }

    public void makeSpaceEntityData(){

        try {
            List<QueryDocumentSnapshot> documents = spaceEntityData.get().getDocuments();
            List<SpaceEntity> e = new ArrayList<>();
            SpaceEntity spaceEntity;
            for (QueryDocumentSnapshot queryDocumentSnapshot : documents) {
                Map ent = queryDocumentSnapshot.getData();
                Gson gson = new Gson();
                String jsonString = gson.toJson(ent);

                spaceEntity = gson.fromJson(jsonString, SpaceEntity.class);

//                spaceEntity obj=new spaceEntity();
//                obj.setProjectId(ent.get("projectId").toString());
//                obj.setMicroserviceId(ent.get("microserviceId").toString());
//                obj.setEntityCode(ent.get("entityCode").toString());
//                obj.setCrtStoryId(ent.get("crtStoryId").toString());
//                obj.setCrtTaskId(ent.get("crtTaskId").toString());
//                obj.setEntityName(ent.get("entityName").toString());
//                obj.setAdminStatus(ent.get("adminStatus").toString());
//                obj.setLock((Boolean) ent.get("lock"));
//                obj.setCurrentVersion((String) ent.get("currentVersion"));
//                obj.setReleaseVersion((String) ent.get("releaseVersion"));
//                obj.setReleasedDate((Number) ent.get("releasedDate"));
//                obj.setCrtDt((Number) ent.get("crtDt"));
//                obj.setUpdtDt((Number) ent.get("updtDt"));
//
                e.add(spaceEntity);

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }

    }
}
