package com.transport.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class LoginEntity {

    @Id
    private String username;
    private String password;

    public LoginEntity( String username, String password) {
        this.username = username;
        this.password = password;
    }



    public LoginEntity() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
