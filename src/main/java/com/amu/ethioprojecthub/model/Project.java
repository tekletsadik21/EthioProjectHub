package com.amu.ethioprojecthub.model;

import java.util.Date;

public class Project {
    String id;
    String postId;
    String username;
    String description;
    String ownerId;
    String mediaUrl;
    Date timestamp;

    Project(String id, String postId, String username, String description, String ownerId, String mediaUrl){
        this.id = id;
        this.postId=postId;
        this.ownerId=ownerId;
        this.description=description;
        this.mediaUrl=mediaUrl;
        this.username=username;
        this.timestamp=timestamp;
    }
}
