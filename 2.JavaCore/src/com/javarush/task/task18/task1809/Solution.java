package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream fin = new FileInputStream(file1);
        FileOutputStream fout = new FileOutputStream(file2);

        byte[] buffer = new byte[fin.available()];
        int count = fin.read(buffer);

        for(int i=count; i>0; i--){

            fout.write(buffer[i-1]);
        }

        fin.close();
        fout.close();

    }
}
