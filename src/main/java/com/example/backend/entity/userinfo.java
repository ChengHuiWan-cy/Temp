package com.example.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class userinfo {
    @Id
    private String username = "";
    private String password= "";
    public userinfo(){}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username=username;
    }

    public void setPassword(String password) {
        this.password=password;
    }
}

