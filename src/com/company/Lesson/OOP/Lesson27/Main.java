package com.company.Lesson.OOP.Lesson27;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//2 - Два потока разделяют общий буфер данных, размер которого ограничен N. Если буфер пуст, потребитель ждет пока производитель заполняет буфер полностью.
// Когда буфер заполнен полностью производитель ждет, пока потребитель заберет данные и место освободится.

public class Main {
        public static void main(String[] args) throws InterruptedException {
            int[] array = new int[100000000];
            long sum = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 50);
                sum += array[i];
            }

            long t = System.currentTimeMillis();
            MyThread threadF = new MyThread(1, array);
            MyThread threadL = new MyThread(2, array);

            threadF.start();
            threadL.start();
            threadF.join();
            threadL.join();
            System.out.println(MyThread.getResult(1));
            System.out.println("Время:" + (System.currentTimeMillis() - t));
            System.out.println("\n");

            t = System.currentTimeMillis();
            MyThread threadT = new MyThread(3, array);

            threadT.start();
            threadT.join();
            System.out.println(MyThread.getResult(2));
            System.out.println(System.currentTimeMillis() - t);

            //Task1 - Напишите программу, в которой создаются два потока, которые выводят на консоль свое имя по очереди
//            Object lock = new Object();
//            new Task1().start();
//            new Task1().start();
        }
    }

