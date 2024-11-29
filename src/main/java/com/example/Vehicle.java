package com.example;

public abstract class Vehicle {
    protected String licensePlate;
    protected int tollAmount;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public abstract void calculateToll();

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getTollAmount() {
        return tollAmount;
    }
}