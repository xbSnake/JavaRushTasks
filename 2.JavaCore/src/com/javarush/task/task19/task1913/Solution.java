package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
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
        String s = out.toString();
        String s1 = "";
        for (char ch:s.toCharArray() ) {
           if(isNumeric(ch))
               s1+=ch;
        }
        System.setOut(printStream);
        System.out.println(s1);
    }
    static boolean isNumeric(char ch){
        try{
            Integer.parseInt(ch+"");
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
