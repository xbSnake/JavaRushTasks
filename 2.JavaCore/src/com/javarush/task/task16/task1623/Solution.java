package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        public GenerateThread(){
            super( Integer.toString(++countCreatedThreads));

            start();
        }

        public void run() {

            if (countCreatedThreads<Solution.count){
               Thread thread = new GenerateThread();
                System.out.println(thread);


           }
        }



        public String toString() {
            return  getName()+" created";
        }
    }
}
