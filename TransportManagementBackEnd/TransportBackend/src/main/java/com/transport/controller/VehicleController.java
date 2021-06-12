package com.transport.controller;

import com.transport.entity.NewVehicleRequestEntity;
import com.transport.entity.VehicleEntity;
import com.transport.request.RegisterVehicleRequest;
import com.transport.response.RegisterVehicleResponse;
import com.transport.services.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.transport.util.RestUrls.CROSS_ORIGIN;
import static com.transport.util.RestUrls.REGISTER_VEHICLE;

@RestController
@CrossOrigin(origins = CROSS_ORIGIN)
@Slf4j

public class VehicleController {

    @Autowired
    VehicleService vehicleService;
    @PostMapping(REGISTER_VEHICLE)
    public RegisterVehicleResponse registerVehicle(@RequestBody RegisterVehicleRequest registerVehicleRequest){

        log.info("Request from registerVehicle:"+registerVehicleRequest);
        log.info("Response from registerVehicle:"+vehicleService.registerVehicleService(registerVehicleRequest));
        return vehicleService.registerVehicleService(registerVehicleRequest);
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
