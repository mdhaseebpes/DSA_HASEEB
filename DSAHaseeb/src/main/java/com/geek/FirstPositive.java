package com.geek;

public class FirstPositive {

    public static int firstPositive(int[] temp){
        int n = temp.length;
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=temp[i];
        }
        return totalSum-sum;
    }
    public static void main(String[] args) {

        int[] arr = {3,4,-1,1,0};
        int arr1 =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                arr1++;
            }
        }

        int[] temp = new int[arr1];
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
             temp[count]= arr[i];
             count++;
            }
        }
       int number = firstPositive(temp);
        System.out.println("first positive number is " + number);


    }
}
