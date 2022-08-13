package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareElements {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int leftToRightSum = 0;
        int rightToLeftSum = 0;

        int topRight = arr.size() - 1;
        System.out.println(arr.size());
        for(int i = 0; i < arr.size(); i++) {
            leftToRightSum += arr.get(i).get(i);
            System.out.println(leftToRightSum);
            rightToLeftSum += arr.get(i).get(topRight - i);
        }

        return Math.abs(leftToRightSum - rightToLeftSum);

    } // end diagonalDifference method


    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12));

      int value=  diagonalDifference(arr);
        System.out.println(value);

    }
}
