package com.example.JavaFundermentals.JavaFundermentals.alg;

public class DuplicateNumber {
    public static int findDuplicateNumber(int[] nums){
        int slow= nums[0];
        int fast= nums[0];

        do{
            slow=nums[slow];//move the slow pointer by one
            fast=nums[nums[fast]];//move fast pointer by two
        }while(slow !=fast);
        //when they meet
        //move the fast pointer to the first position
        fast=nums[0];
        while (slow!=fast){
            slow=nums[slow];
            fast=nums[fast];

        }
        //either the slow or fast pointer will be the answer
        System.out.println(slow);
        return slow;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,6};

        findDuplicateNumber(arr);
    }
}
