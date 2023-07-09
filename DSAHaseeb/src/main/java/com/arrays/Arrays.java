package com.arrays;

public class Arrays {
    public static void main(String[] args) {

        //O(1) =  constant
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 30;
        intArray[2] = -15;
        intArray[3] = 40;
        intArray[4] = 60;
        intArray[5] = 70;
        intArray[6] = 90;

        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

        int index = -1;
        for(int i=0;i<intArray.length;i++){
           if(intArray[i]==70){
               System.out.println("index is " + i);
               break;
           }
        }

    }
}
