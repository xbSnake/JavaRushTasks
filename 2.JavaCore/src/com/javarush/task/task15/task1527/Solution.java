package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       char[] charArray = reader.readLine().toCharArray();
       int startIndexPar = 0;
       int startindexValue=0;
       ArrayList<String> parameter = new ArrayList<>();
       ArrayList<String> value = new ArrayList<>();
       boolean parFlag=false;
       boolean valFlag=false;
       String sPar="";
       String sValue="";

       for(int i=1; i<charArray.length; i++){

           if (charArray[i-1]=='?'|| charArray[i-1]=='&') {
               parFlag = true;
               startIndexPar = i;
           }
           if(parFlag && charArray[i]!='=' && charArray[i]!='?'&& charArray[i]!='&')
               sPar+=charArray[i];
           if(charArray[i]=='='|| (parFlag && charArray[i]=='&' && (i-startIndexPar)>0)) {
               parameter.add(sPar);
               sPar="";
               parFlag=false;
               startIndexPar = 0;
           }
           if (charArray[i]=='=')
               valFlag=true;
           if(valFlag && charArray[i]!='=' && charArray[i]!='?'&& charArray[i]!='&' )
               sValue+=charArray[i];
           if(charArray[i]=='&' || i==charArray.length-1) {
               value.add(sValue);
               sValue="";
               valFlag = false;
           }

       }

       for(String s : parameter)
           System.out.print(s+ " ");
        System.out.println();

        for(int i=0; i<parameter.size(); i++)
            if (parameter.get(i).equals("obj")){
            if(isNumeric(value.get(i)))
                alert(Double.parseDouble(value.get(i)));
            else
                alert(value.get(i));

            }
    }
    public static  boolean isNumeric(String s){

        try{
            Double.parseDouble(s);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
