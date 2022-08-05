package com.example.JavaFundermentals.JavaFundermentals.practice;

public class MultidimentionalArray {

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 11}, {30, 40, 22}, {50, 60, 33}};
        int[][][] arr1 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};


//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++)
//                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
//        }

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    System.out.println("[" + i + "][" + j + "][" + k + "] item " + arr1[i][j][k]);

    }
}
