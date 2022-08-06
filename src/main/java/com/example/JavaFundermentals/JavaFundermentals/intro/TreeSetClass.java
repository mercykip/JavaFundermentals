package com.example.JavaFundermentals.JavaFundermentals.intro;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        //Traversing elements
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Lowest Value: "+set.pollFirst());
        System.out.println("Highest Value: "+set.pollLast());
    }
}
