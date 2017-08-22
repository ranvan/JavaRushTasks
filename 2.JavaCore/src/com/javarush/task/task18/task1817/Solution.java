package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[0]);
        float charcount = 0;
        float spaceCount = 0;
        while (reader.ready()){
            int data = reader.read();
            charcount++;
            if(data == 32){
                spaceCount++;
            }
        }
        System.out.println(String.format("%.2f",(spaceCount / charcount * 100)));
        reader.close();
    }
}

