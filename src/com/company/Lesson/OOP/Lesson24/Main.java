package com.company.Lesson.OOP.Lesson24;

import java.io.*;

//почитать к занятию про мьютекс и работу с файлами
public class Main {
    public static void main(String[] args) throws IOException {
//        Thread th = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                String path = "text.txt";
//                String str = null;
//                BufferedReader br = null;
//                try {
//                    br = new BufferedReader(new FileReader(path));
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//                while (true){
//                    try {
//                        if (!((str = br.readLine()) != null)) break;
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(str + " Thread");
//                }
//            }
//        });
//        th.start();
        String path = "text.txt";
        String str = "Hello people";
//        // Чтение из файла
//        BufferedReader br = new BufferedReader(new FileReader(path)); // Чтение файла
//        while ((str = br.readLine()) != null){  //открываем файл записываем строку и проверяем на наличие текста.
//            System.out.println(str);
//        }
//        br.close(); // закрываем буфер

        //Запись в файл
        Thread th = new Thread(new Runnable() {
            String path = "text.txt";
            String str = "Hello people thread";

            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    BufferedWriter bw = null;
                    try {
                        bw = new BufferedWriter(new FileWriter(path, true));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        bw.write(str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        bw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        th.start();
        for (int i = 0; i < 10000; i++) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            bw.write(str); // Записываем
            bw.close(); // Закрываем
//        bw.flush(); // чистим буффер
        }

    }
}
