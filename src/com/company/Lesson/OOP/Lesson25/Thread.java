package com.company.Lesson.OOP.Lesson25;

import java.io.*;
import java.util.ArrayDeque;

public class Thread extends java.lang.Thread{
    private int numb;
    private String filename;
    private static final ArrayDeque<Integer> arrDeq = new ArrayDeque<>();
    private BufferedReader br;
    private BufferedWriter bw;
    private int brsize;
    private static int flag = 0;

    public Thread(int numb, String filename) throws IOException {
        this.numb = numb;
        this.filename = filename;
        if (this.numb == 1) {
            br = new BufferedReader(new FileReader(filename));
        }
        else{
            bw = new BufferedWriter(new FileWriter(filename));
        }
    }

    public void run(){
        String str;
        int number;
        if (this.numb == 1){
            while (true) {
            synchronized (arrDeq) {  //блокируем файл с помощью синхронайз
                for (int i = 0; i < 5; i++) {
                        try {
                            if ((str = br.readLine()) == null) {
                                flag = 1;
                                return;
                            }
                            arrDeq.add(Integer.valueOf(str));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.numb == 2) {
            while ((flag == 0)) {
                synchronized (arrDeq) {
                    if (!arrDeq.isEmpty()) {
                        try {
                                number = arrDeq.pollLast();
                            if (number % 2 != 0) {
                                bw.write(Integer.toString(number) + "\n");
                                bw.flush();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        if (this.numb == 3) {
            while ((flag == 0)) {
                synchronized (arrDeq) {
                    if (!arrDeq.isEmpty()) {
                        try {
                            number = arrDeq.pollLast();
                            if (number % 2 == 0) {
                                bw.write(Integer.toString(number) + "\n");
                                bw.flush();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

    }
}