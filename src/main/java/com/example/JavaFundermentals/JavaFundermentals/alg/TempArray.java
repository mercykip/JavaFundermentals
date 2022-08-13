package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.Arrays;

public class TempArray {
    public static void usingTempArr(int[] arr, int k) {
        if(k==0 || k%arr.length==0)
            return;
        k = k%arr.length;

        int[] temp = new int[k];
        System.out.println("Temp");
        for(int i=0; i<k; i++)

            temp[i] = arr[i];
        System.out.println(Arrays.toString(temp));

        System.out.println("Temp 2");
        for(int i=0; i<arr.length-k; i++) {
            arr[i] = arr[k + i];
            System.out.print(arr[i]);
        }

        int j = 0;
        for(int i = arr.length-k; i<arr.length; i++) {
            System.out.println("i&&&&&"+arr[i]);
            arr[i] = temp[j++];
            System.out.println("***"+arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));
        usingTempArr(arr,k);
        System.out.println("Rotated Array using temp approach: ");
        System.out.println(Arrays.toString(arr));
    }
}
