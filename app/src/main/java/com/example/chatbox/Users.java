package com.example.chatbox;

public class Users {
    private String avatarUrl;
    private String name;
    private String lastMsg;

    public Users() {
    }

    public Users(String avatarUrl, String name, String lastMsg) {
        this.avatarUrl = avatarUrl;
        this.name = name;
        this.lastMsg = lastMsg;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getName() {
        return name;
    }

    public String getLastMsg() {
        return lastMsg;
    }
}
