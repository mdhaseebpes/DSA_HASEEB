package com.arrays;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {

    // Example method using 'throws' to declare potential exceptions
    public static void readFile(String filePath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath);
        // Additional file processing code
    }

    // Example method using 'throw' to throw a specific exception
    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        // Additional validation code
    }

    public static void main(String[] args) {
        // Example usage of 'throws'
        try {
            readFile("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        // Example usage of 'throw'
        try {
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
    }
}
