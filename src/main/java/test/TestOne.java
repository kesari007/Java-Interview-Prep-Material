package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestOne {

    private static void findIntersection(int[] A, int[] B, List<Integer> answer){
        int len1 = A.length;
        int len2 = B.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<len1;i++){
            hs.add(A[i]);
        }
        for(int i=0;i<len2;i++){
            if(hs.contains(B[i])){
                answer.add(B[i]);
            }
        }
    }

    public static void main(String[] args){

        // customer id, page id, time - 5gb
        // any customer visiting any page after atleast a day is a repeat customer
        // find list of repeat customers
        int[] A = new int[]{1,2,4,4,4,5,5,5};
        int[] B = new int[]{4,5,5,6,7,8};
        List<Integer> answer = new ArrayList<>();
        findIntersection(A, B, answer);
        System.out.println(answer);


    }
}
