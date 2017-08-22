package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

import sun.security.provider.certpath.BuildStep;

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }
    public static class CTO1 implements Businessman{
        @Override
        public void workHard(){

        }
    }

    public static class CTO extends CTO1 implements Businessman {

    }
}
