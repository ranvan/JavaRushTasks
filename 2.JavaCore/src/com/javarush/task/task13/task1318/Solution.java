package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(reader.readLine());
        MyClass myObject = new MyClass();

        while (inStream.available() > 0)
        {
            System.out.print((char)inStream.read()); //записываем прочитанный int в другой поток.
        }
        System.out.println();
        reader.close();
        System.in.close();
        inStream.close(); //закрываем потоки
    }
}
class MyClass
{
    private ArrayList<Integer> list;
    public void write(int data)
    {
        list.add(data);
    }
    public int read()
    {
        int first = list.get(0);
        list.remove(0);
        return first;
    }

    public int available()
    {
        return list.size();
    }
}