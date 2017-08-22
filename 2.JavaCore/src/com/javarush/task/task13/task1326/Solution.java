package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner freader = new Scanner(new FileInputStream(reader.readLine()));
        ArrayList arrayList = new ArrayList();
        while (freader.hasNext()){
            int i = Integer.parseInt(freader.next());
            if ( i%2 == 0) arrayList.add(i);
        }
        Collections.sort(arrayList);
        for (Object i : arrayList){
            System.out.println(i + " ");
        }
        freader.close();
        reader.close(); }
}
