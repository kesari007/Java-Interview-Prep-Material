package lld.billgeneration;

public class PremiumFare implements Fare{

    @Override
    public int calculateFare(int distance){
        return distance*8;
    }
}
