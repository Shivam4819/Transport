package com.transport.response;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class AllUserDataResponse {
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

    public AllUserDataResponse() {

    }
}
