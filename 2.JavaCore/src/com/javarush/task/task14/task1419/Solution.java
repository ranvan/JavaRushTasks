package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ClassCastException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new NegativeArraySizeException());
        exceptions.add(new NullPointerException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new SecurityException());
        exceptions.add(new RuntimeException());

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
