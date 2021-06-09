package com.transport.services;

import com.transport.dao.UserDao;
import com.transport.dao.VehicleDao;
import com.transport.dao.VehicleRquestDao;
import com.transport.entity.NewVehicleRequestEntity;
import com.transport.entity.UserEntity;
import com.transport.entity.VehicleEntity;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope
@Transactional
public class VehicleService {

    @Autowired
    VehicleDao vehicleDao;
    @Autowired
    VehicleRquestDao vehicleRquestDao;
    VehicleEntity vehicleEntity;
    NewVehicleRequestEntity vehicleRequest;

    public String registerVehicleService(VehicleEntity vehicleEntity) {
        vehicleDao.save(vehicleEntity);
        return "success";
    }

    public List<VehicleEntity> vehicleDetailsFromDB() {

        return vehicleDao.findAll();
    }

    public List<VehicleEntity> vehicleDetailByStatus(VehicleEntity vehicleEntity) {

        return vehicleDao.findByStatus(vehicleEntity.getStatus());
    }

    public List<VehicleEntity> vehicleDetailById(VehicleEntity vehicleEntity) {
        return vehicleDao.findByEmpid(vehicleEntity.getEmpid());

    }

    public String saveRequest(NewVehicleRequestEntity newVehicleRequestEntity) {
        this.vehicleRquestDao.save(newVehicleRequestEntity);
        return "success";
    }

    public List<NewVehicleRequestEntity> requestVeh() {
        return this.vehicleRquestDao.findAll();
    }


    public String updateStatus(NewVehicleRequestEntity newVehicleRequestEntity) {

        int empid = newVehicleRequestEntity.getEmpid();
        int vnumber = newVehicleRequestEntity.getVnumber();

        vehicleEntity = vehicleDao.getById(vnumber);
        if (vnumber == vehicleEntity.getVnumber()) {
            vehicleEntity.setStatus("occupied");
            vehicleEntity.setEmpid(empid);
            vehicleDao.save(vehicleEntity);

        }

        System.out.println("updation done");
        String res=deleteRecord(newVehicleRequestEntity);
        return res;
    }

    public String deleteRecord(NewVehicleRequestEntity newVehicleRequestEntity) {
        int empid=newVehicleRequestEntity.getEmpid();
        int vnumber=newVehicleRequestEntity.getVnumber();
        System.out.println(empid+" "+vnumber);
        System.out.println("in delete");
        vehicleRequest = vehicleRquestDao.findByEmpidAndVnumber(empid,vnumber);
        if (empid == vehicleRequest.getEmpid() && vnumber == vehicleRequest.getVnumber()) {
//           vehicleRequest.setRequestStatus("occupied");
         //    vehicleRquestDao.;
           vehicleRquestDao.deleteByEmpidAndVnumber(vehicleRequest.getEmpid(),vehicleRequest.getVnumber());

        }
        return "done";
    }

    public String declineRequestStatus(NewVehicleRequestEntity newVehicleRequestEntity){
        int empid=newVehicleRequestEntity.getEmpid();
        int vnumber=newVehicleRequestEntity.getVnumber();
        vehicleRequest = vehicleRquestDao.findByEmpidAndVnumber(empid,vnumber);
        if (empid == vehicleRequest.getEmpid() && vnumber == vehicleRequest.getVnumber()) {
           vehicleRequest.setRequestStatus("decline");
           vehicleRquestDao.save(vehicleRequest);

        }
        return "done";
    }
}


