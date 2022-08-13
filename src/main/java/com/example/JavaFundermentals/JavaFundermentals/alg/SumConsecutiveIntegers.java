package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.List;

public class SumConsecutiveIntegers {
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum=0;
        for(int i=0; i<ar.size(); i++){
            sum+=ar.get(i);
        }
        return sum;

    }
    static int simpleArraySum1(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }
}
