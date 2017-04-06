package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream1 = new FileInputStream(file1);
        byte[] buffer = new byte[inputStream1.available()];
        int count = inputStream1.read(buffer);
        inputStream1.close();

        FileOutputStream outputStream1 = new FileOutputStream(file1);
        FileInputStream inputStream2 = new FileInputStream(file2);

        while (inputStream2.available()>0){
            outputStream1.write(inputStream2.read());
        }
        outputStream1.write(buffer,0,count);


        outputStream1.close();
        inputStream2.close();

    }
}
