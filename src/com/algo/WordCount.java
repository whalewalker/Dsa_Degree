package com.algo;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class WordCount {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>();
        Scanner doc = new Scanner(System.in).useDelimiter("[^a-zA-Z]+");
        while (doc.hasNext()) {
            String word = doc.next().toLowerCase();
            Integer count = freq.get(word);
            if (count == null) count = 0;
            freq.put(word, 1 + count);
        }
        doc.close();
        int maxCount = 0;
        String maxWord = "no word";
        for (Entry<String, Integer> ent : freq.entrySet())
            if (ent.getValue() > maxCount) {
                maxWord = ent.getKey();
                maxCount = ent.getValue();
            }
        System.out.print("The most frequent word is '" + maxWord);
        System.out.println("' with " + maxCount + " occurrences.");
    }
}
