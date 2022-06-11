package com.example.C.Model;

import javax.persistence.*;

@Entity
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    @Column(unique = true , length = 25 , nullable = false)
    private String username;


    public Consumer(String username) {
        this.username = username;
    }

    public Consumer() {
    }


    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
