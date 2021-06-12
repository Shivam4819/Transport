package com.transport.request;

import lombok.Data;
import lombok.NonNull;

@Data
public class RegisterVehicleRequest {
    @NonNull
    private int vnumber;
    @NonNull
    private int capacity;
    @NonNull
    private String type;
    @NonNull
    private String status;
    @NonNull
    private int empid;
}
