package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidString {
    public static String isValid(String s) {
        // Write your code here
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int freq = map.getOrDefault(a, 0);
            System.out.println(freq);
            map.put(a,++freq);
        }
        System.out.println(map.toString());

        int[] arr = new int[map.size()];
        int idx = 0;
        //transalate the frequencies into an array
        //{a=4, b=2, c=2, d=2}
        //{4,2,2,2}
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            arr[idx++] = characterIntegerEntry.getValue();
        }

        Arrays.sort(arr);

        if (map.size() == 1) return "YES";

        int first = arr[0];
        int second = arr[1];
        int secondLast = arr[arr.length - 2];
        int last = arr[arr.length - 1];

        // If first and last are same, then all frequencies are same
        if (first == last) return "YES";

        // If first is 1, and all other characters have 1 frequency
        if (first == 1 && second == last) return "YES";

        // If all are same and last character has just 1 extra count
        if (first == second && second == secondLast && secondLast == (last - 1)) return "YES";

        // Else invalid string
        return "NO";

    }

    public static void main(String[] args) {
        isValid("aabbaaccdd");
    }
}
