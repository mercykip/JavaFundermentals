package com.example.JavaFundermentals.JavaFundermentals.practice;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] array = new int[length];
        for(int i =0; i<length; i++)
            array[i]= sc.nextInt();
//        for (int i=0; i<length; i++) {
//            System.out.print(array[length - i - 1] + " ");
//        }
        for (int i=length; i>0; i--) {
            System.out.print(array[i-1] + " ");

//            return array[i-1];
        }

    }
}
