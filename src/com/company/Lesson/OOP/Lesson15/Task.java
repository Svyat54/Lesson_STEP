package com.company.Lesson.OOP.Lesson15;


public class Task {

//1)    Дан массив целых чисел. Найти  сумму тех элементов  массива, которые находятся  между максимальным и минимальным числами. В сумму включить и оба этих числа.
    private static int getMax(int [] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int getMin(int [] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void task1(int [] arr){
        int sum = 0;
        int start = getMin(arr);
        int stop = getMax(arr);
        for (int i = start; i <= stop; i++){
            sum += arr[i];
        }
        System.out.println(getMin(arr) + " " + getMax(arr));
        System.out.println(sum);

//        if (min < max){
//            for (int i = min; i < max; i++)
//                sum += arrInput[i];
//        }
//        System.out.println(sum);
    }
//
//2)    Дан массив целых чисел. Вывести элементы массива, значениями которых являются степени числа 2 (например, 16, 4, 64, 8, 128).
//    public static void task2(int [] arrInput){
//        for (int i = 0; i < arrInput.length; i++){
//            if (arrInput[i] % 2 ==0){
//                System.out.println(arrInput[i]);
//            }
//        }
//    }
//
//3)    Дан массив целых чисел. Вывести элементы массива, значениями которых являются полные квадраты (например, 9, 16, 64, 49, 121).
//        private static boolean isSQR(int arg){
//            return Math.sqrt(arg) == (int)Math.sqrt(arg);
//        }
//        public static void task3(int [] arrInput){
//            for (int i =0; i < arrInput.length; i++){
//                if (isSQR(arrInput[i])){
//                    System.out.println(arrInput[i]);
//            }
//        }
//    }

//4)    Дан массив целых чисел. Вывести элементы массива, значениями которых являются простые числа (например, 11, 7, 41, 89, 103).
//    private static boolean isPrime (int n){
//        if (n <= 1) {
//            return false;
//        }
//        else if (n == 2) {
//            return true;
//        }
//        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void task4(int [] arrInput) {
//        for (int i = 0; i < arrInput.length; i++) {
//            if (isPrime(arrInput[i])) {
//                System.out.println(arrInput[i]);
//            }
//        }
//    }

//
//5)    Даны массивы целых чисел Х и А, вычислить S - сумму тех элементов массива X, индексы которых совпадают со значениями элементов массива A.
//
//6)    Написать  программу нахождения наибольшего общего делителя для элементов массива целых чисел.
//
//7)    Преобразовать  массив целых чисел Х по следующему правилу: элементы массива Х циклически сдвинуть на k позиций влево.
//
//8)    Дан массив целых чисел. Вывести те числа, которые больше своих «соседей», то есть предыдущего и последующего чисел.
//
//9)    Дан массив целых чисел. Вывести те из них, индексы которых являются числами Фибоначчи.
//
//10)   Дан массив вещественных чисел. Определить индекс того из них, которое наиболее близко к заданному целому числу.


}
