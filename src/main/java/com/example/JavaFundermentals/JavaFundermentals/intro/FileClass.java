package com.example.JavaFundermentals.JavaFundermentals.intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) {
        //create a file
        try {
            File myObj = new File("yourfile.txt"); // Specify the filename
            if(myObj.createNewFile()){
                System.out.println("File created :: "+ myObj.getName());
            }else {
                System.out.println("File already exists.");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //write to a file
        try{
            FileWriter myObj = new FileWriter("filename.txt"); // Specify the filename
            myObj.write("Hello World");
            myObj.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //read contents of a filw
        try{
            File myObj=new File("filename.txt");
            Scanner myReader=new Scanner(myObj);
            while (myReader.hasNext()){
                String data=myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        File myObj = new File("yourfile.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }

        //delete a file
        File file = new File("ilename.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
