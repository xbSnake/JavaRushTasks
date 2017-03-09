package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int numb = Math.abs(Integer.parseInt(reader.readLine()));

        while(numb!=0){
            if(numb%2==0)
                even++;
            else
                odd++;
            numb/=10;
        }
        System.out.println("Even: "+ even +" Odd: "+odd);

    }
}
