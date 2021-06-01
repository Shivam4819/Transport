package com.transport.controller;

import com.transport.entity.VehicleEntity;
import com.transport.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Vehicle {

    @Autowired
    VehicleService vehicleService;
    @PostMapping("/vehicles")
    public String registerVehicle(@RequestBody VehicleEntity vehicleEntity){

        return this.vehicleService.registerVehicleService(vehicleEntity);
    }
}
