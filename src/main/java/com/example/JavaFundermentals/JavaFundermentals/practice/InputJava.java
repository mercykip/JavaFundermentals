package com.example.JavaFundermentals.JavaFundermentals.practice;

import java.util.Scanner;

public class InputJava {
    //Scanner is a class used to get user input

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        String userAge = myObj.nextLine();  // Read user input
        System.out.println("Age is: " + userAge);  // Output user input
    }
}
