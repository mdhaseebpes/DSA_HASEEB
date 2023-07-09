package com.TimeComplexity;

public class QuadraticTime {


    //Bubble sort is the example for 0(n^2) -quadratic time complexity
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }

        //(1+n+n+n) (1+n+n+n)
        //(1+3n) (1+3n) ===> 1+3n+3n+9n^2 -->9n^2+6n+1 == Quadratic equation
        //>9n^2+6n -->3n(3n+2) --> 9n^2 --> 0(n^2)


        int[] intArray = {20, 35, -15, 7, 55, 4, -12, 33, -2};

        //m*n --->0(n^2)
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    swap(intArray, i, j);
                }
            }
        }


        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
