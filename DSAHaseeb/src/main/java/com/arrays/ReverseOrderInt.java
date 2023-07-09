package com.arrays;

import java.util.Arrays;

 class ReverseOrderInt {
    /**4.Write a Java program that reverses the order of the elements in an array of integers.*/

    public static void reverseOrder(int[] arr){
        int n = arr.length;
        int[] arr1 = new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
             arr1[j]=arr[i];
             j++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }


    public static void main(String[] args) {
        int[] arr = {44,55,11992,5,5,1212,311,11};
        reverseOrder(arr);


    }

}
