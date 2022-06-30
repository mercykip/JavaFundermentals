package com.example.JavaFundermentals.JavaFundermentals;

//1.String is an object that represents character values. It is immutable hence cannot be changed, Whenever we change any string a new instance is created.For mutable
//Strings we use StringBuffer and StringBuilder classes.
//2. Java string methods: compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring()
//3. Java string implements serializable,comparable and char-sequence interface.
//4. CharSequence interface is used to represent  sequence of characters. String, StringBuilder and StringBuffer implements CharSequence. We can create Strings
// in java using the three classes
//5.Ways of creating string object by: string literal and new keyword. String literal is created by using double quotes. N.B each time a string literal is created jvm checks  the
// "String constant pool" first, if it does not exist /not already created, a new instance is created and placed in the pool.
// Java uses string literal to make it more memory  efficient.
//6. Creating a string using new keyword, jvm will create a new string object in a non-pool(normal) heap memory
public class StringManipulaion {
    public static void main(String[] args) {
        char[] ch = {'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};
        //create a string using string literal
        String m = "Mercy";//new string instance is created and placed in the pool
        String m1 = "Mercy";//since the string exists  in the pool,a reference to the pooled instance is returned

        // create a string using  new keyword
        String s = new String(ch);//converting char array to string
        String s3 = "example";//creating Java string by new keyword
        System.out.println(s);//javatpoint
        System.out.println(s3);//example


        //string methods
        //1. charAt(), returns a character value at a given index. If you pass a value that does not exist you will get StringIndexOutOfBoundsException at run time
        char t = s.charAt(4);
        System.out.println(t);//t

        String str = "Welcome to Javatpoint portal";
        int len = str.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {//check for even index
                System.out.print(str.charAt(i));//Wloet aapitpra
            }
        }
        System.out.println();
        for (char i : str.toCharArray()) {
            if (i == 'a') {
                count++;
            }
        }
        System.out.println("count of a is :: "+count);
       //2. Substring, this method returns part of a string
        //begin index start from 0 while end index start from 1
        String s1="123456";
        System.out.println(s1.substring(2,4));//34
        System.out.println(s1.substring(1));//23456


    }
}
