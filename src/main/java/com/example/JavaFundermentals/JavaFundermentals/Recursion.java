package com.example.JavaFundermentals.JavaFundermentals;

public class Recursion {


   //function to add all of the numbers up to 10.

    public static int sum(int k) {
        if (k > 0) {
//            System.out.println("K :: "+ k + sum(k - 1));

            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    //function to add all of the numbers up to 10.

    public static int sum(int k,int y) {
        if (y > k) {
//            System.out.println("K :: "+ k + sum(k - 1));

            return y + sum(k,y - 1);
        } else {
            return y;
        }
    }
    public static void main(String[] args) {

        int result1 = sum(10);
        int result2 = sum(2,6);
        System.out.println(result1);
        System.out.println(result2);
    }
}
