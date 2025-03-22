package lld.billgeneration;

public class OutstationRideFare implements RideTypeFare{
    @Override
    public int calculateRideTypeFare(int fare) {
        return fare * 2;
    }
}
