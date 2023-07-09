package com.arrays;

import java.util.ArrayList;



public class StringCountOccurrence {
    public static void main(String[] args) {
        String word = "Automation Test Engineer";
        String s1 = word.replaceAll(" ", "").toUpperCase();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
              int count =0;
            if (!list.contains(s1.charAt(i))) {
                list.add(s1.charAt(i));
                count++;
                for (int j = i+1; j < s1.length(); j++) {
                    if (s1.charAt(i)==s1.charAt(j)) {
                        count++;
                    }
                }
                System.out.println("Character " + s1.charAt(i) + " is repeated =" + count);
            }
        }
    }
}
