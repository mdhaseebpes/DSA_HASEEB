package com.arrays;

public class SortedCheck {
    /**5.Write a Java program that checks whether an array of integers is sorted in ascending order.**/
    public static void sortCheck(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Array is not sorted in ascending due to " + arr[i] + " is greater than " + arr[i+1]);
                return;
            }
        }
        System.out.println("Array is sorted in ascending ");
    }

    public static void main(String[] args) {
        int[] arr = {4,5,7,9,10,12,6};

        sortCheck(arr);
    }

}
