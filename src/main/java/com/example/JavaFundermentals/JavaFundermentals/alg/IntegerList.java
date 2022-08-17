package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.LinkedList;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {
        int n=1236;
        String a=Integer.toString(n);

        List<Integer> b=new LinkedList<>();
        while(n>0){
            b.add(n%10);
            System.out.println(n%10);
            n /=10;
        }
        String c=String.valueOf(n);
        System.out.println(c);

    }
}
