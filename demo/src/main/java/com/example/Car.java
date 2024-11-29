package com.example;

public class Car extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void calculateToll() {
        this.tollAmount = 100;
    }
}