package com.example.JavaFundermentals.JavaFundermentals.intro;

import java.util.HashMap;
import java.util.Map;

public class MapJava {
    public static void main(String[] args) {
        Map<Integer,String>  map=new HashMap<Integer,String> ();
        //Adding elements to map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //comparing
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);  }
}
