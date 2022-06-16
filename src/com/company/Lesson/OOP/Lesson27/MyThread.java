package com.company.Lesson.OOP.Lesson27;
import java.io.*;
import java.util.ArrayDeque;

public class MyThread extends java.lang.Thread {
    int id;
    int[] array;
    static long sum1;
    static long sum2;
    static long sum3;

    public MyThread(int id, int[] array) {
        this.id = id;
        this.array = array;
    }

    public static long getResult(int t) {
        if (t == 1)
            return (sum1 + sum2);
        else
            return sum3;
    }

    public void runFirst() {
        for (int i = 0; i < array.length / 2; i++) {
            sum1 += array[i];
        }
    }

    public void runLast() {
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            sum2 += array[i];
        }
    }

    public void runT() {
        for (int i = 0; i < array.length; i++) {
            sum3 += array[i];
        }
    }

//    @Override
    public void run() {
        if (id == 1)
            runFirst();
        if (id == 2)
            runLast();
        if (id == 3)
            runT();
    }
}

