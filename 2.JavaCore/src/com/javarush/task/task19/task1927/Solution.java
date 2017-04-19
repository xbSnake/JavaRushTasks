package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(out);
        System.setOut(stream);

        testString.printSomething();

        String container = out.toString();
        int count = 1;
        System.setOut(printStream);

        String[] words = container.split("\n");


        int i;
        for (i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            if (count % 2 == 0) {
                System.out.println("JavaRush - курсы Java онлайн");
            }
            count++;
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
