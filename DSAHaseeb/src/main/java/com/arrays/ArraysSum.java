package com.arrays;

public class ArraysSum {
    /***1.Write a Java method that takes an array of integers
     * and returns the sum of all the even numbers in the array **/
    public static void evenSum(int[] arr){
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                 sum+= arr[i];
            }
        }

        System.out.println("sum of all even numbers is " + sum);
    }

    public static void main(String[] args) {

        int[] arr = {3,5,6,8,12,15,18,30,33};

        evenSum(arr);
     }
}
