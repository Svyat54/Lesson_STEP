/*package com.company;
import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        // Task01
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = sc.nextInt();
        System.out.print("Введите второе число: ");
        int y = sc.nextInt();
        double z = (double) x / y;
        System.out.println("Деление x на y: " +z);
        System.out.println("Остаток от деления: " +x%y);
        System.out.println("Квадратный корень: " + Math.pow(x, 2));

//         Task02
        System.out.print("Введите 3-х значное число: ");
        int numb = sc.nextDouble();
        int n = (numb / 100) + (numb % 10) + ((numb / 10) %10);
        System.out.println("Сумма чисел "+numb + " = "  +  n);

//        Task03

        double n = sc.nextDouble();
        // System.out.println(Math.round(n));
        double a = n % 1;
        double b = 1 - a;
        if (n % 1 != 0){
            System.out.println(n + b);
        }
        else {
            System.out.println(n);
        }

//        Task04
        System.out.println("Hello\tWorld!");

//        Task05
        final double p = 3.1415;
        System.out.print("Введите R: ");
        int R = sc.nextInt();
        System.out.println("Длина круга = "+ p * Math.pow(R, 2));
        System.out.println("Площадь круга = " + 2 * p * R);

//        Task06
        System.out.print("Введите ширину: ");
        int w = sc.nextInt();
        System.out.print("ведите высоту: ");
        int h = sc.nextInt();
        System.out.println("Периметр = " + 2 * (w + h));
        System.out.println("Площадь = " + w * h);


//        Task07
        System.out.print("Введите % ");
        int a = sc.nextInt();
        System.out.print("Сумма вклада: ");
        int b = sc.nextInt();
        System.out.print("Введите кол-во лет: ");
        int d = sc.nextInt();
        int c = (a * b * d) / 100;
        System.out.println("Сумма через указанный срок : "+ (b + c));

//        Task08
        System.out.print("Введите V: ");
        double V = sc.nextDouble();
        System.out.print("Введите T: ");
        double T = sc.nextDouble();
        double S = V * T;
        System.out.println("Расстояние = "+ S);

//        Task09
        double x = sc.nextDouble();
        if (x != (int)x) {
            System.out.println("Вещественная часть есть");
        }
        else {
            System.out.println("Нет вещественной части");
        }

//        Task10
        System.out.print("Введите рост: ");
        int height = sc.nextInt();
        System.out.print("Введите вес: ");
        int weight = sc.nextInt();
        int idealw = height - 110;
        System.out.println("Идеальный вес: " + idealw);

        if (weight == idealw){
            System.out.println("Perfect");
        }
        else {
            if (weight < idealw){
                System.out.println("Нужно набрать до идеала: " + (idealw - weight));
            }
            if (weight > idealw){
                System.out.println("Нужно скинуть до идеала: " + (weight - idealw));
            }
        }

//         Task11
        System.out.print("Введите кол-во секунд до НГ: ");
        double second = sc.nextDouble();
        double minute = second / 60;
        double hour = minute / 60;
        double days = hour / 24;
        final double NGdays = 365;
        final double NGhour = NGdays * 24;
        final double NGmin = NGhour * 60;
        final double NGsec = NGmin * 60;

        System.out.println("Дней: "+(NGdays - days)+ " Часов: "+(NGhour - hour)+ " Минут: "+(NGmin - minute)+ " Секунд: " +(NGsec - second));


        // Task 12
        System.out.print("Кол-во первоклашек: ");
        int n = sc.nextInt();
        System.out.print("Введите средний вес первоклашек: ");
        double height = sc.nextDouble();
        final int h = 30;
        final int h6 = 42;
        final double h1 = 59.7;

        final double pie = 1;
        final double milk = 0.9;
        final double Glass = 0.2;
        double pie10 = n * pie, pie6 = (n * pie) / 100 * 60, pie1 = (n * pie) / 100 * 1;
        double Glass10 = (n * Glass) / milk, Glass6 = ((n * Glass) / 100 * 60) /milk, Glass1 = ((n * Glass) / 100 * 1) /milk;

        if (height / n < h) {
            System.out.println("в школе 100% всех учеников, вес которых меньше 30 кг: " + "Пирожков- " + pie10 + " Пакета молока - " + Glass10);
        } else {
            if (height / n >= h && h6 > height / n) {
                System.out.println("в школе 60% учеников имеют вес меньше 30 кг: " + "Пирожков - " + pie6 + " Пакета молока - " + Glass6);
            }
            if (height / n >= h6 && h1 >= height / n) {
                System.out.println("если в школе 1% учеников имеют вес меньше 30 кг: " + "Пирожков - " + pie1 + " Пакета молока - " + Glass1);
            }
        }
    }
} */
