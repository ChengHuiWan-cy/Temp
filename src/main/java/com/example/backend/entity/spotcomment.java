package com.example.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class spotcomment {
    private String spotname = "";
    @Id
    private String comment = "";
    private String time="";
    public spotcomment(){}

    public String getSpotname() {
        return spotname;
    }

    public String getComment() {
        return comment;
    }

    public String getTime() {
        return time;
    }

    public void setSpotname(String spotname) {
        this.spotname=spotname;
    }

    public void setComment(String comment) {
        this.comment=comment;
    }

    public void setTime(String time) {
        this.time=time;
    }
}
