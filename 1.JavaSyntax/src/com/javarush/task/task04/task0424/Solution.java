package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);
        if(a == b && c!=a)
            System.out.println("3");
        else if(a == c && b != a)
            System.out.println("2");
        else if(b == c && b != a)
            System.out.println("1");
    }
}
