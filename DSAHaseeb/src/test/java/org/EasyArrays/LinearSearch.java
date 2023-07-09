package org.EasyArrays;

import java.util.Arrays;

public class LinearSearch {

    public static int searchInSort(int[] arr, int N , int K){
        for(int i=0;i<N;i++){
            if(arr[i]==K){
                System.out.println("Found " + K + " at index " + i);
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int result =searchInSort(arr , arr.length,5);
        System.out.println(result);

    }
}
