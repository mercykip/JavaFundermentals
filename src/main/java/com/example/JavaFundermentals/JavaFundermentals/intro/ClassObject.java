package com.example.JavaFundermentals.JavaFundermentals.intro;

public class ClassObject {
    int x;// class attribute
    public ClassObject(){// a class constructor for the ClassObject class
         x=5; // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        ClassObject myObj = new ClassObject();// // Create an object of class ClassObject (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}


class Second {

    public static void main(String[] args) {
        ClassObject myObj = new ClassObject();
        System.out.println(myObj.x);
    }
}
