package com.amu.ethioprojecthub.service;

import com.amu.ethioprojecthub.model.User;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.cloud.FirestoreClient;

import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

@Service
public class FirebaseService {
    private FirebaseInitialize firebaseInitialize;
    public String saveUserData(User user) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiResult = dbFirestore.collection("users").document(user.getUsername()).set(user);
        return collectionApiResult.get().getUpdateTime().toString();
    }

    public User getUserData(String name) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection("users").document(name);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot documentSnapshot = future.get();
        User user;
        if(documentSnapshot.exists()){
            user = documentSnapshot.toObject(User.class);
            return user;
        }else return null;
    }

    public String updateUserData(User user) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiResult = dbFirestore.collection("users").document(user.getUsername()).set(user);
        return collectionApiResult.get().getUpdateTime().toString();
    }
    public String deleteUserData(String username) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiResult = dbFirestore.collection("users").document(username).delete();
        return collectionApiResult.get().getUpdateTime().toString();
    }
    public void registerUser(User user){
        UserRecord.CreateRequest request = new UserRecord.CreateRequest()
                .setEmail(user.getEmail())
                .setEmailVerified(false)
                .setPassword(user.getPassword())
                .setPhoneNumber(user.getPhoneNumber())
                .setDisplayName(user.getUsername())
                .setPhotoUrl(user.getPhotoUrl())
                .setDisabled(false);
        try {
            UserRecord userRecord = FirebaseAuth.getInstance().createUser(request);
        } catch (FirebaseAuthException e) {
            throw new RuntimeException(e);
        }
    }



}
