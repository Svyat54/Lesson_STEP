package com.company.Lesson.OOP.Lesson22;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Queve q = new Queve(10);
//        for (int i = 0; i < 5; i++){
//            q.push(i);
//        }
//        q.push(9);
//        q.pop();
//        q.pop();
//        q.pop();
//        q.print();
//        q.pop();
//        for (int i = 11; i < 17; i++){
//            q.push(2 * i);
//        }
//        q.print();

        DeQueue deQueue = new DeQueue(15);
        for (int i = 0; i < 5; i++){
            deQueue.addFirst(i);
        }
        deQueue.print();
        for (int i = 0; i < 5; i ++)
        {
            deQueue.addLast(2 * i);
        }
        deQueue.print();
        for (int i = 0; i < 5; i++) {
            deQueue.addFirst(i / 2);
        }
        deQueue.print();
        System.out.println(deQueue.removeFirst());
        deQueue.print();
    }

}
