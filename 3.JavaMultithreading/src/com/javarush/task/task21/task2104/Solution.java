package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object  obj) {

        if(this==obj) return  true;
        if(!(obj instanceof Solution)) return false;
        if(obj==null) return  false;


       Solution n = (Solution)obj;
       if(first != n.first) return false;
       if(last != n.last) return  false;

        return true;
    }

    public int hashCode() {
        int result = 17;
        result =  31 * result +(first == null ? 0 : first.hashCode());
        result =  31 * result+ (last == null ? 0 : last.hashCode());

        return  result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
