package com.company.Lesson.OOP.Lesson27;

public class Task1 extends Thread {
    private static final Object lock = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (lock){
                try {
                    System.out.println(getName());
                    lock.notify();
                    lock.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
