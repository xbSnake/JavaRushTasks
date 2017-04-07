package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        while(!s.equals("exit")){
            new ReadThread(s).start();
            s = reader.readLine();
        }

    }

    public static class ReadThread extends Thread {
        private String  fileName;
        public ReadThread(String fileName) {
           this.fileName = fileName;
        }

        @Override
        public void run() {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int maxKey=0;
            int maxcount=0;
            try {
                FileInputStream in = new FileInputStream(fileName);

                while(in.available()>0){
                    int b = in.read();
                    if(map.containsKey(b))
                        map.put(b, map.get(b)+1);
                    else
                        map.put(b,1);
                }
                for(Map.Entry<Integer, Integer> entry: map.entrySet() ){
                    if(entry.getValue()>maxcount) {
                        maxcount = entry.getValue();
                        maxKey = entry.getKey();
                    }
                }

                resultMap.put(fileName, maxKey);
                in.close();

            } catch (java.io.IOException e) {
                e.printStackTrace();
            }



        }
    }
}
