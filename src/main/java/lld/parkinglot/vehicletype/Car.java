package lld.parkinglot.vehicletype;

import patterns.factory.VehicleType;

public class Car extends Vehicle{
    public Car(String licensePlate){
        super(licensePlate, VehicleType.CAR);
    }
}
