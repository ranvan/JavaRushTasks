package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int[] array = new int[number];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > maximum) maximum = array[i];
        }

        System.out.println(maximum);
    }
}
