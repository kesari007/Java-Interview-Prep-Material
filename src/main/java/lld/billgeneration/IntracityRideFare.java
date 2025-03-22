package lld.billgeneration;

public class IntracityRideFare implements RideTypeFare{
    @Override
    public int calculateRideTypeFare(int fare){
        return fare;
    }
}
