package com.project.Model;

public class Trip {

    private String tripId;
    private double distance;
    private double duration;
    private int overSpeedCount;

    private double income;
    private Area area;
    private TimePeriod timePeriod;

    public Trip(String tripId,
                double distance,
                double duration,
                int overSpeedCount,
                double income,
                Area area,
                TimePeriod timePeriod) {

        this.tripId = tripId;
        this.distance = distance;
        this.duration = duration;
        this.overSpeedCount = overSpeedCount;
        this.income = income;
        this.area = area;
        this.timePeriod = timePeriod;
    }

    public double getDistance() {
        return distance;
    }

    public double getAverageSpeed() {
        return distance / duration;
    }

    public int getOverSpeedCount() {
        return overSpeedCount;
    }

    public double getIncome() {
        return income;
    }

    public Area getArea() {
        return area;
    }

    public TimePeriod getTimePeriod() {
        return timePeriod;
    }
}
