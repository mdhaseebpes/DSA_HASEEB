package com.TimeComplexity;

public class Big0N {


    public static int linearSearch(int[] arr, int key){
        for(int i=1;i<=arr.length;i++){
            if(arr[i]==key){
                return i;
            }

        }
        return -1;
    }//0(n)

    public static void main(String[] args) {
        //1+n+n+n ==> 3n+1 --> Linear equation
        //3n --> n = 0(n)
        int n = 10;
        for(int i=1;i<=n;i++){
            System.out.println("I am learner " + i);
        }

        int arr[] ={1,4,5,66,99,44,33};
        int key =44;
        int index = linearSearch(arr,key);
        //0(1) -- best case
        //0(n) -- worst case

    }
}
