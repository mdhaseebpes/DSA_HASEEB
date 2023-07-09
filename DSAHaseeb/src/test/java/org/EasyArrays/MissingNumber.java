package org.EasyArrays;

public class MissingNumber {

    public static int missingNumber(int A[],int N ){

        int i,sum=0;
        for(i=0;i<A.length;i++)
        {
            sum+=A[i];
        }
        int d=(N*(N+1))/2;
        return d-sum;

    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7};
        int n = arr.length+1;

       int result = missingNumber(arr,n);
        System.out.println(result);


    }
}
