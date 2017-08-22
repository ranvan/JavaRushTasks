package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String sn = reader.readLine();
        int n = Integer.parseInt(sn);
        int i = 0;
        while (i < n){
            System.out.println(string);
            i++;
        }

    }
}
