package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
       long[] result = null;
        ArrayList<Long> res = new ArrayList<>();

        for(long i=1; i<=N;i++) {
            LinkedList<Integer> list = new LinkedList<>();

            long j=i;
            while (j> 0) {
                list.addFirst((int) (j   % 10));
                j = j/ 10;
            }

            int summ = 0;
            for (int n : list)
                summ += Math.pow(n, list.size());
            if (summ == i)
                res.add(i);

        }

        System.out.println("sss");

        result = new long[res.size()];
        for(int i=0; i<result.length; i++)
            result[i] = res.get(i);

        return result;

    }

    public static void main(String[] args) {

      long[] numbers= getNumbers(100000000);
        System.out.println("sss");
    }
}
