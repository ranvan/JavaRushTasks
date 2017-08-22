package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snumber = reader.readLine();
        int n = Integer.parseInt(snumber);
        if (n >= 1 && n <= 999) {
            if (n >= 1 && n < 10 && n % 2 == 0)
                System.out.println("четное однозначное число");
            else if (n >= 1 && n < 10 && n % 2 != 0)
                System.out.println("нечетное однозначное число");
            else if (n >= 10 && n < 100 && n % 2 == 0)
                System.out.println("четное двузначное число");
            else if (n >= 10 && n < 100 && n % 2 != 0)
                System.out.println("нечетное двузначное число");
            else if (n >= 100 && n < 1000 && n % 2 == 0)
                System.out.println("четное трехзначное число");
            else if (n >= 100 && n < 1000 && n % 2 != 0)
                System.out.println("нечетное трехзначное число");
        }
    }
}
