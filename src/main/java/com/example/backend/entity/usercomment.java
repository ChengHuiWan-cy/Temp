package com.example.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class usercomment {
    private String username = "";
    @Id
    private String comment = "";
    private String time = "";
    private String spot = "";

    public usercomment() {
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }

    public String getTime() {
        return time;
    }

    public String getSpot() {
        return spot;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }
}
