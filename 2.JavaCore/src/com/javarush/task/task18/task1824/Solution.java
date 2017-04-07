package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));

       while(true) {
           String s = reder.readLine();
           try {
               FileInputStream in = new FileInputStream(s);
               in.close();
           } catch (FileNotFoundException e) {
               System.out.println(s);
               break;

           }

       }
    }
}
