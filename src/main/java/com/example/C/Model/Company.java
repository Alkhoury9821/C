package com.example.C.Model;

public class Company {


    private int id;

    private String username;

    public Company(int id, String username) {
        this.username = username;
    }

    public Company() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
