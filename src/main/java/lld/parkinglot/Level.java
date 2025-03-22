package lld.parkinglot;

import lld.parkinglot.vehicletype.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private int floor;
    private List<ParkingSpot> parkingSpots;

    Level(int floor, int totalSpots){
        this.floor = floor;
        parkingSpots = new ArrayList<>();

        double spotsForBike = 0.5;
        double spotsForCar = 0.4;
        double spotsForTruck = 0.1;

        int bikeSpots = (int) (spotsForBike * totalSpots);
        int carSpots = (int) (spotsForCar * totalSpots);
        int truckSpots = (int) (spotsForTruck * totalSpots);

        for(int i=1;i<=bikeSpots;i++){
            parkingSpots.add(new ParkingSpot(i, VehicleType.BIKE));
        }

        for(int i=bikeSpots+1;i<= bikeSpots+carSpots;i++){
            parkingSpots.add(new ParkingSpot(i, VehicleType.CAR));
        }

        for(int i=bikeSpots+carSpots+1;i<= bikeSpots+carSpots+truckSpots;i++){
            parkingSpots.add(new ParkingSpot(i, VehicleType.TRUCK));
        }

    }
}
