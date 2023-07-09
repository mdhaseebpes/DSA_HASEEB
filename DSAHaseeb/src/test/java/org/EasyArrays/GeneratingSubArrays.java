package org.EasyArrays;

import java.util.Scanner;


public class GeneratingSubArrays {

    public static void subArrays(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){

                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + ",");
                }
                System.out.println();
            }

        }

    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Print size of Array in number");
           int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]= scanner.nextInt();
            }
            subArrays(arr);
        }catch (Exception ex){
            System.out.println("enter a correct integer number");
        }

    }
}
