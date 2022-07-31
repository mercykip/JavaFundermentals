package com.example.JavaFundermentals.JavaFundermentals.search;

///Given a sorted array arr[] of n elements, write a function to search a given element x in arr[] and return the index of x in the array
public class BinarySearch {
    public static int search(int arr[], int x, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            //check if element is present at the middle position
            if (arr[mid] == x)
                return mid;

            //check of element is smaller than mid, then it can only be present on the left side of the array
            if (arr[mid] > x)
                return search(arr, x, low, mid - 1);
            //else the element can only be present in the right sub array
            return search(arr, x, mid+1, high);

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = search(arr, x, 0, n-1);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);

    }
}
