package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToInteger {
    public static int romanToInt(String s) {
        int len= s.length();
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=0;
        for(int i=0; i<len; i++){
            result+=map.get(s.charAt(i));
        }

        System.out.println(result);


            return result;

    }
    public static void main(String[] args) {
        String s = "LVIII";
        romanToInt(s);

    }
}
