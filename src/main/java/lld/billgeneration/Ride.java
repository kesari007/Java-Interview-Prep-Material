package lld.billgeneration;

public class Ride {
    RideType rideType;
    int sourceValue;
    int destinationValue;

    public Ride(Car car, RideType type, int source, int destination){
        this.rideType = type;
        this.sourceValue = source;
        this.destinationValue = destination;
    }
    public int calulateFair(Car car){
        int finalFare = 0;
        int totalCarFare ;
        CarType carType = car.carType;
        int totalDistance = getTotalDistance(sourceValue, destinationValue);
        switch(carType){
            case LUXURY :
                totalCarFare = new LuxuryFare().calculateFare(totalDistance);
            case PREMIUM:
                totalCarFare = new PremiumFare().calculateFare(totalDistance);
            default:
                totalCarFare = 0;
        }
        switch (rideType){
            case OUTSTATION:
                finalFare = new OutstationRideFare().calculateRideTypeFare(totalCarFare);
            case INTRACITY:
                finalFare = new IntracityRideFare().calculateRideTypeFare(totalCarFare);
            default:
                finalFare = 0;
        }
        return finalFare;

    }

    private int getTotalDistance(int source, int destination){
        if(source < 0 || destination < 0 ){
            // throw an error
        }
        return Math.abs(destination - source);
    }
}
