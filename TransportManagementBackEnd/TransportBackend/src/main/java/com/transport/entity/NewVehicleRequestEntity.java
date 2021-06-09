package com.transport.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewVehicleRequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int vnumber;
    private int empid;
    private int capacity;
    private String type;
    private String requestStatus;


    public NewVehicleRequestEntity(int id, int vnumber,int empid, int capacity, String type, String requestStatus) {
        this.id = id;
        this.vnumber=vnumber;
        this.empid = empid;
        this.capacity = capacity;
        this.type = type;
        this.requestStatus = requestStatus;
    }

    public NewVehicleRequestEntity() {
    }

    public int getVnumber() {
        return vnumber;
    }

    public void setVnumber(int vnumber) {
        this.vnumber = vnumber;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NewVehicleRequestEntity{" +
                "id=" + id +
                ", vnumber=" + vnumber +
                ", empid=" + empid +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                ", requestStatus='" + requestStatus + '\'' +
                '}';
    }
}
