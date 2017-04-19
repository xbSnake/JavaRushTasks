package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String result = "";

        while (reader.ready()){
            String line = reader.readLine();
            String[] sarr = line.split(" ");
            for (String s : sarr) {
                if(s.length()>6)
                    result+=s+",";

            }
        }
        writer.write(result.substring(0,result.length()-1));
        reader.close();
        writer.close();

    }
}
