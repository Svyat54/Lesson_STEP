package com.company.Stepik.OOP;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
//ООП - Return
public class Stepik6 {
    static HashMap<Integer, Integer> cash;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Task1
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        area(a, b, c);

        //Task2
//        int ro = sc.nextInt();
//        int V = sc.nextInt();
//        int F = arhimed(ro, V);
//        System.out.println("F = " + F +"H");

        //Task3
//        int n = sc.nextInt();
//        sc.nextLine();
//        int[][] mas = new int[n][];
//        for (int i = 0; i < n; i++){
//            String line = sc.nextLine();
//            String[] numbers = line.split(" ");
//            int[] a = new int[numbers.length];
//            for (int j = 0; j < numbers.length; j++)
//                a[j] = Integer.parseInt(numbers[j]);
//            mas[i] = a;
//        }
//        int ans = find_0(mas);
//        if (ans != -1)
//            System.out.println("0 in " + (ans+1) + " line");
//        else
//            System.out.println("0 not found");
//    }

        //Task4
//        String number = sc.nextLine();
//        format_number(number);

        //Пример рекурсии с Кешем
//        cash = new HashMap<>();
//        cash.put(1, 1);
//        cash.put(2, 1);
//        System.out.println(fib(10));

        //Task5
//        int n = sc.nextInt();
//        System.out.println(factorial(n));

        //Task6
//        int d = sc.nextInt();
//        int d = 1; // (1 * 24) * 60 =
////        int h = sc.nextInt();
//        int h = 0; // // 60 * 60 = 3600
////        int m = sc.nextInt();
//        int m = 0; //60
////        int s = sc.nextInt();
//        int s = 0;
//        System.out.println("Секунд прошло: " + second_count(d, h, m, s));

        //Task7
//        int n = sc.nextInt();
//        sc.nextLine();
//        int[][] mas = new int[n][];
//        for (int i = 0; i < n; i++){
//            String line = sc.nextLine();
//            String[] numbers = line.split(" ");
//            int[] a = new int[numbers.length];
//            for (int j = 0; j < numbers.length; j++)
//                a[j] = Integer.parseInt(numbers[j]);
//            mas[i] = a;
//        }
//        int ans = find_line7(mas);
//        if (ans != -1)
//            System.out.println("Сумма строки под номером " + (ans + 1) + " кратна 7");
//        else
//            System.out.println("Таких строк нет");

        //Task8
//        int x1 = sc.nextInt();
//        int y1 = sc.nextInt();
//        int x2 = sc.nextInt();
//        int y2 = sc.nextInt();
//        king_step(x1, y1, x2, y2);

        //Task9
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println(akkerman(m, n));

        //Task10 - Выпуклый многоугольник - Вводится число n (n >= 3), затем даются координаты n точек построчно. Найдите периметр этого многоугольника и его площадь.
        // Выведите ответ построчно. Округлите ваш ответ до сотых.
//        int n = sc.nextInt();
//        int x1 = sc.nextInt(n);
//        int y1 = sc.nextInt();
//        int x2 = sc.nextInt();
//        int y2 = sc.nextInt();
//        area(x1, y1, x2, y2);

        //Task10
//        int n = sc.nextInt() + 3;
//        System.out.println(boll(n));

    }

    //Task1 - Напишите функцию area, которая принимает на вход 3 натуральных числа - ширину, высоту и длину прямоугольного параллелепипеда, а находит и выводит на экран площадь его поверхности.
    // Содержание функции main менять запрещено.
    //Ввод 3, 4, 5 Ответ 94
//    static void area(int a, int b, int c){
//        int s = 2 * (a * b + b * c + a * c);
//        System.out.println(s);
//    }

    //Task2 - Напишите функцию arhimed, которая принимает на вход 2 натуральных числа: плотность жидкости (кг/м^3), в которую погружают тело и объём тела (м^3).
    // Функция должна именно вернуть значение силы Архимеда. Считать g = 10 H/кг. Содержание функции main менять запрещено.
    //Ввод 1000, 2
    //Ответ F = 20000H
//    static int arhimed (int ro, int V){
//        final int g = 10;
//        return g * ro * V;
//    }

    //Task3 - Напишите функцию find_0, которая принимает на вход двумерный массив целых чисел и возвращает в ответ индекс первой строчки, на которой встретился 0.
    // Если такой строки нет, то возвращает значение -1. Содержание функции main менять запрещено.
    //4
    //1 2 4 3 5
    //3 2 4 4
    //6 5 0 4 6 7 5
    //1 2 1 2 1 2 2 1 1
    //Ответ 0 in 3 line
//    public static int find_0(int[][] mas){
//        int row = -1;
//        for (int i = 0; i < mas.length; i++){
//            for (int j = 0; j < mas[i].length; j++){
//                if (mas[i][j] == 0){
//                    row = i;
//                    return row;
//                }
//            }
//        }
//        return row;
//    }

        //Task4 -Напишите функцию format_number, которая  будет принимать в качестве аргумента строку, которая должна содержать телефонный номер. И выводить его по образцу: 8 (987) 654-32-10.
        //
        //Телефонный номер должен состоять ровно из 11 цифр. Если в введённой строке больше или меньше символов, то функция должна вывести на экран "Неверное число символов".
        //Если в номере встретится хотя бы один символ, который не является цифрой, то функция должна вывести на экран "Не все символы являются цифрами"
        //Российские номера начинаются только с 8 (для простоты задачи). Если номер начинается не с 8, то функция должна вывести на экран "Это не российский номер телефона"
        //Если с номером всё в порядке, то функция должна вывести на экран номер телефона по указанному выше образцу.
        //Содержание функции main менять запрещено.
        //
        //Примечание: проверка условий должна выполняться в том же порядке, что и перечисленные выше условия. То есть, если в строке и не 11 символов и присутствует буква, то программа должна вывести: "Неверное число символов".
//        static void format_number(String number){
//        if (number.length() > 11 || number.length() < 11){
//            System.out.println("Неверное число символов");
//        }
//        else if (!number.matches("[0-9]+")){
//            System.out.println("Не все символы являются цифрами");
//        }
//        else if (!number.startsWith("8")){
//            System.out.println("Это не российский номер телефона");
//            return;
//        }
//        if (number.length() == 11 && number.matches("[0-9]+")){
//            String [] arr = number.split("");
//            System.out.print(arr[0] + " " + "(" + arr[1] + arr[2] + arr[3] + ")" + " " + arr[4] + arr[5] + arr[6] + "-" + arr[7] + arr[8] + "-"+ arr[9] + arr[10]);
//        }
//        }

    //Task5 - Напишите рекурсивную функцию factorial, которая принимает как аргумент одно неотрицательное целое число и возвращает его значение. Напоминаю, что 0! = 1.
    // Содержание функции main менять запрещено.
    // 5 - 120

//        static int factorial(int n) {
//        if (n == 1){
//            return 1;
//        }
//        if (n < 0){
//            return 0;
//        }
//        return factorial(n-1)*n;

////        int j = n;
////            if (n > 0) {
////                for (int i = 1; i < j; i++) {
////                    n *= i;
////                }
////            }
////            else {
////                return 0;
////            }
////            return n;
//        }

    //Task6 - Напишите функцию second_count, которая принимает как целочисленные аргументы количество дней, часов, минут и секунд, которые прошли со времён какого - либо момента.
    // Ваша функция должна вернуть одно целое число - количество секунд, которое прошло с того момента.  Содержание функции main менять запрещено.
    // 0, 1, 1, 15 - 3675
//    static int second_count(int d, int h , int m, int s){
//        if (d >= 0 && h >= 0 && m >= 0 && s >= 0) {
//            return (((d * 24) * 60) * 60) + ((h * 60) * 60) + (m * 60) + (s);
//        }
//        return 0;
//    }

    //Task7 - Напишите функцию find_line7, которая принимает на вход двумерный массив целых чисел и возвращает в ответ индекс первой строчки, сумма элементов которой кратна 7.
    // Если такой строки нет, то возвращает значение -1. Содержание функции main менять запрещено.
    //4
    //1 2 4 3 5
    //3 2 4 4 1
    //6 5 0 4 6 7 5
    //1 2 1 2 1 2 2 1 1
//    static int find_line7(int [][] mas){
//        int row = -1;
//        int counti = 0;
//        for (int i = 0; i < mas.length; i++){
//            for (int j = 0; j < mas[i].length; j++){
//                counti += mas[i][j];
//            }
//            if (counti % 7 == 0){
//                row = i;
//                return row;
//            }
//            System.out.println(counti);
//            counti = 0;
//        }
//        return row;
//    }

    //Task8
//    static void king_step(int x1, int x2, int y1, int y2 ){
//        if (x1 <= 0 || x2 <= 0 || x1 >= 9 || x2 >= 9){
//            System.out.println(1);
//            return;
//        }
//        else if (y1 <= 0 || y2 <= 0 || y1 >= 9 || y2 >= 9){
//            System.out.println(2);
//            return;
//        }
//        else if (x1 == y1 && x2 == y2){
//            System.out.println(3);
//            return;
//        }
//        if ((x1 + x2) + 2 == (y1 + y2) || (x1 + x2) + 1 == y1 + y2 || ((x1 + 1) == y1 || (x1 - 1) == y1 || x1 == y1) && ((x2 + 1) == y2 || (x2 - 1) == y2 || x2 == y2)){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }
//    }

    //Task9 - Функция Аккермана - Напишите рекурсивную функцию akkerman, которая принимает как аргумент два неотрицательных целых числа и возвращает значение этой функции.
    // Содержание функции main менять запрещено.
//    static int akkerman(int n, int m) {
//        if (n==0)
//            return m+1;
//        else
//        if ((n!=0)&&(m==0))
//            return akkerman(n-1,1);
//        else
//            return akkerman(n-1,akkerman(n,m-1)); // в самой формуле поменяли местами буквы n на m и наоборот
//    }
    
    //Task10
//    static double area (int x1, int x2, int y1, int y2){
//        double v = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
//        return v;
//    }

    //Task11 - Простая динамика
//    static int boll (int n) {
//        int row = 0;
//        int[] f = new int[n];
//        f[0] = 0;
//        f[1] = 0;
//        f[2] = 1;
//        for (int i = 3; i < n; i++) {
//            f[i] = f[i - 3] + f[i - 2] + f[i - 1];
//            row = f[i];
//        }
//        return row;
//    }

//    static void findRadius(int a, int b, int c){
//        //для удобства сделаем так, чтобы в переменной c лежала длина самой длинной стороны.
//        if (a > c) {int d = a; a = c; c = d;}
//        if (b > c) {int d = b; b = c; c = d;}
//        //теперь в переменной c лежит наибольшее значение из 3
//        if (c >= a + b){     //первый стражник: проверяет, что такой треугольник существует
//            System.out.println("Треугольника с такими сторонами не существует");
//            return;
//        }
//        if (c * c != a * a + b * b){ //второй стражник: проверяет, что треугольник прямоугольный
//            System.out.println("Этот треугольник не прямоугольный");
//            return;
//        }
//        //вот тут всё в порядке, находим радиус по формуле
//        double r = (a + b - c) / 2.0;
//        System.out.println("Радиус вписанной окружности равен: " + r);
//    }

    //Пример рекурсии с Кешем
//    static int fib(int n){
//        System.out. println("Запускается вычисление " + n + " числа Фиббоначи");
//        if (!cash.containsKey(n))
//            cash.put(n, fib(n-1) + fib(n-2));
//        return cash.get(n);
//    }
}
