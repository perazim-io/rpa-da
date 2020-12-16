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

public class GetSpaceRelationPortData {
    private static GetSpaceRelationPortData _instance;
    private Firestore firestore = Myfirebase.getInstance().getFirestore();
    private AtomicBoolean dataLoaded = new AtomicBoolean(false);
    private ApiFuture<QuerySnapshot> spaceRelationPortData;

    public static GetSpaceRelationPortData getInstance() {
        if (_instance == null) {
            _instance = new GetSpaceRelationPortData();
        }
        return _instance;
    }

    private GetSpaceRelationPortData() {

    }

    public void init(){
        String relationPortPath = "spaceRelationPort/1010/spaceRelationPort/dZZN6Gjn8sjPa6JTFDrf/spaceRelationPort";

        //querying data from firebase
        try {
            spaceRelationPortData = firestore.collection(relationPortPath).get();
            this.dataLoaded.set(true);
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    public boolean isDataLoaded() {
        return this.dataLoaded.get();
    }

    public void makeSpaceRelationPortData(){

        try {
            List<QueryDocumentSnapshot> documents = spaceRelationPortData.get().getDocuments();
            List<SpaceEntity> e = new ArrayList<>();
            documents.forEach(queryDocumentSnapshot -> {

                Map ent=queryDocumentSnapshot.getData();
                Gson gson=new Gson();
                String jsonString= gson.toJson(ent);

                EntityCanvas entityCanvas=gson.fromJson(jsonString, EntityCanvas.class);

            });
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }

    }
}
