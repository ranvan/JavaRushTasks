package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.22, "1.22");
        labels.put(2.22, "2.22");
        labels.put(3.22, "3.22");
        labels.put(4.22, "4.22");
        labels.put(5.22, "5.22");
    }

    public static void main(String[] args) {

        System.out.println(labels);
    }
}
