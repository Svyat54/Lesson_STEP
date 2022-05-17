package com.company.Lesson.OOP.Lesson23;

public class Potoc extends Thread{
   private String name;
   private int delay;

    public Potoc(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                sleep(500 + this.delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((i+1) + this.name);
        }
    }
}
