package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        boolean y = true;
        while (y){
            int c = 0;
            int a = Integer.parseInt(s1);
            c = c + a;
            if(a == -1) break;
        }
    }
}
