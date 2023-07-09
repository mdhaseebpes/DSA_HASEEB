package com.arrays;

public class BubbleSort {

    public static void swap(int[] array , int i , int j){
        if(i==j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 4, -12,33,-2};

        for(int i=0; i<intArray.length;i++){
            for(int j=i+1; j<intArray.length; j++){
                if(intArray[i] > intArray[j]){
                    swap(intArray, i , j);
                }
            }
        }
        for(int i=0;i<intArray.length;i++){
            System.out.print(intArray[i] + " ");
        }
    }
}
