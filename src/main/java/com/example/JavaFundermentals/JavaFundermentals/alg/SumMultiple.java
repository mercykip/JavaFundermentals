package com.example.JavaFundermentals.JavaFundermentals.alg;

public class SumMultiple {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int sum=0;
        for(int i=0; i< A.length; i++) {
            if (A[i] % 4 == 0)
                sum+=A[i];
        }
        System.out.println(sum);
        return sum;

    }
    public static void main(String[] args) {
        int[] A={-6,-91,1011, -100,84, -22, 0, 1,473};
        solution(A);
    }
}
