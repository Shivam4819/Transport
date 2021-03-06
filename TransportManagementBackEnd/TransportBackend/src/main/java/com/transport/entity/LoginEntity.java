package com.transport.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class LoginEntity {

    @Id
    private String username;
    private String password;
}
