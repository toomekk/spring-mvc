package com.mvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="imperators")
public class Imperator {
    @Id
    private String name;
    private String password;//todo hashowanie hasła
    private int credits = 10000;

    public Imperator(String name, String password) {
        this.name = name;
        this.password = password;

    }
    public Imperator() {

    }
}
