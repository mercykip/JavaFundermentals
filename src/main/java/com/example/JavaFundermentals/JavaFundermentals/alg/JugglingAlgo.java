package com.example.JavaFundermentals.JavaFundermentals.alg;

public class JugglingAlgo {
    public static void juggling(int[] arr, int k) {
        if (k == 0 || k % arr.length == 0)
            return;

        k = k % arr.length;// number of rotations to be perfomed
        int n = arr.length;//length of array
        int gcd = gcd(n, k);



    }
    //function to calculate gcd(n,k)
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int gcd = gcd(6, 3);
        System.out.println("GCD"+gcd);
    }
}
