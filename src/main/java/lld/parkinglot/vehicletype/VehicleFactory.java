package lld.parkinglot.vehicletype;

import patterns.factory.VehicleType;

public class VehicleFactory {

    public static Vehicle getVehicle(String licensePlate,VehicleType type){
        switch (type){
            case CAR:
                return new Car(licensePlate);
            case TRUCK:
                return new Truck(licensePlate);
            case BIKE:
                return new Bike(licensePlate);
            default:
                return null;
        }
    }
}
