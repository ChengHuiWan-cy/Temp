package com.example.backend.entity;

public class forLogin {
    private String[] roles=new String[]{"admin"};
    private String name="whatever";
    private String avatar="whatever";
    private String introduction="whatever";
    public forLogin(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String[] getRoles() {
        return roles;
    }

    public String getName() {
        return name;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getIntroduction() {
        return introduction;
    }

}
