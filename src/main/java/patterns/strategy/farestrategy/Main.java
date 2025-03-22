package patterns.strategy.farestrategy;

import patterns.strategy.farestrategy.cabfare.CabFareContext;
import patterns.strategy.farestrategy.cabfare.EconomyFareStrategy;
import patterns.strategy.farestrategy.cabfare.LuxuryFareStrategy;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(CarType.LUXURY, "UP32LS3245");

        CabFareContext context = new CabFareContext(myCar.carType == CarType.LUXURY ? new LuxuryFareStrategy() : new EconomyFareStrategy());
        System.out.println(context.calculateFare(5, 4));


    }
}
