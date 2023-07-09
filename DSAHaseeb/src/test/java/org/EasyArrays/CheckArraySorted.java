package org.EasyArrays;

import java.util.Arrays;

public class CheckArraySorted {

    public static boolean checkArray(int[] arr){
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    System.out.println("Array is not sorted as : " + arr[i] + " is greater than " + arr[j]);
                    return flag;
                }
            }
        }
        System.out.println("Array is sorted ");
        return true;
    }

    public static  boolean recursionCheck(int[] arr,int n){
        if(n==0 || n==1){
            return true;
        }
        else if (arr[n-1] < arr[n-2]){
            System.out.println("Array is not sorted as : " + arr[n-2] + " is greater than " + arr[n-1]);
            return false;
        }
        return recursionCheck(arr,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------");
        checkArray(arr);

        System.out.println("---------------");
        int[] arr2 = {1,3,2,4,5};
       // Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
      boolean result =  recursionCheck(arr2,5);
      if(result){
          System.out.println("Arrays is sorted");
      }else{
          System.out.println("Arrays is not sorted");
      }


    }
}
