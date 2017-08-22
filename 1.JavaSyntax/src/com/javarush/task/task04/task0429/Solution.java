package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        int negativ = 0;
        int positiv = 0;

        if (a != 0 && a > 0) positiv++;
        else negativ++;
        if (b != 0 && b > 0) positiv++;
        else negativ++;
        if (c != 0 && c > 0) positiv++;
        else negativ++;

        System.out.println("количество отрицательных чисел: " + negativ);
        System.out.println("количество положительных чисел: " + positiv);
    }
}
