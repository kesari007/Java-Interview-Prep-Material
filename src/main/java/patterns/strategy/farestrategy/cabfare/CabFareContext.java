package patterns.strategy.farestrategy.cabfare;

public class CabFareContext {

    CabFareStrategy cabFareStrategy;

    public CabFareContext(CabFareStrategy cabFareStrategy){
        this.cabFareStrategy = cabFareStrategy;
    }

    public double calculateFare(double distance, double time){
        return cabFareStrategy.calculateFare(distance, time);
    }
}
