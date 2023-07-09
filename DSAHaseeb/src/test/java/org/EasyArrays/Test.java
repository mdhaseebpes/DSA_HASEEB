package org.EasyArrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    //zero  - done
    //count numbers - done
    //Arrays sort - done
    //third variable -
    // reverse number


    public static void main(String[] args) {

        System.out.println("-- zeros at the end----");
        int[] arr = {3,0, 2,0, 1,0, 12, 0,211,0,424};
        int n = arr.length;
        int i=0;
        int j=0;

        while(n>i){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
                j++;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("---sort----------");
        //  Arrays.sort(arr);

        int[] arr1 = {3,0, 2,0,-2,2322,22,-12, 1,0, 12, 0,211,0,424};
        for(int a=0;a<=arr1.length;a++){
            for(int b=0;b<arr1.length-1;b++){
                if(arr1[b]>arr1[b+1]){
                    int temp= arr1[b];
                    arr1[b] = arr1[b+1];
                    arr1[b+1]= temp;
                }
            }
            System.out.println(Arrays.toString(arr1));
        }


        System.out.println("----String occurence-----");
        String occur = "JOB NEEDED DESPERATELY";
       String occurence = occur.replaceAll(" ","");

        ArrayList<Character> arrays = new ArrayList<Character>();

        for(int c=0;c<occurence.length();c++){
            int count=0;
            if(!(arrays.contains(occurence.charAt(c)))){
                arrays.add(occurence.charAt(c));
                count++;

                for(int d=c+1;d<occurence.length();d++){
                    if(occurence.charAt(c)==occurence.charAt(d)){
                        count++;
                    }
                }
                System.out.println("Character is repeated " + occurence.charAt(c) +  " = " + count);
            }

        }

        System.out.println("--- without third variable------");

       int num1 = 40;
       int num2 = 90;

       num1= num1+num2; //130
       num2 = num1-num2; //130-90 = 40
       num1 = num1-num2; //130-40=90

        System.out.println("num1 value is " + num1 + "\n" + "num2 value is " + num2);

        String s1 = "do";
        String s2 = "die";

        s1 = s1+s2;
        s2= s1.substring(0,(s1.length()-s2.length()));
        s1 = s1.substring(s2.length());

        System.out.println("s1 value is " + s1 + "\n" + "s2 value is " + s2);

        String s="Cucumber9.9X",t="Appium6.7Version";
        s = s.replaceAll("[a-zA-Z]","");
        t = t.replaceAll("[a-zA-Z]","");
       Float f1 = Float.parseFloat(s);
        Float f2 =Float.parseFloat(t);
        System.out.println(f1+f2);

        System.out.println("----------Arrays count ------------");

        String[] ar1 = {"Apple", "Orange", "Mango","Mango", "Apple", "Mango", "Orange", "Orange", "Grapes"};

        int n1 = ar1.length;
        int e = 0;

        ArrayList<String> str = new ArrayList<String>();

        for(int f=0;f<n1;f++) {
            int count = 0;
            if (!str.contains(ar1[f])) {
                str.add(ar1[f]);
                count++;
                for (int k = f + 1; k < n1; k++) {
                    if (ar1[f].equals(ar1[k])) {
                        count++;
                    }
                }
                System.out.println("Repeated string - " + ar1[f] + " = " + count);
            }
        }
            System.out.println("----------Arrays count using Map ------------");

            Map<String, Integer> map = new LinkedHashMap<>();

            for(int l=0;l<n1;l++){
                String str1 = ar1[l];
                if(map.containsKey(str1)){
                    map.put(str1,map.get(str1)+1);
                }
                else{
                    map.put(str1,1);
                }
            }
            System.out.println(map);

        System.out.println("----------Count pairs ------------");

        int[] arr2 = {1,4,9,15,20,34,35,40};
        int target = 49;
        int n2 = arr2.length;
        int count =0;


        for(int p=0;p<n2;p++){
            for(int q=1;q<n2;q++){
                if(arr2[p]+arr2[q]==target){
                    count++;
                    System.out.println( "target pairs " + arr2[p] + "," +arr2[q]);
                }
            }
        }
        System.out.println("Total count of pairs is " + count);
    }
}
