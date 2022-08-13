package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.Locale;

public class StringManipulation {
    public static void createString() {
        //string literal (double quotes)
        String a="Mercy";
        String b=new String("Jemosop");
        char ch[]={'s','t','r','i','n','g','s'};
        //converting char array to string
        String c=new String(ch);
        System.out.println(a+" "+b+" "+c);
    }
    public static void caseString() {
        //string literal (double quotes)
        String a="Mercy";
        String b=a.toLowerCase(Locale.ROOT);
        String c=a.toLowerCase();
        String d=a.toLowerCase();
        System.out.println(d+" "+b+" "+c);
        String e=a.toUpperCase(Locale.ROOT);
        String f=a.toUpperCase();
        System.out.println(e+" "+f);
    }
  public static void getItemString() {
        //string literal (double quotes)
        String a="Mercy";
        char b=a.charAt(0);
        int c=a.indexOf('c');
      System.out.println(b+" "+c);
    }
    public static void subString() {
        //string literal (double quotes)
        String a="Mercy";
        String b=a.substring(2,4);
        String d=a.substring(1,3);
        String c=a.substring(2);

      System.out.println(b+" "+c+" "+d);
    }
    public static void stringContains() {
        //string literal (double quotes)
        String a="Mercy";
        String c="Mercy";
        boolean b=a.contains("c");
        if(b){
            System.out.println("Contains");
        }
        if(!a.isEmpty()){
            System.out.println("Not Empty");
        }
        if(a.equals(c)){
            System.out.println("A and C are equal");
        }
    }
    public static void stringReplacement() {
        //string literal (double quotes)
        String a="Mercy";
        String c="Mercy";
        String d=a.replace('c','r');
        System.out.println(d);
        String e=a.replace("Me","Jo");
        System.out.println(e);
    }
    public static void splitString() {
        //string literal (double quotes)
        String a="Mercy";

    }



    public static void main(String[] args) {
//        createString();
//        caseString();
//        getItemString();
//        subString();
//        stringContains();
        stringReplacement();
    }

}
