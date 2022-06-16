package com.company.Lesson.OOP.Lesson23;

import java.util.Arrays;
//DZ
//Добавить время +
//Посмотреть сколько времени займет выполнение задачи в один поток +
//Запустить задачу в 10 потоков, сравнить результаты
public class Main {
    public static void main(String[] args) {
//        Potoc oneThread = new Potoc(" Первый поток",250);
//        oneThread.start();
//        Potoc twoThread = new Potoc(" Второй поток",4);
//        twoThread.start();


//        try {
//            oneThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            twoThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        multyThread thread = new multyThread(5);
//        thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        System.out.println("Программа завершена");

        multyThread[] arrThreads = new multyThread[5];
        long time = System.currentTimeMillis();
        for (int i = 0; i < arrThreads.length; i++) {
            arrThreads[i] = new multyThread(i+1);
            arrThreads[i].start();
        }

        int count = 0;
        for (int i = 0; i < arrThreads.length; i++) {
            count++;
            try {
                arrThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток "+ count + " - " + (System.currentTimeMillis() - time) + " sec");
        }

        long sum = 0;
        for(int i = 0; i < arrThreads.length; i++ ) {
            sum += arrThreads[i].getSum();
        }
        System.out.println("Сумма: "+sum);
        System.out.println("Время: " + (System.currentTimeMillis() - time) + " sec");
    }
}
