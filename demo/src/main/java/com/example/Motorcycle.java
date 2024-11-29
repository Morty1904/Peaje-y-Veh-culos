package com.example;

public class Motorcycle extends Vehicle {

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void calculateToll() {
        this.tollAmount = 50;
    }
}