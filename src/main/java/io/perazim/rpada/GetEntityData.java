package io.perazim.rpada;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import database.Myfirebase;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class GetEntityData {

    private static GetEntityData _instance;
    private Firestore firestore = Myfirebase.getInstance().getFirestore();
    private AtomicBoolean dataLoaded = new AtomicBoolean(false);
    private ApiFuture<QuerySnapshot> entityData;

    public static GetEntityData getInstance(){
        if (_instance == null) {
            _instance = new GetEntityData();
        }
        return _instance;
    }

    private GetEntityData(){

    }

    public void  init(){
        System.out.println("hello world");
        String path = "spaceEntity/1010/spaceEntity/dZZN6Gjn8sjPa6JTFDrf/spaceEntity";
        //querying data from firebase
        try{
            entityData = firestore.collection(path).get();
            List<QueryDocumentSnapshot> documents = entityData.get().getDocuments();
            System.out.println(documents);
            this.dataLoaded.set(true);
        }catch (Exception e){
            System.out.println("error");
            e.printStackTrace();
        }


    }

    public boolean isDataLoaded() {
        return this.dataLoaded.get();
    }

    public void  printData(){
        System. out. print(entityData);
    }

}
