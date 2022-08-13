package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRatio {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pos = 0,neg=0,zero=0;
        int no=arr.size();
        System.out.println("Size"+no);
        for(int a: arr){
            System.out.println(a);
            if(a<0){
                neg++;

            }else if(a> 0){
                pos++;
            }else{
                zero++;
            }
        }
        double posValue = (double)pos/no;
        double negValue = (double)neg/no;
        double zeroValue = (double)zero/no;

        System.out.println(posValue);
        System.out.println(negValue);
        System.out.println(zeroValue);
    }


        public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(-4, 3, -9, 0, 4, 1));
            plusMinus(arr);

    }
}
