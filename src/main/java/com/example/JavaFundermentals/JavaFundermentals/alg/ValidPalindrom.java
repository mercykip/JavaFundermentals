package com.example.JavaFundermentals.JavaFundermentals.alg;

public class ValidPalindrom {
    public static boolean isPalindrom(String s){
        String s1="";
        //get only characters from the sentence
//        for (char a: s.toCharArray()){
//            if(Character.isAlphabetic(a) || Character.isDigit(a)){
//                s1 += a;
//            }
//        }
        //get only characters from the sentence regular expression
        s1=s.replaceAll("[^a-zA-Z0-9]", "");
        //convert s1 to the same case
        s1=s1.toUpperCase();
        int startPointer=0;//start character
        int endPointer=s.length()-1; //end character
        while(startPointer <=endPointer){
            if(s1.charAt(startPointer) != s1.charAt(endPointer)){
                return false;
            }
            startPointer ++;
            endPointer --;
        }
        return true;
    }
    public static boolean isPalindrom1(String s){

        //get only characters from the sentence regular expression
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        //convert s1 to the same case
        StringBuilder resultReverse = new StringBuilder(s);
        resultReverse.reverse();
        String rev = resultReverse.toString();
        if(s.equals(rev)) {
            return true;
        }
        else {
            return false;
        }
}
    public static void main(String[] args) {
        isPalindrom("race a car");

    }
}
