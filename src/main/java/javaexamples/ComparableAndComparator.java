package javaexamples;

import java.util.Arrays;
import java.util.Comparator;


public class ComparableAndComparator {
    // Used to sort the objects (Can only sort based on some string values like - carName, carType etc).
    // Comparable uses compareTo method and Comparator uses compare(Obj1, Obj2) method.
    // Comparable and comparator are both functional interfaces with above-mentioned abstract methods.
    public  static void main(String[] args){
        Car c1 = new Car("CAR1", "DIESEL", 1);
        Car c2 = new Car("CAR2", "PETROL", 2);
        Car c3 = new Car("CAR3", "EV", 5);

        Car[] carList = new Car[]{c1,c2, c3};
        //comparable
        Arrays.sort(carList);

        //comparator
        //Arrays.sort(carList, new CarComparator());

        for(Car c : carList){
            System.out.println(c.carNumber);
        }
    }
}
