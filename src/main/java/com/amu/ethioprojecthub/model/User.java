package com.amu.ethioprojecthub.model;

public class User {
    private String username;
    private String email;
    private String photoUrl;
    private String bio;
    private String department;
    private String id;
    private String phoneNumber;
    private String password;

    public User(){

    }
    public User(String username, String email, String photoUrl, String department,
         String id, String phoneNumber,String bio,String password) {
        this.username = username;
        this.email = email;
        this.photoUrl = photoUrl;
        this.phoneNumber = phoneNumber;
        this.bio = bio;
        this.id = id;
        this.department = department;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
