package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String summ = "сумма";
        int s = 0;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String n = reader.readLine();
            if (n.equals(summ))
                break;
            else
                s += Integer.parseInt(n);
        }
        System.out.println(s);
    }
}