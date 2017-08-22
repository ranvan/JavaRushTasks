package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set cat = new HashSet<>();
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat text : cats)
        {
            System.out.println(text);
        }
    }

    public static class Cat{
    }
}
