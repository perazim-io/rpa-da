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

public class GetSpaceRelationLinkData {
    private static GetSpaceRelationLinkData _instance;
    private Firestore firestore = Myfirebase.getInstance().getFirestore();
    private AtomicBoolean dataLoaded = new AtomicBoolean(false);
    private ApiFuture<QuerySnapshot> spaceRelationLinkData;

    public static GetSpaceRelationLinkData getInstance() {
        if (_instance == null) {
            _instance = new GetSpaceRelationLinkData();
        }
        return _instance;
    }

    private GetSpaceRelationLinkData() {

    }

    public void init(){
        String RelationLink = "spaceRelationLink/1010/spaceRelationLink/dZZN6Gjn8sjPa6JTFDrf/spaceRelationLink";

        //querying data from firebase
        try {
            spaceRelationLinkData = firestore.collection(RelationLink).get();
            this.dataLoaded.set(true);
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    public boolean isDataLoaded() {
        return this.dataLoaded.get();
    }

    public void makeSpaceRelationLinkData(){

        try {
            List<QueryDocumentSnapshot> documents = spaceRelationLinkData.get().getDocuments();
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
