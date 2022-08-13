package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long max =0;
        long min =0;
        Collections.sort(arr);
        for (int i = 1; i < arr.size(); i++){
            max += arr.get(i);
        }
        for (int i = 0; i < arr.size()-1; i++){
            min += arr.get(i);
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        List<Integer>  arr=new LinkedList<>(Arrays.asList(1,3,5,7,9));
        miniMaxSum(arr);
    }
}
