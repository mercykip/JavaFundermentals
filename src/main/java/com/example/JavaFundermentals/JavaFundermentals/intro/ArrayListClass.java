package com.example.JavaFundermentals.JavaFundermentals.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        //add
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");

        //treversing through a list
        Iterator<String> itr= fruits.iterator();
        while(itr.hasNext()){  //check if iterator has elements
            System.out.print(itr.next()+" ");//printing element and moving to next
        }

        ListIterator<String> ls= fruits.listIterator(fruits.size());
        while(ls.hasPrevious()){
            String str=ls.previous();
            System.out.print(str +" ");
        }
        fruits.forEach(a->
                        System.out.print(a +" ")
                );


        System.out.println(fruits);
        //get
        System.out.println("index 0 :: "+ fruits.get(0));
        //set
        fruits.set(0, "mango modified");
        //get
        System.out.println("index 0 :: "+ fruits.get(0));
        //size
        System.out.println("Array Size :: "+ fruits.size());
        //remove
        fruits.remove(0);
        //get
        System.out.println("index 0 after remove :: "+ fruits.get(0));
        //size
        System.out.println("Array Size :: "+ fruits.size());

        //for loop
        System.out.println("for loop :: ");
        for(int i=0; i< fruits.size(); i++){
            System.out.println(fruits.get(i));
        }
        //for-each loop
        System.out.println("for-each loop :: ");
        for(String i:fruits){
            System.out.println(i);
        }
        //sort numbers
        Collections.sort(fruits);
        System.out.println("for-each loop after sort :: ");
        for(String i:fruits){
            System.out.println(i);
        }
    }
}
