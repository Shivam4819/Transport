package com.transport.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class LoginEntity {

    @Id
    private int id;
    private String password;

    public LoginEntity(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public LoginEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
