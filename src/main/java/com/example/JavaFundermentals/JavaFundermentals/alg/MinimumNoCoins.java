package com.example.JavaFundermentals.JavaFundermentals.alg;

public class MinimumNoCoins {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        A= new int[]{1, 0, 1, 0, 1, 1, 1};

        int count1 = 0;
        int count0 =0;
        for(int i=0; i<A.length; i++){
            if(i%2 ==0){
                if(A[i]==1){
                    count1++;
                }
                if(A[i]==0){
                    count0++;
                }
            } else{
                if(A[i]==0){
                    count1++;
                }
                if(A[i]==0){
                    count0++;
                }
            }
        }

       return Math.min(count0,count1);
    }
    public static void main(String[] args) {
        int[] A={0,1,1,0};
        int val=solution(A);
        System.out.println(val);
    }
}
