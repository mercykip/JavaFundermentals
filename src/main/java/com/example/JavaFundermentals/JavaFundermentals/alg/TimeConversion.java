package com.example.JavaFundermentals.JavaFundermentals.alg;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here
        String listTime[] = s.split(":");
        String timeSymbol=listTime[2].substring(2, 4);
        String hour=listTime[0];
        String minute=listTime[1];
        String seconds=listTime[2].substring(0, 2);
        String finalTime = null;
        if(timeSymbol.equals("AM")){
            if(hour.equals("12")){
                hour = "00";
                finalTime=hour+":"+minute+":"+seconds+timeSymbol;
            }
        }else{
            hour = String.valueOf(Integer.parseInt(hour)+12);
            System.out.println(hour+":"+minute+":"+seconds);
            finalTime=hour+":"+minute+":"+seconds+timeSymbol;
        }
        System.out.println(finalTime);
        return finalTime;

    }
    public static String timeConversions(String s) {
        // Write your code here
        DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");
        Date date = null;
        String myDate="";
        try {
            date = inFormat.parse(s);
        }catch (ParseException e ){
            e.printStackTrace();
        }
        if( date != null ){
             myDate = outFormat.format(date);
        }
        System.out.println(myDate);

        return myDate;

    }
    public static void main(String[] args) {
//        timeConversion("12:01:00PM");
        timeConversions("12:01:00AM");
    }
}
