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

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int [] count =  new int[33];

        for(int i =0; i<list.size(); i++) {

                for (int k = 0; k < 32; k++) {
                    char[] tmp = list.get(i).toCharArray();
                    int n = tmp.length;
                    for (int z = 0; z< n; z++)
                        if (tmp[z] == alphabet.get(k))
                            count[k]++;


                }


        }





        for(int i=0; i<32; i++)
            System.out.println(alphabet.get(i)+ " "+ count[i]);




    }

}
