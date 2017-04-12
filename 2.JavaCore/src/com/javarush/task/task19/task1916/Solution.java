package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader1 = new BufferedReader( new FileReader(reader.readLine()));
        BufferedReader fileReader2 = new BufferedReader( new FileReader(reader.readLine()));
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        while (fileReader1.ready()){
            list1.add(fileReader1.readLine());
        }
        while (fileReader2.ready()){
            list2.add(fileReader2.readLine());
        }

        boolean stoped=false;
        int i=0;
        while(!stoped){
            if(list1.get(i).equals(list2.get(i))&& i<list1.size()-1 && i<list2.size()-1)
                i++;
            else if(list1.get(i).equals(list2.get(i+1))&& i<list1.size()-1 && i<list2.size()-1){
                list1.add(i," ");
                i++;}
            else if(list1.get(i+1).equals(list2.get(i))&& i<list1.size()-1 && i<list2.size()-1){
                list2.add(i," ");
                i++;}


        }

        System.out.println("ss");
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
