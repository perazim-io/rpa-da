package database;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.*;

import java.io.File;
import java.io.FileInputStream;

public class Myfirebase {

    private static Myfirebase _instance;
    private Firestore firestore;
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

    public Firestore getFirestore() {
        return this.firestore;
    }

    private void initFirebase(){
        try{
            FileInputStream serviceAccount = new FileInputStream(new File("/media/maddy/New Volume/GoJs/rpa-da/src/main/resources/objectmodeller-firebase.json"));
            GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(credentials)
                    .build();
            FirebaseApp firebaseApp = FirebaseApp.initializeApp(options, "test");
            // set firestore in the field variable
            this.firestore = FirestoreClient.getFirestore(firebaseApp);

            System.out.println("Done !!!");


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
