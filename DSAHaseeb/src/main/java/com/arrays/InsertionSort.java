package com.arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {20,35,15,7,55,1,-22};

        for(int i=1; i<arr.length;i++){
            int newElement = arr[i];
            int j;
            for(j=i; j>0 && arr[j-1]>newElement;j--){
                arr[j] =arr[j-1];
            }
            arr[j]=newElement;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
