package javaexamples;

class Car implements Comparable<Car> {
    String carName;
    String carType;
    Integer carNumber;

    public Car(String carName, String carType, int carNumber) {
        this.carName = carName;
        this.carType = carType;
        this.carNumber = carNumber;
    }

    // Implementing Comparable - sorting based on carNumber
    @Override
    public int compareTo(Car other) {
        return this.carNumber.compareTo(other.carNumber);// Ascending order
    }
}
