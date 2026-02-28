package com.project.Model;

import java.util.ArrayList;

public class DrivingRecord {

    private ArrayList<Trip> trips = new ArrayList<>();
    private ArrayList<FuelRecord> fuels = new ArrayList<>();
    private ArrayList<MaintenanceRecord> maintenances = new ArrayList<>();

    public void addTrip(Trip t) {
        trips.add(t);
    }

    public void addFuel(FuelRecord f) {
        fuels.add(f);
    }

    public void addMaintenance(MaintenanceRecord m) {
        maintenances.add(m);
    }

    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public ArrayList<FuelRecord> getFuels() {
        return fuels;
    }

    public ArrayList<MaintenanceRecord> getMaintenances() {
        return maintenances;
    }
}
