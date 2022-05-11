package com.company.Lesson.Lesson1_10;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* System.out.print("Введите число 1 ");
        int s = sc.nextInt();
        System.out.print("Введите число 2 ");
        int h = sc.nextInt();

        double y = (double) s * h / 3; //Объём треугольника
        System.out.println("Итог " + y);*/
        /* 9
        System.out.print("Введите R: ");
        int R = sc.nextInt();
        final double p = 3.1415;
        System.out.print("Введите H: ");
        int H = sc.nextInt();
//        Объём шара
//        System.out.print(4.0/3.0 * p * Math.pow(R, 3));
        // Площадь целиндра
        System.out.println(2 * p * R * (H + R)); */

        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number ");
        }
        else {
            System.out.println("Odd number ");
        }

    }
}
