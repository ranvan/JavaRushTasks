package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        String[] string = number.split(" ");
        int a = Integer.parseInt(string[0]);
        int b = Integer.parseInt(string[1]);
        int c = Integer.parseInt(string[2]);
        if (a == b && b == c)
            System.out.println(a + " " + b + " " + c);
        else if(a == b && a != c)
            System.out.println(a + " " + b);
        else if(b == c && b != a)
            System.out.println(b + " " + c);
        else if(a == c && b != c)
            System.out.println(a + " " +c);
    }
}