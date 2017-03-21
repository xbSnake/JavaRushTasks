package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/* 
Количество букв
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(int i=0;i<32;i++)
        {
            alphabet.add( (char) ('а'+i));
        }
        alphabet.add(6,'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<10;i++)
        {
            String s = reader.readLine();
            list.add( s.toLowerCase());
        }

        //склеить все строки в одну
        String s ="";
        for (int i=0;i<list.size();i++)
            s += list.get(i).toString();

        //бежим по массиву букв
        for (Character c1 : alphabet)
        {
            int count = 0;
            for (Character c2 : s.toCharArray()) //бежим по массиву строки
            {
                if (c2.equals(c1)) count++; //если символы совпадают, то счетчик +1
            }
            System.out.println(c1 + " " + count); // по окончании проверки печатаем и переходим к следующей букве
        }
    }
}
