package com.example.springaccount.Model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="sum")
    private int sum;

    public Account() {
    }

    public Account(int id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }
}
