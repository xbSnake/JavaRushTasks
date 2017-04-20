package com.javarush.task.task20.task2003;

import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        br.close();
        InputStream inputStream = new FileInputStream(filename);
        load(inputStream);


    }

    public void save(OutputStream outputStream) throws Exception {
        PrintWriter writer = new PrintWriter(outputStream);
        for(Map.Entry<String,String> pair : properties.entrySet() ){
            writer.write(pair.getKey()+"="+pair.getValue());
        }
        writer.close();

    }

    public void load(InputStream inputStream) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        while (reader.ready()){
            String[] sarr = reader.readLine().split("[= :]");
            properties.put(sarr[0],sarr[1]);
        }
        reader.close();


    }

    public static void main(String[] args) {

    }
}
