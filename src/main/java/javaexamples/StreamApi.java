package javaexamples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApi {

    public static void main(String[] args) {
        // Find the maximum length of the longest string using streams
//        List<String> strings = Arrays.asList("helo", "hello", "ankurkesharwani", "aniket");
//        Optional<String> longestString = strings.stream().max(Comparator.comparingInt(String::length));
//        System.out.println("Longest string length: " + longestString.map(String::length).orElse(0));
//
//        // Find the square root of all elements in an array
//        List<Integer> numbers = Arrays.asList(2, 7, 4, 5, 6);
//        List<Double> squareRoots = numbers.stream().map(Math::sqrt).collect(Collectors.toList());
//        System.out.println("Square roots: " + squareRoots);
//
//        // Find the sum of all elements in an array
//        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
//        System.out.println("Sum: " + sum);
//
//        // Find the sum of all positive integers in an array
//        Integer[] positiveNumbers = {4, -8, -1, 20, -2};
//        int positiveSum = Arrays.stream(positiveNumbers).filter(x -> x > 0).mapToInt(Integer::intValue).sum();
//        System.out.println("Sum of positive numbers: " + positiveSum);
//
//        // Find the sum of all positive integers in a primitive array
//        int[] primitiveArray = {1, -8, -1, 2, -2};
//        int primitiveSum = IntStream.of(primitiveArray).filter(n -> n > 0).sum();
//        System.out.println("Sum of positive numbers in primitive array: " + primitiveSum);
//
//        // Print all numbers between 1 and 10 but skip 5
//        IntStream.range(1, 11).filter(x -> x != 5).forEach(System.out::print);
//
//        // Determine the sum of a range of integers
//        int rangeSum = IntStream.range(1, 10).sum();
//        System.out.println("Sum of range: " + rangeSum);
//
//        // Stream a list of names, sort them, and print the first name in the sorted list
//        List<String> names = Arrays.asList("Ankur", "Kesharwani", "Aniket", "Pranav", "Nigam");
//        String firstSortedName = names.stream().sorted().findFirst().orElse("");
//        System.out.println("First sorted name: " + firstSortedName);
//
//        // Find the average of the squares of an integer array
//        int[] array = {2, 3, 4};
//        double average = IntStream.of(array).map(n -> n * n).average().orElse(0);
//        System.out.println("Average of squares: " + average);
//
//        // Find the cube root of all elements in an array
//        List<Double> cubeRootArray = Arrays.asList(3.14, 6.78, 4.32);
//        List<Double> cubeRoots = cubeRootArray.stream().map(Math::cbrt).collect(Collectors.toList());
//        System.out.println("Cube roots: " + cubeRoots);


        Person p1 = new Person(17, "Kesharwani");
        Person p2 = new Person(20, "Aniket");
        Person p3 = new Person(22, "Ankur");
        Person p5 = new Person(18, "Nigam");
        List<Person> people = Arrays.asList(p1, p2, p3, p5);
        HashMap<String, List<String>> hmap = new HashMap<>();
        hmap.values();
        //Map<Integer, String> adults = people.stream().filter(p -> p.age >= 18).collect(Collectors.groupingBy(Person::getAge, Person::getName, (old value) -> newvalue));
        //System.out.println(adults);
    }
}