package lld.parkinglot.vehicletype;

import patterns.factory.VehicleType;

public class Truck extends Vehicle{
    public Truck(String licensePlate){
        super(licensePlate, VehicleType.TRUCK);
    }
}
