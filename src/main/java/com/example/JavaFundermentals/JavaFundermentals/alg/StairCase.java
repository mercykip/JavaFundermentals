package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.Arrays;

public class StairCase {
  public static  void staitCaseLeft(){
        int n=5;
        for(int i=0; i<n; i++){
                System.out.print(" "); //print space
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println(); //print space

        }
    }

    public static  void test(){
        int n=4;

            for (int j=0; j<n; j++) {
                for(int i=0; i<=j; i++){
                    System.out.print(i);
                }
                System.out.println();
            }
    }
    public static void leftTriangle(){
        int row=5;
        for(int i=0; i<row; i++){
            //loop for space
            for (int j=2*(row-i); j>=0; j--){
                System.out.print(" ");
            }
            //loop for stars
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pyramid(){
        int row=5;
        for(int i=0; i<row; i++){
            //loop for space
            for (int j=row-i; j>1; j--){
                System.out.print(" ");
            }
            //loop for stars
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void diamond(){
        int row=5;
        int space=row-1;
        for(int i=1; i<row; i++){
            //loop for space
            for (int j=1; j<=space; j++){
                System.out.print("&");
            }
            space--;
            //loop for stars
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space=1;
        for (int j = 1; j<= row - 1; j++)
        {
            for (int i = 1; i<= space; i++)
            {
                System.out.print("&");
            }
            space++;
            for (int i = 1; i<= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }


    public static void main(String[] args) {

        staitCaseLeft();
        leftTriangle();
        pyramid();
        diamond();;
    }
}
