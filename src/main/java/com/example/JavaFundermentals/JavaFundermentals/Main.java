package com.example.JavaFundermentals.JavaFundermentals;

public class Main {
    int x;// class attribute

    public Main(int y) {// a class constructor for the Main class with parameter
        x = y; // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
//        Main myObj = new Main(5);// // Create an object of class Main (This will call the constructor)
//        System.out.println(myObj.x); // Print the value of x

        Encapsulation myObj = new Encapsulation();

        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }
}
