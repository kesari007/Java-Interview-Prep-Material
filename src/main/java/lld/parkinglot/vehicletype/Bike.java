package lld.parkinglot.vehicletype;

import patterns.factory.VehicleType;

public class Bike extends Vehicle{
    public Bike(String licensePlate){
        super(licensePlate, VehicleType.BIKE);
    }
}
