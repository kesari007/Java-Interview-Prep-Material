package javaexamples;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return c2.carNumber - c1.carNumber; // Sorting in descending order based on rank
    }
}
