package com.example.JavaFundermentals.JavaFundermentals.intro;

public class Methods {
    static void bioData(String name) {
        System.out.println( name+ " Mercy");
    }

    static int bioData(int age) {
        return age+2;
    }


    public static void main(String[] args) {
        bioData("jemosop");

        System.out.println(bioData(3));
        int y=bioData(3);
        System.out.println(y);
    }
}
