package com.example.JavaFundermentals.JavaFundermentals.intro;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {

        HashMap<String, String> person = new HashMap<String, String>();
        //Add Items
        person.put("FirstName", "Mercy");
        person.put("LastName", "Jemosop");
        person.put("Gender", "Female");
        person.put("Country", "Kenya");
        person.put("Country", "uganda");
        //get all items
        System.out.println(person);
        //get a single item
        System.out.println("Get item with  key country :: " + person.get("Country"));
        //remove an item
       // person.remove("Gender");
        //get the removed item remove
        System.out.println("Get item with  key gender :: " + person.get("Gender"));
        //get all items
        System.out.println(person);
        //remove all items
        //person.clear();
        //get all items
       // System.out.println(person);
        //get number of items
        System.out.println("Get the number of items :: " + person.size());
        ///loop through to get keys from a hashmap
        System.out.println("Get keys :: ");
        for (String i: person.keySet()) {
            System.out.println(i);
        }
        ///loop through to get values from a hashmap
        System.out.println("Get values :: ");
        for (String i: person.values()) {
            System.out.println(i);
        }
        System.out.println("Get keys and value :: ");
        for (String i: person.keySet()) {
            System.out.println("key :: " +i +" value :: " +person.get(i));
        }

    }
}
