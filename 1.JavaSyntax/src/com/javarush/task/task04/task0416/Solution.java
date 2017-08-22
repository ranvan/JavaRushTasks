package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stime = reader.readLine();
        double time = Double.parseDouble(stime);
        getColor(time);
    }

    public static void getColor(double a){
        if (a % 5 >= 0 && a % 5 < 3)
            System.out.println("зелёный");
        else if (a % 5 >= 3 && a % 5 < 4)
            System.out.println("жёлтый");
        else
            System.out.println("красный");
    }
}