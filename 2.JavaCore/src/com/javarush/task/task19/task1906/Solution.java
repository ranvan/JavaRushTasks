package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String read = bufferedReader.readLine();
        String write = bufferedReader.readLine();

        bufferedReader.close();

        FileReader reader = new FileReader(read);
        FileWriter writer = new FileWriter(write);
        int count = 0;
        while(reader.ready()){
            count++;
            int data = reader.read();
            if(count % 2 == 0){
                writer.write(data);
            }
        }
        reader.close();
        writer.close();
    }
}
