package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sd = reader.readLine();
        String sm = reader.readLine();
        String sy = reader.readLine();
        int d = Integer.parseInt(sd);
        int m = Integer.parseInt(sm);
        int y = Integer.parseInt(sy);
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
