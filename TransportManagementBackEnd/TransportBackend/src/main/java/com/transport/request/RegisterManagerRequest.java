package com.transport.request;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class RegisterManagerRequest {
    @NonNull
    private int id;
    @NonNull
    private String name;
    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private String designation;
}
