package com.arrays;

public class LongestString {

    /*2 .Write a Java method that takes an array of strings and
  returns the length of the longest string in the array.*/
    public static  void longString(String[] ar){
        int n = ar.length;
        String longestStr = null;
        int max =0;
        for(int i=0;i<n;i++){
            if(ar[i].length()>max){
                max=ar[i].length();
                longestStr =ar[i];
            }
          }

        System.out.println("Longest String is " + longestStr + " and length is = " + max);
    }


    public static void main(String[] args) {
        String[] arr1 = { "DataStructures","Java","QA", "Selenium","DataStructures&Algo","API", "Appium",};

        longString(arr1);

    }
}
