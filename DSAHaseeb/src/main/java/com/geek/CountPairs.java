package com.geek;



public class CountPairs  {

    public static int countPairs(int[] arr , int target){
        int n= arr.length;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                    System.out.println("pairs " + arr[i] + " " + arr[j]);
                }
            }
        }
        return count;
    }

    public static int countCombination(int[] arr, int target){
        int n = arr.length;
        int count =0;
        int i=0; //start point
        int j= n-1; //end point

        while(i<j){
            if(arr[i]+arr[j]==target){
                count++;
                System.out.println("pairs " + arr[i] + " " + arr[j]);
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
      return  count==0 ? -1 : count;
    }

    public static void main(String[] args) {

        int[] arr = {1,4,9,15,20,34,35,40};
        int target = 49;
        int pair =countPairs(arr,target);
        System.out.println("pairs = " + pair);
        System.out.println("***************");
        int pairs = countCombination(arr,target);
        System.out.println("pairs = " + pairs);
    }
}
