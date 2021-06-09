package com.transport.request;


import lombok.Data;
import lombok.NonNull;

@Data
public class CheckCredentialRequest   {

    @NonNull
    private String username;
    @NonNull
    private String password;
}
