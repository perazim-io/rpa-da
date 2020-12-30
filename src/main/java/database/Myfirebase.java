package database;

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


    private void connectObjModeller(){

        try{
            File file = ResourceUtils.getFile("classpath:.objectmodeller-firebase.json");
            FileInputStream serviceAccount = new FileInputStream(file);

            GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(credentials)
                    .build();
            FirebaseApp firebaseApp = FirebaseApp.initializeApp(options, "test");
            // set firestore in the field variable
            this.objModellerFirestore = FirestoreClient.getFirestore(firebaseApp);

            System.out.println("object modeller Done !!!");


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void connectTenantConfig(){

        try {

            File file = ResourceUtils.getFile("classpath:tenantconfig-firebase.json");
            FileInputStream serviceAccount = new FileInputStream(file);

            GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(credentials)
                    .build();
            FirebaseApp firebaseApp = FirebaseApp.initializeApp(options, "test1");
            // set firestore in the field variable
            this.tenantConfigFirestore = FirestoreClient.getFirestore(firebaseApp);

            System.out.println("tenant config Done !!!");


        }catch (Exception e){
            e.printStackTrace();
        }
    }



    private void initFirebase(){

        connectTenantConfig();
        connectObjModeller();

    }

}
