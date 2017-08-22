package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(args[0])) {
            Map<Character, Integer> map = new TreeMap<>();
            while (fis.available() > 0) {
                map.merge((char)fis.read(), 1, (k, v) -> k + v);
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.printf("%s %d%n", entry.getKey(), entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}