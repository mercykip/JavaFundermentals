package com.example.JavaFundermentals.JavaFundermentals.recursion;

public class Factorial {

    static int fact(int n)
    {
        if (n <= 1) // base case
            return 1;
        else
            System.out.println(n*fact(n-1));
            return n*fact(n-1);
    }
    public static void main(String[] args) {
    int n=  fact(5);
//        System.out.println("fact :: " +n);

    }
}
