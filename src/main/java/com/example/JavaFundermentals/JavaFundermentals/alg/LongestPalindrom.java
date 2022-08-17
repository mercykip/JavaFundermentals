package com.example.JavaFundermentals.JavaFundermentals.alg;

public class LongestPalindrom {

    public static String longestPalindrom(String s){
       if(s == null || s.length()<1)
        return "";
       int start=0;
       int end =0;
       for(int i=0; i<s.length(); i++){
           //where we have middle character that doesnt have a match
           int len1=expandFromTheMiddle(s,i,i);
           //everything has a match
           int len2=expandFromTheMiddle(s,i,i+1);
           int len=Math.max(len1,len2);
           if(len>end-start){
               start = i- ((len-1)/2);
               end = i + (len/2);
           }
       }
      return  s.substring(start, end +1);

    }
    public static int expandFromTheMiddle(String s,int left,int right){
        if(s==null || left>right){
            return 0;
        }
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;

    }
    public static void main(String[] args) {
        longestPalindrom("Mercy");
    }
}
