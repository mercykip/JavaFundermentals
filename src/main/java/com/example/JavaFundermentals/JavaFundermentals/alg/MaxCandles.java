package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MaxCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Collections.sort(candles);
        int max=Collections.max(candles);
        int count=0;
        for (int i=0; i<candles.size(); i++){
            if(max==candles.get(i)){
                count++;;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        LinkedList<Integer> arr=new LinkedList<>(Arrays.asList(4,4,1,3));
        birthdayCakeCandles(arr);
    }
}
