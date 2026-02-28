package com.project.Model;

public class Vehicle {

    private String plateNumber;
    private String model;
    private DrivingRecord record;

    public Vehicle(String plateNumber, String model) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.record = new DrivingRecord();
    }

    public DrivingRecord getRecord() {
        return record;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}
