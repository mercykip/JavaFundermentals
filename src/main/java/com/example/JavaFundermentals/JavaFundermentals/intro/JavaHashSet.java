package com.example.JavaFundermentals.JavaFundermentals.intro;

import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<String>();
        //add
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("pineapple");
        System.out.println(fruits);
        //check if item exist
        System.out.println("Check if hashset contains :: "+ fruits.contains("orange"));
        System.out.println("Check if hashset contains :: "+ fruits.contains("banana"));
        //size
        System.out.println("number of items :: "+fruits.size());
        //loop
        for (String i:fruits) {
            System.out.println(i);

        }
    }
}
