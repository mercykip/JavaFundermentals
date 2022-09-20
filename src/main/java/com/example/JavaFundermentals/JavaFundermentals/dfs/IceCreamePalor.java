package com.example.JavaFundermentals.JavaFundermentals.dfs;

import java.util.*;
//Two friends like to pool their money and go to the ice cream parlor. They always choose two distinct flavors and they spend all of their money.
//Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.
public class IceCreamePalor {

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        if(arr.size()<1 || (arr ==null)){
            return null;
        }
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)<m){
                if(hashMap.containsKey(m- arr.get(i))){
                    int index=hashMap.get(m-arr.get(i));
                        System.out.println((index + 1) + " " + (i + 1));
                        return arr;
                    }
                if(!hashMap.containsKey(arr.get(i))){
                    hashMap.put(arr.get(i), i);
                }
            }

        }
        return arr;
    }

    public static List<Integer> icecreamParlor2(int m, List<Integer> arr) {
        // Write your code here
        List<Integer> results = new ArrayList();

        // O(n)
        Map<Integer, Integer> numsIndex = new HashMap();
        for (int i=0; i< arr.size(); i++) {
            int i1 = i+1;
            int n = arr.get(i);

            int otherN = m-n;
            if (numsIndex.containsKey(otherN)) {
                int otherIndex = numsIndex.get(otherN);
                // System.out.printf("a:%d @ %d b:%d @ %d \n",n,i1,otherN,otherIndex);
                if (i1 <= otherIndex) {
                    results.add(i1);
                    results.add(otherIndex);
                } else {
                    results.add(otherIndex);
                    results.add(i1);
                }
            }
            // after search or we get ourselves
            numsIndex.put(n, i1);
        }

        return results;

    }

    public static void whatFlavors(List<Integer> cost, int money) {
        // Write your code here
        Map<Integer, Integer> parlor = new LinkedHashMap<>();
        for(int i = 0; i < cost.size(); i++) {
            if(cost.get(i) < money) {
                if(parlor.containsKey(money - cost.get(i))) {
                    System.out.println((parlor.get(money - cost.get(i))+1) + " " + (i+1));
                    return;
                }

                if(!parlor.containsKey(cost.get(i))) parlor.put(cost.get(i), i);
            }
        }
    }
    public static List<Integer> icecreamParlor1(int m, List<Integer> arr) {
        // Write your code here

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j <arr.size(); j++) {
//                System.out.println(arr.get(i)+ " " + arr.get(j));
                if (m == arr.get(i) + arr.get(j) ) {
                    System.out.println(arr.get(i)+ " " + arr.get(j));
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>(Arrays.asList(1,3,4,5,6));
        icecreamParlor(6,arr);
//        icecreamParlor1(6,arr);
    }
}
