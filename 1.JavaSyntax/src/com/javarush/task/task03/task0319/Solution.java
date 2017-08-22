package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();
        String chislo = r.readLine();
        String dVa = r.readLine();
        int sage = Integer.parseInt(chislo);
        int dab = Integer.parseInt(dVa);
        System.out.println(name +" " + "получает"+" " + sage+ " " + "через"+" " + dVa + " " + "лет.");
    }
}
