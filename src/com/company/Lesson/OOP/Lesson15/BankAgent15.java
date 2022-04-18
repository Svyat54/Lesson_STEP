package com.company.Lesson.OOP.Lesson15;

public class BankAgent15 {

    public BankAgent15(double vklad) {
        this.vklad = vklad;
    }

    public void getMoney(int money){
        if (this.vklad > money){
            this.vklad -= money;
            BankAgent15.kazna += money;
        }
        else {
            System.out.println("Ошибка не хватает денег");
        }
    }

    public static double kazna = 0;

    public double vklad;

    public void getInfo(){
        System.out.println(this.vklad + " Денег на счету у Агента");
    }
    public static void getKazna(){
        System.out.println(BankAgent15.kazna + " Денег в казне");
    }
}
