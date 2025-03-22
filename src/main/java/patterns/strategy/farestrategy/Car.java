package patterns.strategy.farestrategy;

public class Car {
    CarType carType;
    String registrationNumber ;

    public Car(CarType carType, String registrationNumber) {
        this.carType = carType;
        this.registrationNumber = registrationNumber;
    }
}
