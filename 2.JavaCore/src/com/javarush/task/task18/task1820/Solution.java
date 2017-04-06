package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream(file2);

        ArrayList <Double> list = new ArrayList<>();
        String tmp="";
        String result="";

        while (in.available()>0){
            char ch = (char) in.read();
            if(ch!=' ' && in.available()!=0) {
                tmp+=ch;
            }
            else if(ch==' ' && in.available()!=0){
                list.add(Double.parseDouble(tmp));
                tmp="";
            }
            else if(ch!=' ' && in.available()==0){
                tmp+=ch;
                list.add(Double.parseDouble(tmp));
                tmp="";
            }
        }

        int[] arr = new int[list.size()];

        for(int i=0 ; i< list.size() ; i++){
            arr[i] = (int) Math.round(list.get(i));
            result+=arr[i]+" ";
        }

        byte[] b = result.getBytes();
        out.write(b);

        in.close();
        out.close();


    }
}
