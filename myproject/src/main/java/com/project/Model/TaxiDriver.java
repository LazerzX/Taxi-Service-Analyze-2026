package com.project.Model;

public class TaxiDriver {

    private String driverId;
    private String name;
    private Vehicle vehicle;

    public TaxiDriver(String driverId, String name, Vehicle vehicle) {
        this.driverId = driverId;
        this.name = name;
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getName() {
        return name;
    }
}
