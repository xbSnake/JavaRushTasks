package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        int index = 0;
        int count =0;
        if (string==null) throw  new TooShortStringException();

        while (count!=2 && index !=-1){
            index = string.indexOf("\t", index);
            if (index != -1) {
                index++;
                count++;
            }
        }
        if (count<2) throw  new TooShortStringException();

        return string.substring(string.indexOf("\t")+1,index-1 );
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
