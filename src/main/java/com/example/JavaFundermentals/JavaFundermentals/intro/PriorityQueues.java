package com.example.JavaFundermentals.JavaFundermentals.intro;

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Mercy");
        queue.add("jemosop");
        for(String que:queue){
            System.out.print(que + ",");
        }
        queue.remove("Mercy");
        System.out.println();
        for(String que:queue){
            System.out.print(que + ",");
        }
    }
}
