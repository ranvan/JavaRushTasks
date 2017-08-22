package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int hold;
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 1; j < array.length; j++) {

            for (int k = 0; k < array.length - 1; k++) {

                if (array[k] > array[k + 1]) {
                    hold = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = hold;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
