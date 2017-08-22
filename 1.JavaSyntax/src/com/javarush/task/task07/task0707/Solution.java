package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList < String > list = new ArrayList < String >();
        list.add("фа впва");
        list.add("фавп вак");
        list.add("ымв ак");
        list.add("йу ипывфукй");
        list.add("йукпиап кпей5");
        System.out.println(list.size());
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }

    }
}
