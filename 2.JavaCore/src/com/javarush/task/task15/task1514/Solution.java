package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.5,"sss");
        labels.put(13.5,"ssw");
        labels.put(3.5,"szs");
        labels.put(5.5,"ss");
        labels.put(2.7,"ses");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
