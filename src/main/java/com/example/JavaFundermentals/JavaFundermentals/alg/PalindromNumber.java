package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.LinkedList;
import java.util.List;

public class PalindromNumber {
    public static boolean isPalindrom(int x) {
        String s = Integer.toString(x);
        int startPointer = 0;
        int endPointer = s.length() - 1;

        while (startPointer <= endPointer) {
            if (s.charAt(startPointer) != s.charAt(endPointer)) {
                System.out.println(false);
                return false;
            }
            startPointer++;
            endPointer--;
        }
        System.out.println(true);
        return true;
    }

    public static boolean isPalindrom1(int x){
        List<Integer> s=new LinkedList<Integer>();
        while(x>0){
            s.add(x%10);
            x /=10;
        }
        int startPointer=0;
        int endPointer=s.size()-1;

        while(startPointer <= endPointer){
            if(s.get(startPointer) != s.get(endPointer)){
                System.out.println(false);
                return false;
            }
            startPointer ++;
            endPointer --;
        }
        System.out.println(true);
        return  true;

    }
    public static void main(String[] args) {
        isPalindrom(1211);
    }
}
