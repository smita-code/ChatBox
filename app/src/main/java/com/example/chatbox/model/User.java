package com.example.chatbox.model;

public class User {
    private String imageURL;
    private String userName;
    private String id;

    public User() {
    }

    public User(String imageURL, String userName, String id) {
        this.imageURL = imageURL;
        this.userName = userName;
        this.id = id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getUserName() {
        return userName;
    }

    public String getId() {
        return id;
    }
}
