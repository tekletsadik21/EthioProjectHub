package com.amu.ethioprojecthub.controller;

import com.amu.ethioprojecthub.model.User;
import com.amu.ethioprojecthub.service.FirebaseService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class AuthController {
    FirebaseService firebaseService = new FirebaseService();

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
        user.setPassword(null);
        return firebaseService.saveUserData(user);
    }
    @DeleteMapping("/deleteUserDetails")
    public String deleteUserDetails(@RequestHeader String username) throws ExecutionException, InterruptedException {

        return firebaseService.deleteUserData(username);
    }


}
