package com.amu.ethioprojecthub.model;

import java.util.Date;

public class Project {
    String id;
    String postId;
    String projectName;
    String description;
    String ownerId;
    String mediaFile;
    String timestamp;

    public Project(String id,  String projectName, String description, String ownerId, String mediaFile){
        this.id = id;
        this.ownerId=ownerId;
        this.description=description;
        this.mediaFile = mediaFile;
        this.projectName = projectName;
    }

    public Project() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getMediaFile() {
        return mediaFile;
    }

    public void setMediaFile(String mediaFile) {
        this.mediaFile = mediaFile;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
