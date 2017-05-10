package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {

        int indexOfFourht =0;
        int count = 0;

        if (string==null)
            throw  new TooShortStringException();


        while(count<4 && indexOfFourht!= -1){
            indexOfFourht = string.indexOf(" ",indexOfFourht+1);
            if(indexOfFourht != -1)
                count++;
        }

        if (count<4) {
            throw new TooShortStringException();
        }

        int lastIndex =0;
        if (string.indexOf(" ",indexOfFourht+1)!=-1)
            lastIndex = string.indexOf(" ",indexOfFourht+1);
        else
            lastIndex = string.length();

        String s = string.substring(string.indexOf(" ")+1,lastIndex );
        return s ;
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
