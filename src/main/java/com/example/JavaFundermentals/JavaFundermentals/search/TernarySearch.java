package com.example.JavaFundermentals.JavaFundermentals.search;

public class TernarySearch {

    public static int search(int arr[], int l, int r, int key) {
        while (r >= l) {
            //find the value of mid1 and mid2
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

           //check if key is present at any of the mid
            if (arr[mid1] == key)
                return mid1;
            if (arr[mid2] == key)
                return mid2;

            //if key is not present at mid check which section/part contains the key and repeat the search operation.
            if(key<arr[mid1])
                //key lies in between l and mid1
                r=mid1-1;
            else if(key>arr[mid2]){
                //key lies btw mid2 and high
                l=mid2+1;
            }else{
                //the key lies between mid1 and mid2
                l=mid1 + 1;
                r=mid2-1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int l, r, p, key;

        // Get the array
        // Sort the array if not sorted
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // Starting index
        l = 0;

        // length of array
        r = 9;

        // Checking for 5

        // Key to be searched in the array
        key = 5;

        // Search the key using ternarySearch
        p = search( ar,l, r, key);

        // Print the result
        System.out.println("Index of " + key + " is " + p);

        // Checking for 50

        // Key to be searched in the array
        key = 50;

        // Search the key using ternarySearch
        p = search(ar,l, r, key);

        // Print the result
        System.out.println("Index of " + key + " is " + p);
    }
}
