package com.javarush.task.task14.task1408;

/**
 * Created by s35227 on 23.06.2017.
 */
public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 5;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
