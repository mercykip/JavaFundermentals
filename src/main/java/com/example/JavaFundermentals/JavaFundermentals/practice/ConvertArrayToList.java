package com.example.JavaFundermentals.JavaFundermentals.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        String[] array={"Java","Python","PHP","C++"};
        System.out.println("Printing Array: "+ Arrays.toString(array));
        //Converting Array to List
        List<String> list=new ArrayList<String>();
        for (String i:array){
            list.add(i);
        }

        System.out.println("Printing i "+list);
    }
}
