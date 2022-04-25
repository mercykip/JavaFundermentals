package com.example.JavaFundermentals.JavaFundermentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {

    LinkedList<String> fruits = new LinkedList<>();
    //add
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        System.out.println(fruits);
        //sort numbers
        Collections.sort(fruits);
        System.out.println("for-each loop after sort :: ");
        for(String i:fruits){
            System.out.println(i);
        }
        //get
        System.out.println("index 0 :: "+ fruits.get(0));
        //size
        System.out.println("Array Size :: "+ fruits.size());
        //remove
        fruits.remove(0);
        //get
        System.out.println("index 0 :: "+ fruits.get(0));
        //size
        System.out.println("Array Size :: "+ fruits.size());
        //add first
        fruits.addFirst("lemon");
        //add last
        fruits.addLast("watermelon");
        System.out.println("for-each loop after sort :: ");
        for(String i:fruits){
            System.out.println(i);
        }
        System.out.println("get first :: "+ fruits.getFirst());
        System.out.println("get first :: "+ fruits.getLast());
    }

}
