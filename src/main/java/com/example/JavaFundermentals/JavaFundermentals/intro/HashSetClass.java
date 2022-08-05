package com.example.JavaFundermentals.JavaFundermentals.intro;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet();
        set.add("mango");
        set.add("Orange");
        set.add("apple");
        set.add("lemon");
        for (String s : set) {
            System.out.println(s);
        }

    }
}
