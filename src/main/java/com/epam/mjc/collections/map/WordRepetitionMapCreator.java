package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordMap = new HashMap<>();

        // if sentence empty
        if (sentence.isEmpty()) {
            return wordMap;
        }

        // split the string to array
        String [] temp = sentence.toLowerCase().split("[ ,.!-]+");
        Arrays.sort(temp);

        // start an iteration
        for (String word : temp) {
            if (wordMap.containsKey(word)) {
                int count = wordMap.get(word) + 1;
                wordMap.put(word, count);
            } else {
                wordMap.put(word, 1);
            }
        }

        return wordMap;
    }
}
