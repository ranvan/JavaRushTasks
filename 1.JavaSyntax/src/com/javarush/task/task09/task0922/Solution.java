package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Date day = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH).parse(new BufferedReader(new InputStreamReader(System.in)).readLine());
        SimpleDateFormat date = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(date.format(day).toUpperCase());
    }
}
