package com.arrays;

public class LargestNumbers {
    /*3.Write a Java program that finds the two largest numbers in an array of integers.*/
    public static void numbers(int[] arr){
        int n = arr.length;
        int largest =0;
        int secondLargest =0;
        int temp=0;

        largest = arr[0];
        secondLargest=arr[1];

        if(largest<secondLargest){
            temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }

        for(int i=2;i<n;i++){
            if(arr[i]>largest){
               secondLargest = largest;
               largest =arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
               secondLargest= arr[i];
            }
        }
        System.out.println("largest number is " + largest);
        System.out.println("second largest number is " + secondLargest);
    }


    public static void main(String[] args) {
        int[] arr = {44,55,11992,5,5,1212,'d',311,11};
        numbers(arr);
    }
}
