package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        String filename = file.readLine();
        file.close();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        while (reader.ready()){
            String line = reader.readLine();
            String[] word = line.split("[\\p{P}\\s\\t\\n\\r]");
            int count = 0;
            for(String lineword : word){
                for(String linewords : words){
                    if(lineword.equals(linewords)){
                        count++;
                    }
                }
            }
            if (count == 2){
                System.out.println(line);
            }
        }
        //file.close();
        reader.close();
    }
}
