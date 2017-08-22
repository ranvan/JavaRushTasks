package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn1 = reader.readLine();
        String sn2 = reader.readLine();
        String sn3 = reader.readLine();
        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);
        int n3 = Integer.parseInt(sn3);
        if (n1 > 0 && n2 > 0 && n3 > 0)
            System.out.println("3");
        else if (n1 > 0 && n2 > 0 && n3 < 0 || n1 > 0 && n3 > 0 && n2 < 0 || n2 > 0 && n3 > 0 && n1 < 0)
            System.out.println("2");
        else if (n1 > 0 && n2 < 0 && n3 < 0 || n1 < 0 && n2 > 0 && n3 < 0 || n1 < 0 && n2 < 0 && n3 > 0)
            System.out.println("1");
        else if (n1 < 0 && n2 < 0 && n3 < 0)
            System.out.println("0");
    }
}
