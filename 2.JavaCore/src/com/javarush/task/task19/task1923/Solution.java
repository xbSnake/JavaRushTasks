package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        while( reader.ready()){
            String line = reader.readLine();
            String[] sarr = line.split(" ");

            for(String s : sarr){
                if (s.matches("(\\w|\\W)*?\\d+(\\w|\\W)*?"))
                    writer.write(s+" ");
            }
        }
        reader.close();
        writer.close();

    }
}
