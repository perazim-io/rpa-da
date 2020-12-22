package io.perazim.rpada;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.gson.Gson;
import database.Myfirebase;
import datamodellers.EntityCanvas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class GetEntityCanvasData {

    private static GetEntityCanvasData _instance;
    private Firestore firestore = Myfirebase.getInstance().getFirestore();
    private AtomicBoolean dataLoaded = new AtomicBoolean(false);
    private ApiFuture<QuerySnapshot> entityCanvasData;

    public static GetEntityCanvasData getInstance() {
        if (_instance == null) {
            _instance = new GetEntityCanvasData();
        }
        return _instance;
    }

    private GetEntityCanvasData() {

    }

    public void init() {
        String EntityPath = "spaceEntity/1010/spaceEntity/dZZN6Gjn8sjPa6JTFDrf/spaceEntity";
        String spaceAttributePath = "spaceAttribute/1010/spaceAttribute/dZZN6Gjn8sjPa6JTFDrf/spaceAttribute";
        String relationPortPath = "spaceRelationPort/1010/spaceRelationPort/dZZN6Gjn8sjPa6JTFDrf/spaceRelationPort";
        String RelationLink = "spaceRelationLink/1010/spaceRelationLink/dZZN6Gjn8sjPa6JTFDrf/spaceRelationLink";
        String entityCanvasCollection = "entityCanvas/1010/entityCanvas/dZZN6Gjn8sjPa6JTFDrf/entityCanvas";


        //querying data from firebase
        try {
            entityCanvasData = firestore.collection(entityCanvasCollection).get();
            this.dataLoaded.set(true);
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }


    }

    public boolean isDataLoaded() {
        return this.dataLoaded.get();
    }

    public void makeEntCanvasData() {
        try {
            List<QueryDocumentSnapshot> documents = entityCanvasData.get().getDocuments();
            List<EntityCanvas> e = new ArrayList<>();
            EntityCanvas entityCanvas;
            for (QueryDocumentSnapshot queryDocumentSnapshot : documents) {
                Map ent = queryDocumentSnapshot.getData();
                Gson gson = new Gson();
                String jsonString = gson.toJson(ent);

                entityCanvas = gson.fromJson(jsonString, EntityCanvas.class);
                // System.out.println(entityCanvas);
//                System.out.println(entityCanvas.getCrtMs());

//                EntityCanvas obj=new EntityCanvas();
//
//                obj.setEntityId(ent.get("entityId").toString());
//                obj.setLoc(ent.get("loc").toString());
//                obj.setMicroserviceId(ent.get("microserviceId").toString());
//                obj.setProjectId(ent.get("projectId").toString());
//                obj.setCrtMs((Long) ent.get("crtMs"));
//                obj.setCurrentVersion((String) ent.get("currentVersion"));
//
                e.add(entityCanvas);
            }
            e.forEach(ele -> {
                System.out.println("this->" + ele.getCrtMs());
            });
//            System.out.println(e);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
