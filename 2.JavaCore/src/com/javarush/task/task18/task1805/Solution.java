package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream inputStream = new FileInputStream(filename);
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available() > 0){
            int d = inputStream.read();
            if(!list.contains(d))
                list.add(d);
        }
        Collections.sort(list);
        for(Integer i: list){
            System.out.print(i + " ");
        }
        reader.close();
        inputStream.close();
    }
}
