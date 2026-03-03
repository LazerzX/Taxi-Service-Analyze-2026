package com.project.Model;

public class Area {

    private String name;
    private int tripCount;
    private double totalRevenue;
    private double avgFuelConsumption;

    public Area(String name, int tripCount, double totalRevenue, double avgFuelConsumption) {
        this.name = name;
        this.tripCount = tripCount;
        this.totalRevenue = totalRevenue;
        this.avgFuelConsumption = avgFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public int getTripCount() {
        return tripCount;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public double getAvgFuelConsumption() {
        return avgFuelConsumption;
    }

    public double getRevenuePerTrip() {
        if (tripCount == 0) return 0;
        return totalRevenue / tripCount;
    }
}
