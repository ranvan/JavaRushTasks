package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn = reader.readLine();
        String sm = reader.readLine();
        int n = Integer.parseInt(sn);
        int m = Integer.parseInt(sm);
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
