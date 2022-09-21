package com.example.JavaFundermentals.JavaFundermentals.fibonaccci;

public class Fibonacci {

    public int fib(int n) {
        int[] dp= new int[31];
        return fib(n, dp);
    }
    public int fib(int n, int[] dp){
        if(dp[n]!=0)
            return dp[n];
        if(n==0||n==1)
            return n;
        dp[n]=fib(n-1, dp)+fib(n-2, dp);
        return dp[n];
    }
}
