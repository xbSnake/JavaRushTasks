package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream strem = new PrintStream(out);
        System.setOut(strem);

        testString.printSomething();

        String s = out.toString();
        String[] sarr = s.split(" ");
        System.setOut(printStream);
        switch (sarr[1]){
            case "+":
                int summ = Integer.parseInt(sarr[0])+Integer.parseInt(sarr[2]);
                System.out.printf("%s + %s = %s",sarr[0],sarr[2],summ);break;
            case "-":
                int minus = Integer.parseInt(sarr[0])-Integer.parseInt(sarr[2]);
                System.out.printf("%s - %s = %s",sarr[0],sarr[2],minus);break;
            case "*":
                int mult = Integer.parseInt(sarr[0])*Integer.parseInt(sarr[2]);
                System.out.printf("%s * %s = %s",sarr[0],sarr[2],mult);break;
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

