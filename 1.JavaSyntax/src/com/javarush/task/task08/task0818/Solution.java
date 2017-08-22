package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("name1", 5030);
        map.put("name2", 5040);
        map.put("name3", 500);
        map.put("name4", 50);
        map.put("name5", 5040);
        map.put("name6", 505);
        map.put("name7", 50);
        map.put("name8", 5040);
        map.put("name9", 1500);
        map.put("name0", 50);
        return (HashMap) map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()){
            if(pair.getValue() < 500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}