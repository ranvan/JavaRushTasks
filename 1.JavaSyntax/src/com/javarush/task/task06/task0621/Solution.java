package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat catGrandFa = new Cat(reader.readLine());
        Cat catGrandMa = new Cat(reader.readLine());
        Cat catFather = new Cat(reader.readLine(), catGrandFa, null);
        Cat catMother = new Cat(reader.readLine(), null, catGrandMa);
        Cat catSon = new Cat(reader.readLine(), catFather, catMother);
        Cat catDaughter = new Cat(reader.readLine(), catFather, catMother);

        System.out.println(catGrandFa);
        System.out.println(catGrandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother)
        {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString()
        {
            return "Cat name is "  + name +
                    ((mother != null)? ", mother is " + mother.name: ", no mother") +
                    ((father != null)? ", father is " + father.name: ", no father");

        }
    }
}