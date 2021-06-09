package com.transport.dao;

import com.transport.entity.NewVehicleRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRquestDao extends JpaRepository<NewVehicleRequestEntity , Integer> {
    NewVehicleRequestEntity findByEmpidAndVnumber(int emdid,int vnumber);
    Integer deleteByEmpidAndVnumber(Integer empid,Integer vnumber);
}
