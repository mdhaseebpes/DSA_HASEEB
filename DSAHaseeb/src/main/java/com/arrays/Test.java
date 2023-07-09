package com.arrays;

import java.util.Arrays;

public class Test {

    public static void movesZero(int[] arr){
        int n = arr.length;
        int i=0;
        int j=0;
        while(i<n){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
                j++;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void movesZeroStart(int[] arr){
        int n = arr.length;

       for(int i=0;i<n;i++) {
           for (int j = i+1; j <n; j++) {
               if (arr[i] < arr[j]) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        int[] arr = {1,5,0,3,0,0,4};

       movesZero(arr);

        System.out.println("*****************");
        int[] arr1 = {0,4,22,0,-1,66,0,2,0,1};
        movesZeroStart(arr1);
    }
}
