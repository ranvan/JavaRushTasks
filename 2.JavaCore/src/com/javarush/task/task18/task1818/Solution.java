package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileOutputStream out1 = new FileOutputStream(file1);
        FileInputStream in2 = new FileInputStream(file2);
        FileInputStream in3 = new FileInputStream(file3);
        while (in2.available() > 0){
            int data = in2.read();
            out1.write(data);
        }
        in2.close();
        while (in3.available() > 0){
            int data = in3.read();
            out1.write(data);
        }
        in3.close();
        out1.close();
    }
}
