package com.transport.dao;

import com.transport.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleDao extends JpaRepository<VehicleEntity,Integer> {
    List<VehicleEntity> findByStatus(String status);
    List<VehicleEntity> findByEmpid(int empid);

}
