package com.javarush.task.task09.task0909;

/* 
Исключение при работе с массивами
*/

import jdk.nashorn.internal.runtime.ECMAException;

public class Solution {
    public static void main(String[] args) throws Exception {
       try {

           int[] m = new int[2];
           m[8] = 5;
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e.getClass());
       }
        //напишите тут ваш код
    }
}
