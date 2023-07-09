package org.EasyArrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LargestElementArray {

    public int largest(int arr[], int n)
    {
        int max = Integer.MIN_VALUE;
      for(int ele : arr){
         if(ele>max){
             max=ele;
         }
     }
         return max;
    }

    public static void secondLargestWithSort(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int largest = arr[n-1];
        int secondLargest = arr[n-2];

        System.out.println("largest :  " + largest);
        System.out.println("Second largest :  " + secondLargest);
    }

    //1, 20, 50,60 ,34, 89,42, 55,91, 64, 8,5,22
    public static void secondLargest(int[] arr){
        int largest  = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        System.out.println(Arrays.toString(arr));
     for(int i=0;i<arr.length;i++){
         if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
         }
         else if(arr[i]>secondLargest && arr[i]!=largest){
             secondLargest=arr[i];
         }
     }
        System.out.println("largest : " + largest);
        System.out.println("Second largest : " + secondLargest);
    }

    public static void main(String[] args) {

       /* Scanner  scan = new Scanner(System.in);
        System.out.println("enter  a list of Integers , separated by commas :");
        String input = scan.nextLine();

         String[] splits = input.split(",");
         int[] values  = new int[splits.length];
         for(int i=0;i<splits.length;i++){
             values[i]= Integer.parseInt(splits[i].trim());
         }

        System.out.println(Arrays.toString(values));
*/
        System.out.println("-------");
        Random random = new Random();
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
           arr[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        LargestElementArray largestElementArray = new LargestElementArray();
       int maxEle = largestElementArray.largest(arr,5);
        System.out.println("Largest element is  " + maxEle);

        System.out.println("---------------------");
        int[]  arr02 = {20,4,34,11,55,88,64,0,2,1,42};
        secondLargestWithSort(arr02);

        System.out.println("---------------------");
        int[] arr03 ={1, 20, 50,60 ,34, 89,42, 55,91, 64, 8,5,22};
        secondLargest(arr03);

    }
}
