package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null || telNumber.length() < 10) return false;
        if(telNumber.matches("\\+\\d{12}")) return true;
        if(telNumber.matches("^\\d\\d{9}")) return true;
        if(telNumber.matches("^\\(\\d{3}\\)\\d{7}")) return true;
        if(telNumber.matches("^\\+\\d{2}\\(\\d{3}\\)\\d{7}")) return true;
        if(telNumber.matches("^\\+\\d{2}\\(\\d{3}\\)\\d+-\\d+")) return true;
        if(telNumber.matches("^\\+\\d{2}\\(\\d{3}\\)\\d+-\\d+-\\d")) return true;


        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkTelNumber("+380501234567"));
        System.out.println(checkTelNumber("+38(050)1234567"));
        System.out.println(checkTelNumber("+38050123-45-67"));
        System.out.println(checkTelNumber("050123-4567"));
        System.out.println(checkTelNumber("+38)050(1234567"));
        System.out.println(checkTelNumber("38(050)1-23-45-6-7"));
        System.out.println(checkTelNumber("050ххх4567"));
        System.out.println(checkTelNumber("050123456"));
        System.out.println(checkTelNumber("(0)501234567"));
    }
}
