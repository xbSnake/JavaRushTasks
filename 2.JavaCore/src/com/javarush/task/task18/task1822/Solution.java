package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(read.readLine()));

        int id = Integer.parseInt(args[0]);

        while (true){

            String s = reader.readLine();
            if (s==null)
                break;

            if(id==Integer.parseInt( s  .split(" ")[0])){
                System.out.println(s);
                break;
            }

        }
        read.close();
        reader.close();
    }
}
