package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class DZ7 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        //Task 1 - Заполнить массив на 15 элементов числами Фибоначчи.Вывести на консоль только четные элементы массива.
//        int [] arr = new int[15];
//        arr[0] = 0;
//        arr[1] = 1;
//        for (int i = 2; i < arr.length; i++){
//          arr[i] = arr[i - 1] + arr[i - 2];
//            if (i % 2 == 0){
//                System.out.println("Числа массива : " + arr[i] + " элемент массива - " + i);
//            }
//        }
        //Цикл for ich
//        for (int j : arr){
//            if (j % 2 == 0){
//                System.out.println(j);
//            }
//        }

        // Task 2 - Заполнить массив на 30 элементов случайными числами от -70 до +50. Найти минимальный элемент и вывести его на консоль. Найти максимальный элемент и вывести его на консоль.
        //DONE
//        int [] arr = new int [30];
//        int max = 0;
//        int min = 0;
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = (int) (Math.random()*120 - 70);}
//        System.out.print(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];}
//        else if (arr[i] < min){min = arr[i];}}
//        System.out.println();
//        System.out.println("Max Number = " + max);
//        System.out.println("Min Number = " + min);

        //Task 3 - Написать программу, которая проверяет, все ли значения элементов массива одинаковые. Вывести: Yes – если все одинаковы и No – если имеется хоть одно различие.
        // Массив задается и инициализируется в начале программы
        //DONE
//        int [] arr = new int [5];
//        int count = 0, x = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 5);
//            if (arr[i] == x){
//                count++;}}
//            if (arr.length == count){
//                System.out.println("YES");
//                }
//            else {
//                System.out.println("No");
//            }

        //решение с boolian
//        int [] arr = new int [5];
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 5);
//        }
//        boolean sr = true;
//        for (int i = 0; i < arr.length - 1; i++){
//            if (arr[i] != arr[i+1]){
//                sr = false;
//                break;
//            }
//        }
//        if (sr){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }

        // Task 4 - Написать программу, которая проверяет, все ли значения элементов массива различные (не повторяются). Вывести: Yes – если все различные и No – если имеется хоть одно повторение.
        // Массив задается и инициализируется в начале программы.
        //DONE
//        int [] arr = new int [5];
//        String mass = " ";
//        for (int i = 1; i < arr.length; i++){
//            arr[i] = (int)(Math.random()*5);
//            if (arr[0] == arr[i] && arr[1] == arr[i] && arr[2] == arr[i] && arr[3] == arr[i] && arr[4] == arr[i]){
//            mass = "No";}  else {mass = "Yes";}}
//        System.out.print(Arrays.toString(arr));
//        System.out.println();
//        System.out.println(mass);

        //Task 5 - Заполнить массив на 10 элементов случайными числами от -10 до +10. Посчитать количество повторяющихся значений.
        // Вывести на консоль только повторяющиеся элементы и количество повторений. как задать случайное число из интервала
        // Пример 0 - 5 раз, 2 - 3 , 7 -1
        //DONE
//        int [] arr = new int[10];
//        int count = 0;
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = (int) (Math.random()*20) - 10;}
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] == arr[i]) {
//                    count++;
//                }
//            }
//                    if (count > 1) {
//                        System.out.println(arr[i] + " - " + count + " раз(а)");
//                    }
//                     count = 0;
//                }

        // вариант с boolian
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 21) - 10;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            boolean isHas = true;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j] && i > j) {
//                    count++;
//                } else if (arr[i] == arr[j] && i < j) {
//                    isHas = false;
//                    break;
//                }
//            }
//            String value;
//            if (count > 1 && count < 5) {
//                value = " раза";
//            } else {
//                value = " раз";
//            }
//            if (isHas && count > 1) {
//                System.out.println(arr[i] + " - " + count + value);
//            }
//        }

        // Task 6 - Заполнить массив на 10 элементов случайными числами от -10 до +10. Посчитать количество уникальных значений (встречающихся в массиве один раз).
        // Вывести на консоль значения уникальных элементов и индексы, под которыми они находятся в массиве.
//        int [] arr = new int [10];
//        int count = 0, numb = 0;
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = ((int) (Math.random() * 21) - 10);}
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    numb = arr[i];
//                    count++;}}
//                if (count == 1){
//                    System.out.println("Число: " +numb + " под индексом " + i);}
//                count = 0; }

        //Task 7 - Заполнить массив размерности n случайными цифрами от 3 до 13. Подсчитать, сколько раз встречается каждая цифра. Вывести результат на экран. n – задается с клавиату
//        int n = sc.nextInt();
//        Random rand = new Random();
//        int [] arr = new int [n];
//        int count = 0;
//        int numb = 0;
//        for (int i = 0; i < n; i++){
//            arr[i] = rand.nextInt(13);}
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    numb = arr[i];
//                    count++;}}
//            if (count >= 1){
//                System.out.println(numb + " - " + count + " раз ");}
//                count = 0;}

        // Task 8 - Заполнить массив размерности n случайными строчными латинскими буквами. Подсчитать, сколько раз встречается каждая буква.
        // Вывести буквы, которые встречаются больше 3 раз. n – задается с клавиатуры
//        int n = sc.nextInt();
//        char [] arr = new char[n];
//        int count = 0;
//        char sym = 'a';
//        for (char i = 0; i < arr.length; i++){
//            arr[i] = (char) (sym+(int)(Math.random()*26));}
//        System.out.println(Arrays.toString(arr));
//        for (char i = 97; i <= 122; i++){
//            for (char j = 0; j < arr.length; j++){
//                if (arr[j] == i){
//                    count++;}}
//            if (count >= 3){
//                System.out.println("Буква: " + i + " встречается - " + count + " раз(а)" );}
//            count = 0;}

        //Task 9- Заполнить массив размерности n случайными цифрами от –2 до n. Если в массиве есть хотя бы одно отрицательное значение меньше -1, заменить все отрицательные значение в массиве
        // на квадрат (в степени 2) этих значений. Вывести исходный и результирующий массив на консоль

        // Task 10

        // Task 12

    }
}
