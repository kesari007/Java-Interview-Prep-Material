package lld.parkinglot;

public class ParkingLotDemo {

    public static void main(String[] args){
        ParkingLot parkingLot = ParkingLot.getInstance();

        Level levelOne = new Level(1, 10);
        parkingLot.addLevel(levelOne);

        Level levelTwo = new Level(2, 12);
        parkingLot.addLevel(levelTwo);


    }
}
