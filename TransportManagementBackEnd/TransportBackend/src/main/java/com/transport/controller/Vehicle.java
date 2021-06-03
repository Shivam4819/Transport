package com.transport.controller;

import com.transport.entity.VehicleEntity;
import com.transport.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Vehicle {

    @Autowired
    VehicleService vehicleService;
    @PostMapping("/vehicles")
    public String registerVehicle(@RequestBody VehicleEntity vehicleEntity){

        return this.vehicleService.registerVehicleService(vehicleEntity);
    }

    @GetMapping("/details")
    public List<VehicleEntity> vehicleDetails(){
        return this.vehicleService.vehicleDetailsFromDB();
    }

    //below code is for finding details using status
    //go to vehicleDao interface and make costimize find search
    @PostMapping("/specific")
    public List<VehicleEntity> specificVehicle(@RequestBody VehicleEntity vehicleEntity){
        return this.vehicleService.specificVehicleDetail(vehicleEntity);
    }


}
