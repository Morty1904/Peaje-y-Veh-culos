package com.example;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name;
    private String city;
    private int totalCollected;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
        this.vehicles = new ArrayList<>();
    }

    public int getTotalCollected(){
        return totalCollected;
    }

    public void processVehicle(Vehicle vehicle) {
        vehicle.calculateToll();
        totalCollected += vehicle.getTollAmount();
        vehicles.add(vehicle);
    }

    public void printReport() {
        System.out.println("Toll Station: " + name + " | City: " + city);
        System.out.println("Vehicles Processed:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("License Plate: " + vehicle.getLicensePlate() + 
                               " | Toll Amount: $" + vehicle.getTollAmount());
        }
        System.out.println("Total Collected: $" + totalCollected);
    }
}