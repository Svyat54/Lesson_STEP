package com.company.Stepik.OOP;

import org.w3c.dom.ls.LSOutput;
import java.util.Arrays;
import java.util.Scanner;

// ООП
public class Stepik5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Task1
//        my_first_function();
//        my_second_function();
//        my_second_function();

        //Task2
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        multiply(a, b, c);

        //Task3
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        twoWords(s1, s2);

        //Task4
//        double s1 = sc.nextDouble();
//        double s2 = sc.nextDouble();
//        double s3 = sc.nextDouble();
//        geron(s1, s2, s3);

        //Task5
//        String figure = sc.nextLine();
//        int x = sc.nextInt();
//        perimeter(figure, x);
//        area(figure, x);

        //Task6
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        simple(a);
//        simple(b);
//        simple(c);

        //Task9
//        String s = sc.nextLine();
//        sortByLength(s);


    }

        //Task1 - Допишите функцию my_first_function, которая выводит на экран три строчки "Hello world!". Напишите так же функцию my_second_function,
        // которая выведет на экран одну строку: "Java the best!". Содержание функции main менять запрещено.
//        static void my_first_function(){
//            System.out.println("Hello world!\nHello world!\nHello world!");
//        }
//
//        static void my_second_function(){
//            System.out.println("Java the best!");
//        }

    //Task2 - Напишите функцию multiply, которая будет принимать в себя три целых числа и распечатывать на строке их произведение. Содержание функции main менять запрещено.
//    static void multiply(int a, int b, int c) {
//        System.out.println(a * b * c);
//    }

    //Task3 - Напишите функцию twoWords, которая принимает две строки и сравнивает их длины. После чего выводит на экран либо "Первая строка длиннее", либо "Вторая строка длиннее",
    // либо "Равная длина". Содержание функции main менять запрещено.
    //Ввод: Привет!, Пока(
//    static void twoWords(String s1, String s2){
//        System.out.println(s1.length() == s2.length() ? "Равная длина" : ((s1.length() > s2.length()) ? "Первая строка длиннее" : "Вторая строка длиннее"));
//    }

    //Task4 - Площадь треугольника можно вычислить по формуле Герона. Напишите функцию geron, которая по трём действительным числам находит площадь треугольника и выводит её на экран.
    // Если такого треугольника не существует, то выведите на экран "Такого треугольника не существует". Содержимое функции main менять запрещено.
    // Ввод: 3, 4, 5 Ответ 6
//    static void  geron (double s1, double s2, double s3){
//        double p = (s1+s2+s3)/2;
//        double S = Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
//        System.out.println((S > 0) ? S : "Такого треугольника не существует");
//    }

    //Task5 - Необходимо написать программу для поиска площади и периметра квадрата или круга. Напишите две функции: perimeter и area, каждая из них принимает строку - название фигуры и
    // одно целое число (либо радиус круга, либо сторону квадрата). Как результат они выводят периметр и площадь фигуры соответственно.
    // В ответ они должны вывести именно целое число (при надобности округлять "вверх", то есть до ближайшего большего целого числа). Содержание функции main менять запрещено. Пи брать как 3.14.
    // ВВаод 5 , 3
    // Квадрат 20, 25 Круг 19, 29
//    static void perimeter (String figure, int x){
//        final double pi = 3.14;
//        if (figure.equals("Круг")) {
//            int P = (int) Math.ceil((2 * pi) * x);
//            System.out.println(P);
//        }
//        else if (figure.equals("Квадрат")){
//            int P2 = (int) 4 * x;
//            System.out.println(P2);
//        }
//    }
//
//    static void area (String figure, int x){
//        final double pi = 3.14;
//        if (figure.equals("Круг")) {
//            int S = (int) Math.ceil(pi * Math.pow(x, 2));
//            System.out.println(S);
//        }
//        else if (figure.equals("Квадрат")){
//            int S2 = (int) Math.pow(x,2);
//            System.out.println(S2);
//        }
//    }

    //Task6 - Напишите функцию simple, которая принимает одно целое число и определяет, является ли число простым и выводит на экран ответ: "YES"/"NO". Содержание функции main менять запрещено.
    //Ввод 3, 4, 19
    // Ответ YES, NO, YES
//    static void simple (int a){
//        boolean f = true;
//        for (int i = 2;i < a;i++) {
//            if (a%i == 0) {
//                f = false;
//                break;
//            }
//        }
//        f = (a == 1)?false:f;
//        System.out.println((f)?"YES":"NO");

    //Task7 - Напишите функцию simpleAB, которая принимает 2 натуральных числа a и b (a <= b) и анализирует все числа на промежутке от a до b включительно на их простоту.
    // Она должна вывести на экран для каждого числа строку вида "{число} - {простое/составное/1}". Содержание функции main менять запрещено.
    //Ввод 1, 6
    //Ответ 1 - 1, 2 - простое, 3 - простое, 4 - составное, 5 - простое, 6 - составное

    //Task8 -

    //Task9 - Напишите функцию sortByLength,  которая принимает как аргумент строку и сортирует её по длине слова. Если длины слов одинаковы, то сортировать в алфавитном порядке.
    // Содержание функции main менять запрещено.
    //Ввод cad aba q we qwert
    //Ответ q we aba cad qwert
//    static void sortByLength (String s) {
//        if (s.length() != 0) {
//            String[] words = s.split(" ");
//            Arrays.sort(words);  // сперва отсортировал слова только по алфавиту
//            int[] size = new int[words.length];
//            for (int i = 0; i < words.length; i++)
//                size[i] = words[i].length();  // запомнил длины каждого слова
//            if (words.length > 1) {
//                for (int i = 1; i < words.length; i++) {
//                    int minJ = i - 1;
//                    boolean change = false;
//                    for (int j = i; j < words.length; j++) {  // ищу самое короткое слово
//                        if (size[j] < size[minJ]) {
//                            minJ = j;
//                            change = true;
//                        }
//                    }
//                    if (change) {  // меняю слова местами, если требуется
//                        int tmpSize = size[i - 1];
//                        String tmpWord = words[i - 1];
//                        size[i - 1] = size[minJ];
//                        words[i - 1] = words[minJ];
//                        size[minJ] = tmpSize;
//                        words[minJ] = tmpWord;
//                    }
//                }
//            } // if (words.length > 1)
//            System.out.println(String.join(" ", words));
//        }
//    }




}
