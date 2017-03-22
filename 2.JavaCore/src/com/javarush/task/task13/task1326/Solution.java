package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        String s ="";
        while(inStream.available()>0){

            char c = (char)inStream.read();


            if(c!='\r'){
                if(c!='\n')

                    s+=c;
                else{
                        int i = Integer.parseInt(s);
                        list.add(i);
                        s = "";
                    }
            }
        }

        for(int i=0; i<list.size();i++)
            if(list.get(i) %2 != 0 ) {
                list.remove(i);
                i--;
            }

        Collections.sort(list);
        for(int i : list)
            System.out.println(i);
        inStream.close();

    }
}
