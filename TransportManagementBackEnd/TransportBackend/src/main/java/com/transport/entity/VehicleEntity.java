package com.transport.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleEntity {
        @Id
        private int vnumber;
        private int capacity;
        private String type;
        private String status;

    public VehicleEntity(int vnumber, int capacity, String type, String status) {
        this.vnumber = vnumber;
        this.capacity = capacity;
        this.type = type;
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VehicleEntity() {
    }

    public int getVnumber() {
        return vnumber;
    }

    public void setVnumber(int vnumber) {
        this.vnumber = vnumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VehicleEntity{" +
                "vnumber=" + vnumber +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
