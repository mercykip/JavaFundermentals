package com.example.JavaFundermentals.JavaFundermentals.search;

//Given an array arr[] of N elements, the task is to write a function to search a given element x in arr[].
public class LinearSearch {
    public static int search(int arr[], int x) {
        int n= arr.length;
       for(int i=0; i<n; i++){

            if (arr[i] == x) return i;

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        search(arr, x);
        int result = search(arr, x);
        String message = (result == -1) ? "Element not found in the array" : "Element found at index " + result;
        System.out.println(message);
    }
}
