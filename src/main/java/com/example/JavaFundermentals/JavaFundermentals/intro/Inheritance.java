package com.example.JavaFundermentals.JavaFundermentals.intro;

public class Inheritance extends Person{
    public static void main(String[] args) {
        //create a Inheritance class object
        Inheritance obj=new Inheritance();
        //call the bioData() method from Person class
        obj.bioData();
        System.out.println(obj.name);
    }
}
