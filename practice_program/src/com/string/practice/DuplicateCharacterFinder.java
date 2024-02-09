package com.string.practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterFinder {

    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store characters and their frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Convert the input string to lowercase (optional)
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Update the frequency of the character in the map
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Display duplicate characters along with their frequencies
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
