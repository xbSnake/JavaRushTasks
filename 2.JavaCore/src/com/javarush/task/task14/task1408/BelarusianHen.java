package com.javarush.task.task14.task1408;


 public class BelarusianHen extends Hen{

     int getCountOfEggsPerMonth() {

         return 324 ;
     }
     String getDescription(){
         return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.BELARUS, getCountOfEggsPerMonth());
     }
 }