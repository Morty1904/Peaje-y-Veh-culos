package com.example;

public class Truck extends Vehicle {
    private int numAxles;

    public Truck(String licensePlate, int numAxles) {
        super(licensePlate);
        this.numAxles = numAxles;
    }

    @Override
    public void calculateToll() {
        this.tollAmount = numAxles * 50;
    }

    public int getNumAxles() {
        return numAxles;
    }
}