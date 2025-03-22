package patterns.factory;

public class VehicleFactory {
    static Vehicle getVehicle(VehicleType type){
        switch (type){
            case CAR:
                return new Car();
            case TRUCK:
                return new Truck();
            case BIKE:
                return new Bike();
            default:
                return null;
        }
    }
}
