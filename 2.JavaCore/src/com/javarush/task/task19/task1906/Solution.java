package com.javarush.task.task19.task1906;

/* 
Четные байты
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();

        FileReader reader = new FileReader(file1);
        FileWriter writer = new FileWriter(file2);
        int i=0;
        while (reader.ready()){
            i++;
            int data = reader.read();
            if (i%2==0) {
                writer.write(data);
            }

        }
        reader.close();
        writer.close();


    }
}
