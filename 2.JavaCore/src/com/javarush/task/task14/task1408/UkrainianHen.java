package com.javarush.task.task14.task1408;

/**
 * Created by Lementarev on 23.03.2017.
 */
public class UkrainianHen extends Hen{

    int getCountOfEggsPerMonth() {

        return 33 ;
    }
    String getDescription(){
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
