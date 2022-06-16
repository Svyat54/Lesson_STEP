package com.company.Lesson.OOP.Lesson23;

public class multyThread extends Thread{
    private int numThread;
    private long sum;

    public int getNumThread() {
        return numThread;
    }

    public multyThread(int numThread){
        this.numThread = numThread;
        this.sum = 0;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
//        if (numThread == 0) {
//            return;
////            multyThread thread = new multyThread(numThread - 1);
////            thread.start();
////            try {
////                thread.join();
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//        }
//        multyThread thread = new multyThread(numThread - 1);
//        thread.start();
//        for (int i = 0; i < 5; i++){
//            try {
//                sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Поток " + numThread);
//        }
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        long time = System.currentTimeMillis();
        for(int i =0; i < (numThread + 1) * 1000000 ; i++){
            sum += i;
//            sum++;
        }
//        System.out.println("Поток "+ numThread + " " + (System.currentTimeMillis() - time));
//        System.out.println(System.currentTimeMillis() - time);

        }

    }

