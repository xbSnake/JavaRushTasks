package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        List<String> words = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(bufferedReader.readLine()),"UTF-8"));
        bufferedReader.close();
        while (fileReader.ready())
            words.addAll(Arrays.asList(fileReader.readLine().split(" ")));
        fileReader.close();

        for(int i=0; i< words.size()-1; i++){
            for(int j =i+1; j<words.size(); j++){
                StringBuilder sb = new StringBuilder(words.get(j));
                String s1 = sb.reverse().toString();
               if(words.get(i).equals(s1)) {
                   Pair pair = new Pair();
                   pair.first = words.get(i);
                   pair.second = words.get(j);
                   if (!result.contains(pair))
                       result.add(pair);
               }
            }
        }
        for(Pair p : result)
            System.out.println(p);

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
