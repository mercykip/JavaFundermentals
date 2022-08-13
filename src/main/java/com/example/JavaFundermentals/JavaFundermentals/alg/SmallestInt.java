package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.Arrays;

public class SmallestInt {
    public static int smallestValue(){
        int[] arr1={1, 3, 6, 4, 1, 2};
        int[] arr={1, 2, 3};
        int smallestInt = 1;

        Arrays.sort(arr);

        if (arr[arr.length - 1] <= 0) return smallestInt;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallestInt) {
                smallestInt++;
                System.out.println("Smallest"+smallestInt);

            }
        }
        return smallestInt;
    }
    public static void main(String[] args) {
        smallestValue();
    }
}
