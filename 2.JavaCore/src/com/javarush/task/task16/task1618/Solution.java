package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
       TestThread thread = new TestThread();
       thread.start();
       Thread.sleep(3000);
       thread.interrupt();
    }

    static  void sout() throws InterruptedException {
        System.out.println("I am alive");
        Thread.sleep(1000);
    }

    public static class TestThread extends Thread
    {
        @Override
        public void run() {
            Thread current = Thread.currentThread();

            while (!current.isInterrupted())
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");
            }



        }
    }
}
