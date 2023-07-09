package com.TimeComplexity;

public class O1 {

    //1+1+1+1 = 4 ==> 0(4) ==>0(1) -- constant time
    public static int sum(int a , int b){
        int total = a + b;
        return total;
    }

    public static void main(String[] args) {
        int s1  = sum(10,20);
        System.out.println(s1);

        int arr[] = {1,3,6,8,9};
        System.out.println(arr[3]);  ///0(1)
    }
}
