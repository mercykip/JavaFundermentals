package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static void leftRotation(int[] arr, int k) {
        if (k == 0 || k % arr.length == 0) return;
        k = k % arr.length;

        for (int i = 0; i < k; i++) {
            int firstElement = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
//                System.out.print(arr[j + 1] + ",");
            }
            arr[arr.length - 1] = firstElement;
            System.out.println(Arrays.toString(arr));
        }

    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int count = 0;
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i=0;i<d;i++)
        {
            tempList.add(arr.get(i));
        }
        int len = arr.size();
        for(int i=d;i<len;i++)
        {

            arr.set(count, arr.get(i));
            count++;
        }

        for(int i: tempList)
        {
            arr.set(count++,i);
        }
        return arr;
    }

    public static void rightRotation(int[] arr, int k) {
//        if (k == 0 || k % arr.length == 0) return;
//        k = k % arr.length;

        for (int i = 0; i < k; i++) {
            int firstElement = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
//                System.out.print(arr[j + 1] + ",");
            }
            arr[0] = firstElement;
            System.out.println(Arrays.toString(arr));
        }

    }

    public static void main(String[] args) {
        //initialize array
        int[] arr = {1, 2, 3, 4, 5};
        //index to rotate from
        int k = 2;
        //print original array
        leftRotation(arr,k);
        rightRotation(arr, k);

    }
}
