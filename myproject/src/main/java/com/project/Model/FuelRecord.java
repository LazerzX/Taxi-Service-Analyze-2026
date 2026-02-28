package com.project.Model;

public class FuelRecord {

    private double liters;
    private double cost;
    private double mileage;

    public FuelRecord(double liters, double cost, double mileage) {
        this.liters = liters;
        this.cost = cost;
        this.mileage = mileage;
    }

    public double getLiters() {
        return liters;
    }

    public double getCost() {
        return cost;
    }
}
