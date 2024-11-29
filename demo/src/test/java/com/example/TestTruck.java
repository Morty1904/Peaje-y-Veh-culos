package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTruck {
    @Test
    public void testCalculateTollWithTwoAxles() {
        Truck truck = new Truck("GHI456", 2);
        truck.calculateToll();
        assertEquals(100, truck.getTollAmount());
    }

    @Test
    public void testCalculateTollWithFourAxles() {
        Truck truck = new Truck("JKL789", 4);
        truck.calculateToll();
        assertEquals(200, truck.getTollAmount());
    }

    @Test
    public void testLicensePlate() {
        Truck truck = new Truck("OPQ123", 3);
        assertEquals("OPQ123", truck.getLicensePlate());
    }

    @Test
    public void testGetNumAxles() {
        Truck truck = new Truck("RST456", 5);
        assertEquals(5, truck.getNumAxles());
    }
}