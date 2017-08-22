package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        BufferedReader file1 = new BufferedReader(new FileReader(name1));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(name2));
        while (file1.ready()){
            String[] words = file1.readLine().split("[\\p{P} \\t\\n\\r]");
            for(String line : words){
                file2.write(line);
            }
        }
        file1.close();
        file2.close();
    }
}
