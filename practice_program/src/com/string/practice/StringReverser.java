package com.string.practice;

public class StringReverser {
    
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
