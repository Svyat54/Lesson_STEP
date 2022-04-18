package com.company.Lesson;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Задание 1
        //Пользователь с клавиатуры вводит элементы одномерного массива. Необходимо найти сумму элементов
        //массива, среднеарифметическое, отобразить на экран все элементы массива
//        int [] arr = new int [5];
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++){
//        arr[i] = sc.nextInt();
//        sum +=arr[i];
//        }
//        for (int i = 0; i < arr.length; i++){
//        System.out.print(arr[i] + " ");}
//        System.out.println("");
//        System.out.println((double) sum/ arr.length);

        // Задание 2
        //Пользователь с клавиатуры вводит элементы одномерного массива и некоторое число. Необходимо посчитать сколько раз данное число присутствует в массиве.
//        System.out.println("Введите число ");
//        int numb = sc.nextInt();
//        int [] arr = new int [5];
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//            if (arr[i]==numb){
//                sum++;
//            }}
//            System.out.println(sum);

        // Задание 3 -
//        В одномерном массиве, заполненном случайными числами, определить минимальный и максимальный элементы, посчитать количество отрицательных элементов,
//        посчитать количество положительных элементов, посчитать количество нулей. Результаты вывести на экран
//        int [] arr = new int [5];
//        int max =0;
//        int min =0;
//        int plus=0, minus=0, zero = 0;
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = (int)(Math.random() * 10)-5;}
//        max = arr[0];
//        min = arr[0];
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i]<min){
//                min = arr[i];
//            }
//            else if (arr[i]>max){
//                max = arr[i];
//            }
//            if (arr[i]>0){
//                plus++;
//            }
//            if (arr[i]<0){
//                minus++;
//            }
//            if (arr[i]==0){
//                zero++;
//            }
//        }
//        System.out.println(max +" "+ min);
//        System.out.println(plus+ " "+minus+" "+zero);

        //Задание 4 В одномерном массиве, заполненном случайными
        //числами вычислить:
        //■ Сумму отрицательных чисел;
        //■ Сумму четных чисел;
        //■ Сумму нечетных чисел;
        //■ Произведение элементов с индексами кратными 3;
        //■ Произведение элементов между минимальным и максимальным элементом;
        //■ Сумму элементов, находящихся между первым и последним положительными элементами
        // [6] [4] [3] [5] [9] - мининдекс 2, максиндекс 4
//        int [] arr = new int [5];
//        int pol=0;
//        int pol1=0;
//        int sumpol=0;
//        int start, stop;
//        int sumNeg =0;
//        int sumChet =0;
//        int sumNechet =0;
//        int prois = 1;
//        int proisminmax = 1;
//        int max =0, min =0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 10) - 5;
//            System.out.print(arr[i]+ " ");
//            if (arr[i] < 0) {
//                sumNeg += arr[i];}
//            else if (arr[i]%2==0){
//                sumChet+=arr[i];}
//            else {
//                sumNechet+=arr[i];
//            }
//            // Произведение элементов с индексами кратными 3; [1][-2][3][3][4] кратные 3 будут числа [1][3] = 3
//            if (i % 3 == 0){
//            prois *= arr[i];}
//        }
//        //■ Произведение элементов между минимальным и максимальным элементом; [-1][0][-2][-2][3] = -2* -2 = 4
//        for(int i = 0; i < arr.length; i++){
//            if (arr[i]<arr[min]){
//                min = i;}
//            else if (arr[i] > arr[max]){
//                max = i;}
//        }
//        if (min < max){
//            start = min;
//            stop= max;}
//        else {
//            start = max;
//            stop = min;}
//        for (int i = start; i < stop; i++){
//            proisminmax *= arr[i];
//        }
//        //■ Сумму элементов, находящихся между первым и последним положительными элементами
//        for(int i = 0; i < arr.length; i++){
//            if (arr[i]>0){
//                pol = i;
//                break;}}
//        for(int i = 0; i < arr.length; i++){
//            if (arr[i]>0){
//                pol1=i;}}
//        for (int i = pol; i < pol1; i++){
//            sumpol += arr[i];}
//
//        System.out.println();
//        System.out.println("Сумма отриц чисел: " +sumNeg +" \nСумма чётных: "+ sumChet+" \nСумма нечётных: "+ sumNechet + " \nПроизведение кратных 3: " +prois);
//        System.out.println("Минимальное: "+min+ "\nМаксимальное: "+max+ "\nПроизведение " +proisminmax);
//        System.out.println("Сумма пол чисел: " +sumpol);


        //Дан массив вещественных чисел. Определить индекс того из них, которое наиболее близко к заданному целому числу.
        // решение 1
//        int numb = sc.nextInt();
//        int a=0,b;
//        double[] arr = new double[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Math.random() * 10;
//            System.out.print(arr[i] + " ");}
//        for (int i = 1; i < arr.length; i++){
//        if (Math.abs(numb - arr[i]) < Math.abs(numb - arr[i-1]))
//                a = i;
//          }
//        System.out.println();
//        System.out.println(a);
        // решение 2
//        double [] arr = new double[10];
//        int number = 8;
//        for(int i = 0; i < arr.length; i++)
//        {
//            arr[i] = Math.random()*10;
//            System.out.println(arr[i]);
//        }
//        double minRaznica = Math.abs(arr[0] - number); // Math.abs(-5.5) --> 5.5;
//        int minIndex = 0;
//        for(int i = 0; i < arr.length;i++)
//        {
//            if(Math.abs(arr[i] - number) < minRaznica)
//            {
//                minRaznica = Math.abs(arr[i] - number);
//                minIndex = i;
//            }
//        }
//        System.out.println(minIndex);
        //решение 3
//        double[] arr = new double[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Math.random() * 10;
//            System.out.println(arr[i]);
//        }
//        int minIndex = 0;
//        for (int i = 1; i < arr.length; i++){
//            if (Math.abs(8 - arr[i]) < Math.abs(8 - arr[minIndex])) {
//                c = i;
//            }
//        }
//        System.out.println(minIndex);

        // DZ
//        Во всех заданиях массив случайных чисел от 5 до 25.
//        Вывести сумму элементов массива, которые больше среднего арифметического.
//        int [] arr = new int [25];
//        int sum = 0;
//        int arrsum = 0;
//        int summ = 0;
//        for (int i = 5; i < arr.length; i++){
//            arr[i] = (int) (Math.random()*25)-10;
//            System.out.print(arr[i]+ " ");
//            sum += arr[i];}
//        for (int i = 5; i < arr.length; i++){
//            arrsum = sum/ arr.length;
//        if (arr[i]>arrsum){
//                summ += arr[i];}
//        }
//        System.out.println();
//        System.out.println("Сумма среднеарифметическая: "+arrsum);
//        System.out.println("Сумма элементов массива: "+summ);

//        Вывести произведение нечетных индексов массива.[ 1, 2, 3, 4, 5]
//        int [] arr = new int [25];
//        int sum = 1;
//        int summchet = 1;
//        for (int i =1; i < arr.length; i++){
//            arr[i] = (int) (Math.random()*5)+1;
//            System.out.print(arr[i]+" ");}
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                sum *= arr[i];}
//            else if(arr[i] % 2 == 0){
//                summchet *= arr[i];}
//        }
//        System.out.println();
//        System.out.println("Сумма Нечётных чисел: "+sum);
//        System.out.println("Сумма чётных чисел: " + summchet);

//        Произведение 2 * 4
//        int [] arr = new int [];



        //Заменить каждый нечетный элемент на 0
//        int a = 0;
//        int [] arr = new int [10];
//        for (int i = 1; i < arr.length; i++){
//            arr[i] = (int) (Math.random() * 10);}
//        System.out.print(Arrays.toString(arr));
//        for (int i = 0; i< arr.length; i++){
//            if (arr[i] % 2 == 1){
//                arr[i] = 0;}}
//        System.out.println();
//        System.out.print(Arrays.toString(arr));

        //Сдвинуть массив на 1 элемент вправо. Для самых старательных, сделать выбор стороны сдвига (лево/право) и также выбрать кол-во позиций на сколько сдвигать( две или три и т.д) 1 2 3 ----> 3 1 2
//        String s = Arrays.asList(arr); двиг масива.  Collections.rotate( list, 2); - переменная должна быть стринг ()переменная и кол-во сдвига)
//        System.out.println("Введите длину массива: ");
//        int dlina = sc.nextInt();
//        System.out.println("на сколько сдвинуть массив: ");
//        int sdvig = sc.nextInt();
//        int [] arr = new int [dlina];
//        int [] arr1 = new int [dlina + sdvig];
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = (int)(Math.random()*5);}
//        System.out.print(Arrays.toString(arr) + " Исходный массив");
//
//        for (int i = 0; i < arr.length - 1 ; i++){
//            arr[i] = arr[i+1];}
//        System.out.println();
//        System.out.print(Arrays.toString(arr) + " Сдвиг массива в лево");

//        for (int i = 0; i < arr.length ; i++){
//            arr1[i + sdvig] = arr[i];
//           arr[i] = arr1[i];}
//        System.out.println();
//        System.out.print(Arrays.toString(arr)+ " Сдвиг массива вправо");


        //Поменять минимальный и максимальный элемент местами
//        int [] arr = new int []{6,7,5,1,9,10};
//        int min = 0;
//        int minnumb = 0, maxnumb = 0;
//        int arrmin=0, arrmax=0;
//        for (int i = 0; i < arr.length; i++){
////            arr[i] = (int) (Math.random()*10);
//        }
//        System.out.print(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] > maxnumb){
//                maxnumb = arr[i]; // записал число
//                arrmax = i; // записал элемент массива
//            }
//            else if (arr[minnumb] > arr[i]){
//                minnumb = arr[i];
//                arrmin = i;}}
//        arr[arrmax] = minnumb; // меняем значение в массиве с макс на мин
//        arr[arrmin] = maxnumb; // а тут наоборот
//        System.out.println();
//        System.out.print(Arrays.toString(arr)); // итог 6 7 5 1 9 10 получили 6 7 5 10 9 1




    }
}
