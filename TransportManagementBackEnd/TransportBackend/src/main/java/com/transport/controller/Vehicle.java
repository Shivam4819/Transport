package com.transport.controller;

import com.transport.entity.NewVehicleRequestEntity;
import com.transport.entity.VehicleEntity;
import com.transport.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")

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
    public List<VehicleEntity> vehicleByStatus(@RequestBody VehicleEntity vehicleEntity){
        return this.vehicleService.vehicleDetailByStatus(vehicleEntity);
    }

    @PostMapping("/ids")
    public List<VehicleEntity> vehiclebyId(@RequestBody VehicleEntity vehicleEntity){
        return this.vehicleService.vehicleDetailById(vehicleEntity);
    }

    @PostMapping("/reqveh")
    public String newVehicleRequest(@RequestBody NewVehicleRequestEntity newVehicleRequestEntity){
        return this.vehicleService.saveRequest(newVehicleRequestEntity);
    }

    @GetMapping("/getvehreq")
    public List<NewVehicleRequestEntity> showVehicleRequest(){
        return this.vehicleService.requestVeh();
    }


    @PutMapping("/updatestatus")
    public String updateRequest(@RequestBody NewVehicleRequestEntity newVehicleRequestEntity){
        this.vehicleService.updateStatus(newVehicleRequestEntity);
        return "success";
    }
    @PutMapping("/reqdec")
    public String requestDecline(@RequestBody NewVehicleRequestEntity newVehicleRequestEntity){
        this.vehicleService.declineRequestStatus(newVehicleRequestEntity);
        return "success";
    }

}
