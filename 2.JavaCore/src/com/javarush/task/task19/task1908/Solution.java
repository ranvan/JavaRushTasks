package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {

    public static boolean isNumeric(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader name1 = new BufferedReader(new FileReader(file1));
        BufferedWriter name2 = new BufferedWriter(new FileWriter(file2));
        while (name1.ready()){
            String[] word = name1.readLine().split(" ");
            for(String number : word){
                if(isNumeric(number)){
                    name2.write(number);
                    name2.write(" ");
                }
            }
        }
        name1.close();
        name2.close();
    }
}
