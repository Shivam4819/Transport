package com.transport.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Data
@Entity
public class UserEntity {

    @Id
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true,nullable = false)
    private String username;
    @Column(unique = true,nullable = false)
    private String password;
    @Column(nullable = false)
    private String designation;

}
