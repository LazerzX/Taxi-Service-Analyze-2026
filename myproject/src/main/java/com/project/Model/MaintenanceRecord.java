package com.project.Model;

import java.time.LocalDate;

public class MaintenanceRecord {

    private String detail;
    private double cost;
    private LocalDate date;

    public MaintenanceRecord(String detail, double cost, LocalDate date) {
        this.detail = detail;
        this.cost = cost;
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public String getDetail() {
        return detail;
    }
}
