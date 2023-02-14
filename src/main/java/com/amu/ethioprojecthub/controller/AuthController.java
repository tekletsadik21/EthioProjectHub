package com.amu.ethioprojecthub.controller;

import com.amu.ethioprojecthub.model.User;
import com.amu.ethioprojecthub.service.FirebaseService;
import com.amu.ethioprojecthub.view.MainFrame;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@RestController
public class AuthController {
    FirebaseService firebaseService = new FirebaseService();
    private User user;
    public AuthController() {
    }

    @GetMapping("/getUserDetails")
    public User getUserDetails(@RequestHeader String username) throws ExecutionException, InterruptedException {
        return firebaseService.getUserData(username);
    }
    @PutMapping("/updateUserDetails")
    public String updateUserDetails(@RequestBody User user) throws ExecutionException, InterruptedException {
        return firebaseService.updateUserData(user);
    }
    @PostMapping("/setUserDetails")
    public String setUserDetails(@RequestBody User user) throws ExecutionException, InterruptedException {
        firebaseService.registerUser(user);
        return firebaseService.saveUserData(user);
    }
    @DeleteMapping("/deleteUserDetails")
    public String deleteUserDetails(@RequestHeader String username) throws ExecutionException, InterruptedException {

        return firebaseService.deleteUserData(username);
    }

    @PostMapping("/authenticateUser")
    public Map<Boolean,User> authenticateUser(@RequestBody User auth){
        Boolean success;
        try {
            UserRecord userRecord = FirebaseAuth.getInstance().getUserByEmail(auth.getEmail());
            user =  firebaseService.getUserData(userRecord.getDisplayName());

            if (user.getPassword().equals(auth.getPassword())) {

                success = true;
                return Map.of(true,user);
            }
        } catch (FirebaseAuthException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Map.of(false,auth);
    }

}
