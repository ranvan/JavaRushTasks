package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        //int a = Integer.parseInt(reader.readLine());
        if(name1.length() == name2.length() && !(name1.equals(name2)))
            System.out.println("Длины имен равны");
        else if(name1.equals(name2))
            System.out.println("Имена идентичны");
    }
}
