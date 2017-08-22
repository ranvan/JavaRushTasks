package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream in1 = new FileInputStream(file1);
        FileOutputStream out1 = new FileOutputStream(file1);
        FileInputStream in2 = new FileInputStream(file2);
        while (in1.available() > 0){
            list.add(in1.read());
        }
        while (in2.available() > 0){
            int data = in2.read();
            out1.write(data);
        }
        for(Integer s: list){
            out1.write(s);
        }
        reader.close();
        in1.close();
        out1.close();
        in2.close();
    }
}
