package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuffer outText = new StringBuffer("");
        while (reader.ready()) {
            String line = reader.readLine();
            String[] words = line.split(" ");
            for (String word : words)
                if (word.length() > 6)
                    outText.append(word).append(",");
        }

        outText.delete(outText.length()-1,outText.length());
        writer.write(outText.toString());
        writer.close();
        reader.close();
    }
}
