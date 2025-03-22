package lld.parkinglot;


import lld.parkinglot.vehicletype.Vehicle;
import lld.parkinglot.vehicletype.VehicleType;

public class ParkingSpot {

    private int spotNumber ;
    VehicleType vehicleType ;
    Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber, VehicleType vehicleType){
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }


}
