package com.company.Lesson.Lesson1_10;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Lesson4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //var x = 010;
//        for (int i =0; i <10; i++) {
//            System.out.println("Hello world");
//        }

        //Цикл for может определять сразу несколько переменных и управлять ими
//        int n = 10;
//        for(int i=0, j = n - 1; i < j; i++, j--){
//
//            System.out.printf("число %d умножаем на %d получаем %d \n", i, j, i * j);
//        }


//       int summa = 0;
//       summa = summa + 5;
//       Одно и тоже
//       summa += 5;
//        2 4 6 8
//      for(int i = 2 ; i < 10;i = i + 2)
//      {
//           summa += i;
//      System.out.println("К сумме прибавил " + i + "\nСумма = " + summa);
//      System.out.println("------------");
//
//      }
//      System.out.println(summa);

        // вывести сумму чётных чисел - 2.4.6.8.10 и тд
//        int summa = 0;
//        for (int i = 0; i <= 10; i = i + 2) {
//            System.out.println(i);
//            summa +=i;
//        }
//        System.out.println(summa);

        //вывести сумму нечетных чисел - 1,3,5,7,9
//        int summa = 0;
//        for (int i = 1; i <= 10; i = i + 2) {
//            System.out.println(i);
//            summa +=i;
//        }
//        System.out.println(summa);


        // Цикл с предусловием
//        int j = 0;
//    while (j<5) {
//        System.out.println("Hello");
//        j++;
//    }

        // Цикл с постусловием
//        int z = 15;
//        do {
//            System.out.println("Hello");
//            z++;
//        } while (z<5);


        // Создание игры
//        int random = (int) (Math.random() * 10);
//        int answer;
//        System.out.println("Компьютер загадал число от 0 до 9. Угадай!");
//
//        do {
//            System.out.print("Введите число: ");
//            answer = sc.nextInt();
//            System.out.println("_____________________");
//                    if (answer > random) {
//                        System.out.println("Ваше число больше.\n Попробуйте снова");
//                    }
//                    if (answer < random){
//                        System.out.println("Ваше число меньше.\n Попробуйте снова");
//                    }
//                    }
//        while (answer != random);
//        System.out.println("Вы выиграли!!! Поздравляю");

        // continue
//        for (int i =0; i < 10; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i);
//            } else {
//                continue;
//            }
//            System.out.println(" Вывели четное число");
//        }

        // break
//        int i = 0;
//        while (true){
//            i++;
//            if (i==5){
//                break;
//            }
//        }
//        System.out.println(i);

        // 1
//        int summa = 0;
//      for(int i = 0 ; i < 123;i = i + 7)
//      {
//           summa += i;
//      System.out.println("К сумме прибавил " + i + "\nСумма = " + summa);
//      System.out.println("------------");
//
//      }
//      System.out.println(summa);

        // 2
//        int summa = 0;
//
//        for(int i = 1 ; i < 123;i *= 3)
//        {
//            summa += i;
//            System.out.println("К сумме прибавил " + i + "\nСумма = " + summa);
//            System.out.println("------------");
//
//        }
//        System.out.println(summa);

        //3
//        int summa = 0;
//        for(int i = 0 ; i > -123;i = i - 5)
//        {
//            summa += i;
//            System.out.println("К сумме прибавил " + i + "\nСумма = " + summa);
//            System.out.println("------------");
//        }
//        System.out.println(summa);


//        for (int i = 1; i < 9; i++){
//            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
//        }


        // ДЗ

        //Найти сумму четных чисел от 0 до 100
//        int summ = 0;
//        for (int i = 0; i <= 100; i = i+2){
//            summ +=i;
//            System.out.println("К сумме прибавил " + i + "\nСумма = " + summ); // 2550
//        }

        //Найти сумму нечетных чисел от 0 до 100
//        int summ = 0;
//        for (int i = 1; i <= 100; i = i+2){
//            summ +=i;
//            System.out.println("К сумме прибавил " + i + "\nСумма = " + summ); // 2500
//        }

        //Найти сумму чисел от 0 до 100 (она должна равняться сумме второго и первого пункта)
//        int summ =0;
//        for (int i =0; i <= 100; i++){
//            summ +=i;
//            System.out.println("К сумме прибавили " + i + "\nCумма = " + summ); // 5050
//        }

        //Найти сумму чисел 3 9 81 6561 и так до 12345

//        for (int i = 3; i<=12345; i *= i){
//
//            System.out.println(i);
//        }

        //*Найти сумму чисел 10 5 2.5 1.25 и так до 0.5

//        for (double i = 10; i >=0.5; i/=2){
//            System.out.println( i);
//        }

        // Продолжение....

//        int countPos = 0;
//        int countNeg = 0;
//        int randomNumber;
//        for(int i = 0; i < Math.pow(10,4); i++)
//        {
//            randomNumber = (int)(Math.random() * 100) - 50;
//            if(randomNumber >= 0)
//            {
//                countPos += 1;
//            }
//            else
//            {
//                countNeg += 1;
//            }
//        }
//        System.out.println("Summa pos = " + countPos);
//        System.out.println("Summa neg = " + countNeg);

        // Задание 1 и 2
//            int a = 0;
//            int b = 10;
//            for (int i = a; i <=b;i++){
//                System.out.println(i);
//            if (i%2==0){
//                System.out.println(i);
//            }}

        // Задание 3 среденее
//        int a = 2;
//        int b = 11;
//        int sum = 0;
//        for(int i = a ; i < b; i++)
//        {
//            sum += i;
//        }
//        double average = sum / (double)(b - a);
//        System.out.println(average);

        int a = 5;
        int b = 40;
        for (int i = a;i<=b; i++){
            if (i%3==0){
                System.out.println("Fizz");
            }
        }



            }
}