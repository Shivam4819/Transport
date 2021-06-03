package com.transport.services;

import com.transport.dao.VehicleDao;
import com.transport.entity.VehicleEntity;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleDao vehicleDao;

    VehicleEntity vehicleEntity;
    public String registerVehicleService(VehicleEntity vehicleEntity){
        vehicleDao.save(vehicleEntity);
        return "job done";
    }

    public List<VehicleEntity> vehicleDetailsFromDB(){

        return vehicleDao.findAll();
    }



    public List<VehicleEntity> specificVehicleDetail(VehicleEntity vehicleEntity){

        return vehicleDao.findByStatus(vehicleEntity.getStatus());

    }
}


