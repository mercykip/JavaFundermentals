package com.example.JavaFundermentals.JavaFundermentals.practice;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;
import java.util.Random;


public class ArrayAlg {

    public static void main(String[] args) {
        int arr[] = {18, 50, 15, 70, 12,6};
        int arr1[] = {18, 50, 15, 70, 12,8};
        int n = arr.length;
        int x = 50;//element to be inserted
        int pos = 4;//position to insert the element
        int i;

        int firstItem = arr[0];
        int lastItem = arr[arr.length - 1];
        int anyValue = arr[new Random().nextInt(arr.length)];

        System.out.println("Random value " + anyValue);
        System.out.println("first Item " + firstItem);
        System.out.println("last Item " + lastItem);

        System.out.println("Elements before insertion");
        for (i = 0; i < n; i++) {
            System.out.println("index at " + i + " is item " + arr[i]);
        }

        //append a new item to an array
        //declare a new larger array
        //copy the elements of the base array to the second one
        int[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[newArray.length - 1] = x;//add to the last item

        //compare two values in an array
        boolean isEqual=Arrays.equals(arr1,arr);
        String message= (isEqual) ? "Array and new array are equal" : "is not equal";
        System.out.println(message);

        //check if an array is empty
        boolean isEmpty = arr == null || arr.length == 0;

        //filter items in an array
        int[] evenArray=Arrays.stream(arr).filter(value -> value % 2 ==0).toArray();
        System.out.println("Even array ");
        System.out.println("Elements after insertion");
        for (i = 0; i < newArray.length; i++) {
            System.out.println("index at " + i + " is item " + newArray[i]);
        }

    }
}
