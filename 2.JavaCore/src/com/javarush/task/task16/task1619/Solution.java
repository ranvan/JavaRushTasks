package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    static boolean exit = false;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        exit = true;
    }

    public static class TestThread implements Runnable {
        boolean isCancel = false;
        public void run() {
            while (!exit) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
