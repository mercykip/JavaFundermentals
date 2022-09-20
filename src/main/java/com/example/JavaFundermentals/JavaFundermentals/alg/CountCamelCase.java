package com.example.JavaFundermentals.JavaFundermentals.alg;

public class CountCamelCase {
    public static int camelcase(String s) {
        // Write your code here
        char[] arr=s.toCharArray();
        int count=0;
        for (char a:arr) {
            if(Character.isUpperCase(a)){
                count++;
            }

        }
        System.out.println(count+1);
        return count + 1;

    }
    public static void main(String[] args) {
        String s="oneTwoThree";
        camelcase(s);
    }
}
