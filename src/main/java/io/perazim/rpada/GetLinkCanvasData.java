package io.perazim.rpada;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.gson.Gson;
import database.Myfirebase;
import datamodellers.EntityCanvas;
import datamodellers.LinkCanvas;
import datamodellers.SpaceEntity;


import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;

public class GetLinkCanvasData {

    private static GetLinkCanvasData _instance;
    private Firestore firestore = Myfirebase.getInstance().getFirestore();
    private AtomicBoolean dataLoaded = new AtomicBoolean(false);
    private ApiFuture<QuerySnapshot> linkCanvasSnap;

    public static GetLinkCanvasData getInstance() {
        if (_instance == null) {
            _instance = new GetLinkCanvasData();
        }
        return _instance;
    }

    private GetLinkCanvasData() {

    }

    public void init(){
        String linkCanvasPath = "linkCanvas/1010/linkCanvas/dZZN6Gjn8sjPa6JTFDrf/linkCanvas";

        //querying data from firebase
        try {
            linkCanvasSnap = firestore.collection(linkCanvasPath).get();
            this.dataLoaded.set(true);
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    public boolean isDataLoaded() {
        return this.dataLoaded.get();
    }

    public void makeLinkCanvasData(){

        try {
            List<QueryDocumentSnapshot> documents = linkCanvasSnap.get().getDocuments();
            List<LinkCanvas> e = new ArrayList<>();
            LinkCanvas linkCanvas;
            for (QueryDocumentSnapshot queryDocumentSnapshot : documents) {
                Map ent = queryDocumentSnapshot.getData();
                Gson gson = new Gson();
                String jsonString = gson.toJson(ent);

                linkCanvas = gson.fromJson(jsonString, LinkCanvas.class);
                e.add(linkCanvas);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }

    }
}
