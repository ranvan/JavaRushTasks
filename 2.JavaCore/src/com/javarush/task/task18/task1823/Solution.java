package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while (true){
            s = reader.readLine();
            if (s.equals("exit"))
                break;
            ReadThread readThread = new ReadThread(s);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private byte findByte;
        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }
        @Override
        public void  run(){
            HashMap<Byte, Integer> frequency = new HashMap<>();
            try {
                FileInputStream file = new FileInputStream(this.fileName);
                while (file.available() > 0){
                    byte[] buff = new byte[file.available()];
                    file.read(buff);
                    for(byte b: buff){
                        if(frequency.containsKey(b)){
                            frequency.put(b,frequency.get(b)+1);
                        }
                        else {
                            frequency.put(b, 1);
                        }
                    }
                }
                file.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int max = 0;
            for(Map.Entry<Byte, Integer> pair: frequency.entrySet()){
                if(max < pair.getValue()){
                    this.findByte = pair.getKey();
                    max = pair.getValue();
                }
            }
            resultMap.put(this.fileName, new Integer(this.findByte));
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
