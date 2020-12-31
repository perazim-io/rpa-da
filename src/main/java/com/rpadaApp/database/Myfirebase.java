package com.rpadaApp.database;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.*;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;

public class Myfirebase {

    private static Myfirebase _instance;
    private Firestore objModellerFirestore;
    private Firestore tenantConfigFirestore;
    private FirebaseDatabase instance;

    private  Myfirebase(){
        this.initFirebase();
    }

    public static Myfirebase getInstance() {
        if (_instance == null) {
            _instance = new Myfirebase();
        }
        return _instance;
    }

    public Firestore getObjModellerFirestore() {
        return this.objModellerFirestore;
    }
    public Firestore getTenantConfigFirestore(){return this.tenantConfigFirestore;}

    private Firestore connectToDb(String filePath,String testName,String dbName){

        FirebaseApp firebaseApp = null;
        try{
            File file = ResourceUtils.getFile(filePath);
            FileInputStream serviceAccount = new FileInputStream(file);

            GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(credentials)
                    .build();
            firebaseApp = FirebaseApp.initializeApp(options, testName);
            // set firestore in the field variable

            System.out.println(dbName+ "Done !!!");

        }catch (Exception e){
            e.printStackTrace();
        }
        return FirestoreClient.getFirestore(firebaseApp);
    }

    private void initFirebase(){
        this.tenantConfigFirestore=connectToDb("classpath:tenantconfig-firebase.json","test1","tenant config");
        this.objModellerFirestore=connectToDb("classpath:.objectmodeller-firebase.json","test","object modeller");
    }

}
