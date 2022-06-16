package com.company.Lesson.OOP.Lesson25;
// засечь время выполнения  50000 и 100000
// и попробовать в однопоточном режиме это запустить
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class First{
    First() throws IOException {
        String path = "First.txt";
        BufferedWriter bwr = new BufferedWriter(new FileWriter(path));
        for (int i = 0; i < 100; i++) {
            bwr.write(i + "\n");
            bwr.flush();
        }
        bwr.close();
    }
}

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        FileWriter writer1 = new FileWriter("First.txt");
        FileWriter writer2 = new FileWriter("Second.txt");
        FileWriter writer3 = new FileWriter("3.txt");

        First one = new First();
        Thread thread1 = new Thread(1,"First.txt");
        Thread thread2 = new Thread(2,"Second.txt");
        Thread thread3 = new Thread(3,"3.txt");

        System.out.println("Start Thread ");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Start JoinThread ");
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Close");


    }
}
