package com.example.JavaFundermentals.JavaFundermentals;

public class Enum {
    enum Gender{
        MALE,
        FEMALE
    }
    public static void main(String[] args) {
        Gender myVar = Gender.MALE;
        System.out.println(myVar);
    }
}
