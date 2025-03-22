package test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ParkingLot {
    private final int capacity = 100;
    private List<ParkingSlot> parkingSlots ;
    HashMap<Category, List<Pair>> countMap;

    public boolean parkVehicle(Category category){
        if(capacity <= 100){
            parkingSlots.add(new ParkingSlot(category, System.currentTimeMillis()));
            return true;
        } else {
            if(Category.CATEGORY_C.equals(category)){
                System.out.println("Cant accomodate category C person");
                return false ;
            }

            else{
                // evictionLogic
                if (countMap.containsKey(Category.CATEGORY_C)) {
                    List<Pair> getListC = countMap.get(Category.CATEGORY_C);
                    getListC.remove(0);
//                    countMap.put(Category.CATEGORY_C, );
                }
                return true;
            }

        }
    }

    private void evictionLogic(Category category){
        //finding the total slots in each category
        List<Pair> indexOfA = new ArrayList<>();
        List<Pair> indexOfB = new ArrayList<>();
        List<Pair> indexOfC = new ArrayList<>();
        for(ParkingSlot slot : parkingSlots){
            if(slot.equals(Category.CATEGORY_A)){
                indexOfA.add(new Pair(parkingSlots.indexOf(slot), System.currentTimeMillis()));
            } else if(slot.equals(Category.CATEGORY_B)){
                indexOfB.add(new Pair(parkingSlots.indexOf(slot), System.currentTimeMillis()));
            } else {
                indexOfC.add(new Pair(parkingSlots.indexOf(slot), System.currentTimeMillis()));
            }
        }

//        Collections.sort(indexOfA, (Pair o1, Pair o2) -> o2.getTimeStamp().compareTo(o1.getTimeStamp()));
//        Collections.sort(indexOfB, (Pair o1, Pair o2) -> o2.getTimeStamp().compareTo(o1.getTimeStamp()));
//        Collections.sort(indexOfC, (Pair o1, Pair o2) -> o2.getTimeStamp().compareTo(o1.getTimeStamp()));
        countMap.put(Category.CATEGORY_A, indexOfA);//sorted list
        countMap.put(Category.CATEGORY_B, indexOfB);
        countMap.put(Category.CATEGORY_C, indexOfC);
    }
}
