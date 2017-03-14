package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       char[] chars = reader.readLine().toCharArray();

        String onlyVovels = "";
        String others = "";

        for (char c : chars) {
            if (isVowel(c))
                onlyVovels+= c+" ";
            else if(c==' '){continue;}
            else
                others+= c+" ";
        }

        System.out.println(onlyVovels);
        System.out.println(others);
    }

    // метод проверяет, гласная ли буква
     public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}