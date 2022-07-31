package com.example.JavaFundermentals.JavaFundermentals.intro;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorClass {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<String>();
        //add
        fruits.add("Delhi");
        fruits.add("Mumbai");
        fruits.add("Kolkata");
        fruits.add("Chandigarh");
        fruits.add("Noida");

        // Get the iterator
        Iterator<String> it = fruits.iterator();
        // Print the first item
        System.out.println(it.next());
        //loop through a collection
        while(it.hasNext()) {
            System.out.print(it.next() + "");
            System.out.println();
        }
    }
}
