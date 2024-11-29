package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTollStation {
    @Test
    public void testProcessVehicle() {
        TollStation station = new TollStation("Central", "Metropolis");
        Car car = new Car("CAR123");
        car.calculateToll();
        station.processVehicle(car);

        assertEquals(100, station.getTotalCollected());
    }

    @Test
    public void testProcessMultipleVehicles() {
        TollStation station = new TollStation("West Gate", "Gotham");
        Car car = new Car("CAR456");
        Motorcycle motorcycle = new Motorcycle("MOTO123");
        Truck truck = new Truck("TRUCK789", 3);

        car.calculateToll();
        motorcycle.calculateToll();
        truck.calculateToll();

        station.processVehicle(car);
        station.processVehicle(motorcycle);
        station.processVehicle(truck);

        assertEquals(300, station.getTotalCollected());
    }
}