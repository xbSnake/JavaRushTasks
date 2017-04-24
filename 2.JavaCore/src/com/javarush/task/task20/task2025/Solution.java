package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
Алгоритмы-числа
*/
public class Solution {
    public static void main(String[] args) {
        int number = 10000000;
        long freeMemory = Runtime.getRuntime().freeMemory();
        long startTime = System.currentTimeMillis();
        long[] a = getNumbers(number);
        long memoryAfterCalculate = Runtime.getRuntime().freeMemory();
        long delta = memoryAfterCalculate - freeMemory;
        long stopTime = System.currentTimeMillis();
        System.out.println("Calculating time: " + (stopTime - startTime));
        System.out.println("Used JVM memory: " + delta);
        for (long i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static long[] getNumbers(long N) {
        Vector<Long> v = new Vector<>();
        for (long i = 1; i < N; i++) {
            if (checkFormula(i)) v.add(i);
        }
        long[] result = new long[v.size()];
        for (int i = 0; i < v.size(); i++) {
            result[i] = v.get(i);
        }
        return result;
    }

    public static boolean checkFormula(long number) {
        if (number == 0) return false;
        else if (number >= 1 && number < 10) return true;
        long     rest = number,
                sum = 0,
                digit = 0,
                digitCount = 1 + (int) Math.log10(number);
        for (int i = 0; i < digitCount; i++) {
            digit = rest % 10;
            rest = rest / 10;
            long prod = digit;
            for (int j = 1; j < digitCount; j++) {
                prod *= digit;
            }
            sum += prod;
        }
        if (sum == number)
            return true;
        else
            return false;
    }
}