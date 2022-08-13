package com.example.JavaFundermentals.JavaFundermentals.alg;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays1 {

    //Approach1
    public static Integer[] insertX1(int n, Integer arr1[],
                                     int x, int pos) {
        //Convert array to arraylist
        List<Integer> al = new ArrayList<Integer>(Arrays.asList(arr1));
        //add element at position
        al.add(pos - 1, x);

        //convert the arrayList back to array
        arr1 = al.toArray(arr1);

        //convert arraylist to array
        Integer[] arr2 = new Integer[al.size()];
        arr2 = al.toArray(arr2);

        return arr2;
    }

    //Approach2
    public static int[] insertX(int n, int arr[],
                                int x, int pos) {
        //insert an element into an array
        int newarr[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i < pos - 1) {
                newarr[i] = arr[i];
            } else if (i == pos - 1) {
                newarr[i] = x;
            } else {
                newarr[i] = arr[i - 1];
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        int[] arr = {18, 30, 15, 70, 12};
        Integer[] arr1 = {18, 30, 15, 70, 12};
        int x = 40;//new element
        int n = 5;
        int pos = 2;//position to insert the new element

        System.out.println("Elements of the array are:\n");
        for (int i = 0; i < 5; i++) {
            System.out.print("Index " + i + " value " + arr[i]+" ");
        }

        arr = insertX(n, arr, x, pos);
        arr1 = insertX1(n, arr1, x, pos);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        //Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] temp = new int[arr3.length];
        int d = 2;

        System.out.println("Temp 1 array :: ");
        for (int i = d; i < arr3.length; i++) {
              temp[i] = arr3[i];
        }

        System.out.println("\n Temp 2 array :: ");
        for (int i = 0; i < d; i++) {
            temp[i] = arr3[i];
        }

        //copy the contents of temp[] to arr[]
        System.out.println("\n Final array :: ");

        for(int i=0; i< 5; i++){
            arr3[i]= temp[i];
        }
         //join the values from the two loops
        for(int i=0; i< 5; i++){
            arr3[i]= temp[i];
        }

    }
}
