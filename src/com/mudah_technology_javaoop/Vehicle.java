package com.mudah_technology_javaoop;

public class Vehicle {
    private String type;
    private Owner owner;
    private ParkingSpot parkingSpot;
    private Transmission transmission;

    public void moveParkingSpot(ParkingSpot parkingSpot){
        //misal disini ada action to bayar parkir tempat sembelumnya
        this.parkingSpot = parkingSpot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
