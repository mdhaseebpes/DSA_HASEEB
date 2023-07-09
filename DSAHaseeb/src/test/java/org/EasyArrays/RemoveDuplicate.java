package org.EasyArrays;

import java.util.ArrayList;
import java.util.Arrays;


public class RemoveDuplicate {

    public static int[] removeDuplicate(int arr[]) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("---------------");
        for (int i = 0; i < arr.length; i++) {
            if (!arrayList.contains(arr[i])) {
                arrayList.add(arr[i]);
            }
        }
        System.out.println("--------------");
        int[] arr1 = new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            arr1[i]= arrayList.get(i);
        }

       return arr1;

    }

    public static void main(String[] args) {
        int[] arr = {7, 99, 55, 7, 66, 33, 55, 4};
        //Arrays.sort(arr);


        int[] result =removeDuplicate(arr);
        System.out.println(Arrays.toString(result));

    }
}
