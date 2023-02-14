package com.amu.ethioprojecthub.service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.IOException;

@Service
public class FirebaseInitialize {
    public FileInputStream getServiceAccount() {
        return serviceAccount;
    }

    private FileInputStream serviceAccount;
    @PostConstruct
    public void initialize(){
        try {
            serviceAccount = new FileInputStream("./serviceAccount.json");
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://ethio-projecthub.firebaseio.com/")
                    .build();
            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
