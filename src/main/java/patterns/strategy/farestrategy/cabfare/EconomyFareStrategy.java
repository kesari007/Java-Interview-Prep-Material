package patterns.strategy.farestrategy.cabfare;

public class EconomyFareStrategy implements CabFareStrategy{

    public static final double BASE_FARE = 10.0;
    public static final double COST_PER_KM = 7.0;
    public static final double COST_PER_MIN = 4.0;

    @Override
    public double calculateFare(double distance, double time){
        return (BASE_FARE + distance*COST_PER_KM + time*COST_PER_MIN);
    }
}
