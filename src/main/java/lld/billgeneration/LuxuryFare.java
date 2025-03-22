package lld.billgeneration;

public class LuxuryFare implements Fare{
    @Override
    public int calculateFare(int distance) {
        return distance * 12 ;
    }
}
