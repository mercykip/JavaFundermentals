package com.example.JavaFundermentals.JavaFundermentals;

enum Gender{
    MALE,
    FEMALE
}

public class Enumcondition {
    public static void main(String[] args) {
        //switch
        System.out.println("Switch enum");
        Gender gender=Gender.FEMALE;
        switch(gender) {
            case FEMALE:
                System.out.println("Female");
                break;
            case MALE:
                System.out.println("Male");
                break;
        }
        System.out.println("Loop enum");
        for (Gender myVar : Gender.values()) {
            System.out.println(myVar);
        }

    }
}
