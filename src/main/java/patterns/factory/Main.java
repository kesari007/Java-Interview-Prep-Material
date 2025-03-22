package patterns.factory;

public class Main {
    /**
     * In factory pattern, we create objects without exposing the logic to client and refer to newly created object using a common interface.
     * Tomorrow if a new vehicle comes, we can add it to the factory without changing the client code
     *
     * Suppose if there were 50 places where CAR and Truck objects were instantiated directly without factory and tomorrow
     * there is a need to change it to Bike then we have to change it in 50 places. But using factory, we just need to change it in one place
     * in the factory itself.
     * @param args
     */
    public static void main(String[] args){

        Vehicle car = VehicleFactory.getVehicle(VehicleType.CAR);
        if(car!=null){
            car.drive();
        }
        Vehicle truck = VehicleFactory.getVehicle(VehicleType.TRUCK);
        if(truck != null){
            truck.drive();
        }

    }
}
