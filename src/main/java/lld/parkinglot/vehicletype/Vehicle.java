package lld.parkinglot.vehicletype;

import lombok.Getter;
import patterns.factory.VehicleType;

@Getter
public class Vehicle {
    private final String licensePlate ;
    private final VehicleType type;

    public Vehicle(String licensePlate, VehicleType type){
        this.licensePlate = licensePlate;
        this.type = type;
    }

}
