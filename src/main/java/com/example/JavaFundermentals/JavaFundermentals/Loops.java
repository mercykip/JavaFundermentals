package com.example.JavaFundermentals.JavaFundermentals;

public class Loops {

    void  whileLoop() {
        System.out.println("While loop executed");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

    }

    void  doWhileLoop() {
        System.out.println("do While loop executed");
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }
        while (i < 5);

    }
    void  forLoop() {
        System.out.println("For loop executed");
        int i;
         for ( i=0; i<5; i++){
             System.out.println(i);
         }
    }
    void  forEachLoop() {
        System.out.println("For Each loop executed");
        String[] fruits={"java","python","c++", "Javascript","Dart"};
        for (String i : fruits) {
            System.out.print(i);
        }
    }
    void  forBreakLoop() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
    void  forContinueLoop() {
        for (int i = 0; i < 6; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Loops loop=new Loops();
//        loop.whileLoop();//output for while loop
//        loop.doWhileLoop();//output for the do while loop
//        loop.forLoop();///output for the for  loop
//        loop.forBreakLoop();///output for the for break loop
        loop.forContinueLoop();///output for the for continue loop
    }

}
