//package com.example.JavaFundermentals.JavaFundermentals.sorting;
//
//public class QuickSort {
//    public static void quickSort(int[] arr, int left, int right) {
//        //out of order
//        if(left>=right){
//            return;
//        }
//        int pivot=arr[(left+right) / 2];
//        //partition is going to return the dividing points btw the left and the right side
//         int index=partition(arr,left,right,pivot);
//         //sort on the left and right side
//        quickSort(arr,left,index-1);
//        //right side
//        quickSort(arr,index,right);
//    }
//    public static int partition(int[] arr, int left, int right, int pivot){
//        //move left to right simultaneously
//        while (left<=right){
//            //move pointer towrds each other
//            while (arr[left]<pivot){
//                left++;
//            }
//            while (arr[right]>pivot){
//                right--;
//            }
//            if(left<=right){
//                swap(arr,left,right);
//                left++;
//                right--;
//            }
//        }
////return the partition point
//
//    }
//}
