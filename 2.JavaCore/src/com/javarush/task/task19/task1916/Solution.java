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
        ArrayList<String> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();

        while (fileReader1.ready()){
            list1.add(fileReader1.readLine());
        }
        while (fileReader2.ready()){
            list2.add(fileReader2.readLine());
        }

        reader.close();
        fileReader1.close();
        fileReader2.close();

        boolean stoped=false;
        int i=0;
        while(i<list1.size() || i<list2.size()){
            try {
                if (list1.get(i).equals(list2.get(i)) )
                    i++;
                else if (list1.get(i).equals(list2.get(i + 1))) {
                    list1.add(i, " ");
                    i++;
                } else if (list1.get(i + 1).equals(list2.get(i)) ) {
                    list2.add(i, " ");
                    i++;
                }
            }catch(IndexOutOfBoundsException e ){
                if(list1.size()<list2.size()){
                    list1.add(" ");
                    i++;}
                else {
                    list2.add(" ");
                    i++;
                }
            }

        }


        for(int j=0; j<list1.size(); j++){
            if(list1.get(j).equals(" "))
                lines.add(new LineItem(Type.ADDED, list2.get(j)));
            else if(list2.get(j).equals(" "))
                lines.add(new LineItem(Type.REMOVED, list1.get(j)));
            else
                lines.add(new LineItem(Type.SAME, list1.get(j)));
        }


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
