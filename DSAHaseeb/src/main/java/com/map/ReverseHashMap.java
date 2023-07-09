package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ReverseHashMap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        hashMap.put(4, "Durian");

        // Print the original HashMap
        System.out.println("Original HashMap: " + hashMap);

        // Create a List from the HashMap entries
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(hashMap.entrySet());

        // Reverse the order of the entries
        Collections.reverse(entryList);

        // Create a new LinkedHashMap to store the reversed entries
        LinkedHashMap<Integer, String> reversedHashMap = new LinkedHashMap<>();

        // Add the reversed entries to the new LinkedHashMap
        for (Map.Entry<Integer, String> entry : entryList) {
            reversedHashMap.put(entry.getKey(), entry.getValue());
        }

        // Print the reversed HashMap
        System.out.println("Reversed HashMap: " + reversedHashMap);
    }
}

