package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Design a parking lot
// capacity - 100 cars
// 3 categories - A - costly, B-cheaper, C - more cheaper
// anyone can take any slot irrespective of category till its not full
// if 100 slots are booked now if someone comes and want slot - they will be given on cond
//-> if 100 slots are fulled, we'll ask one of the person to vacate
//-> the vehicle that has to be vacated has to be the cheaper one
// ->  if there are more than 1 person then the one arrived last in parking would be vacating it
// -> if category C person comes up then no one would be vacating
// -> data structure , classes, vacating logic

// class A
public class Main {

    public static void main(String[] args){
        System.out.println("Hello World");


    }
}
