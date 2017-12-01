package com.youzidata.model;

import java.util.Date;

public class User {
    private Long id;
    private String un;
    private String pwd;
    private Date createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", un='" + un + '\'' +
                ", pwd='" + pwd + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
