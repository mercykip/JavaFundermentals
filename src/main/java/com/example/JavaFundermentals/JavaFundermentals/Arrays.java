package com.example.JavaFundermentals.JavaFundermentals;

public class Arrays {
   static String[] fruits = {"mango","orange","banana","apples"};

    void loopArrayFor(){
        System.out.println("print all items in an array using a For loop");
        for(int i=0; i< fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }

    void loopArrayForEach(){
        System.out.println("print all items in an array using a For Each loop");
       for(String i:fruits){
           System.out.println(i);
        }

    }
    void multidimentionalArray(){
        System.out.println("print all items in an multidimentional array using a For  loop");
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            System.out.println("length of the main array "+myNumbers.length);
            System.out.println("length of the sub-array"+myNumbers[i].length);
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println("value of i "+i+"\n value of j "+j);
                System.out.println(myNumbers[i][j]);
            }
        }

    }

    public static void main(String[] args) {
       Arrays arr=new Arrays();
        arr.loopArrayFor();//for loop
        arr.loopArrayForEach();//for each loop
        arr.multidimentionalArray();


        ///array manipulation
        System.out.println("\narray manipulation");
        System.out.println(fruits[0]);
        fruits[0] = "pineapples";
        System.out.println(fruits[0]);
        System.out.println(fruits.length);//number of elements in an array


        //multidimentional array
        System.out.println("\nmultidimentional array");
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[0][2];
        int y = myNumbers[1][2];
        System.out.println(x); // Outputs 3
        System.out.println(y); // Outputs 7

    }
}
