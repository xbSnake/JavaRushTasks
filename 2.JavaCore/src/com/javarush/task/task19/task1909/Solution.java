package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(br.readLine()));
        String str="";

        while (reader.ready()){
          str+=(char) reader.read();
        }
        str = str.replace(".", "!");
        writer.write(str);
        reader.close();
        writer.close();
        br.close();
    }
}
