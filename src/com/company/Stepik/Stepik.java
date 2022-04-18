package com.company.Stepik;
import java.util.Scanner;
public class Stepik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       /* int a = sc.nextInt();
        System.out.println("The next number for the number " + a + " is " + (a + 1) + ".");
        System.out.println("The previous number for the number " + a + " is " + (a - 1) + ".");

        //На одной строчке через запятую записаны два целых числа: длина и ширина прямоугольника. Вычислите его площадь и периметр (именно в таком порядке). Результат выведите на разных строках.
        int x = 5, y = 10;

        System.out.println(x * y);
        System.out.println(2*(x+y));
        // Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы.
        //Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у чётных и у нечётных чисел.
        int n = sc.nextInt();
        System.out.print(n+2-(n%2));

        //Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
        //Программа получает на вход три числа: a, b, n.
        //Программа должна вывести два числа: стоимость покупки в рублях и копейках.

        System.out.print("Стоимость пирожка в рублях: " );
        int a = sc.nextInt()*100;
        System.out.print("Стоимость в копейках: " );
        int b = sc.nextInt()+a;
        System.out.print("Кол-во пирожков: " );
        int n = sc.nextInt();


       // System.out.println("Стоимость в рублях: " + (a * n) + " Стоикость в копейках: " + (b * n) );
        //System.out.println((a*n) + (b*n)/100 + "  " + (b*n)%100);
        System.out.println(( (b * n) - ((b * n) % 100)) / 100 + " " + (b*n)%100);
        //Дано трехзначное число. Найдите сумму его цифр.
        int a = sc.nextInt();
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        System.out.print(b+c+d);

//Длина Московской кольцевой автомобильной дороги —109 километров. Байкер Вася стартует с нулевого километра МКАД и едет со скоростью v километров в час. На какой отметке он остановится через t часов?
//Программа получает на вход значения v и t. Если v>0, то Вася движется в положительном направлении по МКАД, если же значение v<0, то в отрицательном.
//Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.
        int v = sc.nextInt();
        int t = sc.nextInt();
        int l = 109;

        System.out.println((l+(v*t))%l);
        //Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?

        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = h - b;
        int p = a - b;
        int x = (q + p - 1)/p;
        System.out.println(x); */

        //        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        if (!s1.equals(s2)) {
//            System.out.println("Строки не совпадают");
//        }else{
//            System.out.println("Строки совпадают");
//        }

        int first = 15;// будет = 14 из-за операции внизу
        int second = --first;//14
        second *= 2; // 28
        int third = second - 13; // 15
        System.out.println(first);
        System.out.println(third);
        if (first == third) {
            System.out.println(--second);
        }
        else{
            System.out.println(third - first + second); // 15 - 14 + 28 = 1 + 28 = 29
        }
    }
}
