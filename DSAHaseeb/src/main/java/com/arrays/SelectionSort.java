package com.arrays;

public class SelectionSort {
    public static void swap(int[] array, int i, int j) {
        if (i==j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 4, -12,33,-2};

        //O(n2) time complexity -quadratic
        for (int lastUnSortedIndex = intArray.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            int largest =0;
            for (int i = 1; i < lastUnSortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest=i;
                }
            }
            swap(intArray, largest, lastUnSortedIndex);
        }
        for(int i=0;i<intArray.length;i++){
            System.out.print(intArray[i] + " ");
        }

    }
}
