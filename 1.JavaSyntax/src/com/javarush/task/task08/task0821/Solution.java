package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("surname1","name1");
        map.put("surname2","name1");
        map.put("surname3","name2");
        map.put("surname4","name2");
        map.put("surname5","name3");
        map.put("surname6","name4");
        map.put("surname7","name5");
        map.put("surname8","name6");
        map.put("surname9","name7");
        map.put("surname9","name8");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
