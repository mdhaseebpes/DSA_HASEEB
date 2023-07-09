package com.geek;

public class MissingNumber {

    public static  int  missingArr(int[] arr , int n){
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            sum+= arr[i];
        }
        int totalSum = n*(n+1)/2;
        return totalSum - sum;
    }

    public static void main(String[] args) {

        int[] arr = {0,5,1,4,2};
        int n = arr.length;
        int number = missingArr(arr,n);
        System.out.println("Missing number is " + number);

    }
}
