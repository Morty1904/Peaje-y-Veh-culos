package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMotorcycle {
    @Test
    public void testCalculateToll() {
        Motorcycle motorcycle = new Motorcycle("XYZ789");
        motorcycle.calculateToll();
        assertEquals(50, motorcycle.getTollAmount());
    }

    @Test
    public void testLicensePlate() {
        Motorcycle motorcycle = new Motorcycle("LMN123");
        assertEquals("LMN123", motorcycle.getLicensePlate());
    }
}