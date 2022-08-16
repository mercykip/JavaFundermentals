package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToInteger {
    public static int romanToInt(String s) {
        int len= s.length();
        System.out.println("len  "+len);
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        //value that corresponds to the last character of the string
        int result=map.get(s.charAt(s.length()-1));
        //iterate over the string starting from the second last character
        for(int i=s.length()-2; i>0; i--){
            System.out.println("i :: "+ map.get(s.charAt(i)));
            System.out.println("i +1:: "+ map.get(s.charAt(i+1)));
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                System.out.println("sub");
                result+=map.get(s.charAt(i));
            }else {
                System.out.println("add");
                result += map.get(s.charAt(i));
            }
        }

//        System.out.println(result);


            return result;

    }
    public static void main(String[] args) {
        String s = "LVIII";
        romanToInt(s);

    }
}
