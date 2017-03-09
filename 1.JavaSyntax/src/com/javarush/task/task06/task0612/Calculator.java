package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int p = a+b;
        return p;
    }

    public static int minus(int a, int b) {
        int m = a-b;
        return m;
    }

    public static int multiply(int a, int b) {
        int mu = a*b;
        return mu;
    }

    public static double division(int a, int b) {
        double d = (double)(a)/(double)(b);
        return d;
    }

    public static double percent(int a, int b) {
        double p = (double)(a)/100*(double)(b);
        return p;
    }

    public static void main(String[] args) {

    }
}