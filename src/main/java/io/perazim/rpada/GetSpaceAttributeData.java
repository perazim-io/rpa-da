package io.perazim.rpada;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.gson.Gson;
import database.Myfirebase;
import datamodellers.EntityCanvas;
import datamodellers.SpaceAttribute;
import datamodellers.SpaceEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class GetSpaceAttributeData {
    private static GetSpaceAttributeData _instance;
    private Firestore firestore = Myfirebase.getInstance().getFirestore();
    private AtomicBoolean dataLoaded = new AtomicBoolean(false);
    private ApiFuture<QuerySnapshot> spaceAttributeData;

    public static GetSpaceAttributeData getInstance() {
        if (_instance == null) {
            _instance = new GetSpaceAttributeData();
        }
        return _instance;
    }

    private GetSpaceAttributeData() {

    }

    public void init(){
        String spaceAttributePath = "spaceAttribute/1010/spaceAttribute/dZZN6Gjn8sjPa6JTFDrf/spaceAttribute";

        //querying data from firebase
        try {
            spaceAttributeData = firestore.collection(spaceAttributePath).get();
            this.dataLoaded.set(true);
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    public boolean isDataLoaded() {
        return this.dataLoaded.get();
    }

    public void makeSpaceAttributeData(){

        try {
            List<QueryDocumentSnapshot> documents = spaceAttributeData.get().getDocuments();
            List<SpaceAttribute> e = new ArrayList<>();
            SpaceAttribute spaceAttribute;
            for (QueryDocumentSnapshot queryDocumentSnapshot : documents) {
                Map ent = queryDocumentSnapshot.getData();
                Gson gson = new Gson();
                String jsonString = gson.toJson(ent);

                spaceAttribute = gson.fromJson(jsonString, SpaceAttribute.class);
                e.add(spaceAttribute);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }

    }
}
