package com.example.JavaFundermentals.JavaFundermentals.alg;

public class RightStaircase {
    public static void main(String[] args) {
        int row=5;
        for(int i=0; i<row; i++){
            //loop for space
           for (int j=row-1; j>i; j--){
               System.out.print(" ");
           }
            //loop for stars
            for (int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
