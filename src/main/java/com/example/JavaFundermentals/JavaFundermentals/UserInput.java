package com.example.JavaFundermentals.JavaFundermentals;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Your name is: " + userName);  // Output user input
    }
}
