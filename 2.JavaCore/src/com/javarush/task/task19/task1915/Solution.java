package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream strem = new PrintStream(out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fw = new FileOutputStream(br.readLine());

        System.setOut(strem);
        testString.printSomething();
        String s = out.toString();

        fw.write(s.getBytes());

        System.setOut(printStream);
        System.out.println(s);
        br.close();
        fw.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

