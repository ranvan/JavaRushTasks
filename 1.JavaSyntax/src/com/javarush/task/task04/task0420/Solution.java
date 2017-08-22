package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (b>a) { b+=a; a=b-a; b-=a; }
        if (c>b) { c+=b; b=c-b; c-=b; }
        if (b>a) { b+=a; a=b-a; b-=a; }
            System.out.println(a + " " + b + " " + c);
    }
}
