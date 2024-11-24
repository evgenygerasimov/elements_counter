package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, Integer> getElementWithCountMap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        int counter = 1;
        for (String string : strings) {
            if (!map.containsKey(string)) {
                map.put(string, counter);
            } else {
                map.put(string, map.get(string) + 1);
            }
        }
        return map;
    }
}