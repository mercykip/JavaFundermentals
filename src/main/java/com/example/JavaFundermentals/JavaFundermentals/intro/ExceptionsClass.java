package com.example.JavaFundermentals.JavaFundermentals.intro;

public class ExceptionsClass {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[ ] args) {
        checkAge(19);
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[2]); // error!
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("System error occurred");
        }finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
