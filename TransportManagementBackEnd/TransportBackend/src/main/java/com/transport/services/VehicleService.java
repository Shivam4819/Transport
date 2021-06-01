package com.transport.services;

import com.transport.dao.VehicleDao;
import com.transport.entity.VehicleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    VehicleDao vehicleDao;
    public String registerVehicleService(VehicleEntity vehicleEntity){
        vehicleDao.save(vehicleEntity);
        return "job done";
    }
}


