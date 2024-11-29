package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCar {
    @Test
    public void testCalculateToll() {
        Car car = new Car("ABC123");
        car.calculateToll();
        assertEquals(100, car.getTollAmount());
    }

    @Test
    public void testLicensePlate() {
        Car car = new Car("DEF456");
        assertEquals("DEF456", car.getLicensePlate());
    }
}