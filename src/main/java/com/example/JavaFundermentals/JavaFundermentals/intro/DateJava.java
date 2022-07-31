package com.example.JavaFundermentals.JavaFundermentals.intro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateJava {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now(); // Create a date object
        System.out.println(currentDate); // Display the current date
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        System.out.println("Formatting date");
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
