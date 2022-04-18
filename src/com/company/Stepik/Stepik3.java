package com.company.Stepik;
//Массивы
import java.util.Arrays;
import java.util.Scanner;
public class Stepik3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Task0 - Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
        // 8, 11 Ответ 512 , 1331
//        int numb = 0 , a,b;
//        int [] arr = new int [1001];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i * i * i;
//        }
//        a = sc.nextInt();
//        b = sc.nextInt();
//        for (int i = 0; i < arr.length; i++){
//            if (a == i){
//                System.out.println(arr[i]);
//            }
//            if (b == i){
//                System.out.println(arr[i]);
//            }
//        }

        //Task1 - Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа.
        // Выведите на экран результат умножения построчно. Пример: 4 числа 1, 2, 3, 5 умножаем на 2. Итог 2, 4, 6, 10
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n;i++)
//            a[i] = sc.nextInt();
//        int j = sc.nextInt();
//        for (int i = 0; i < n; i++)
//            System.out.println(a[i] * j);

        //Task2 - Вводится список (сначала количество элементов, потом сами элементы). Найдите сумму всех элементов и выведите её. А потом выведите введённые числа в обратном порядке.
        // 4 - 1, 2, 3, 4 Должно получится 10 - 4, 3, 2, 1
//        int n = sc.nextInt();
//        int sum = 0;
//        int[] a = new int[n];
//        for (int i = 0; i < n;i++)
//            a[i] = sc.nextInt();
//        for (int i = 0; i < n; i++)
//            sum += a[i];
//        System.out.println(sum);
//        for (int i = a.length-1; i >= 0; i--)
//        System.out.println(a[i]);

        //Task3 - Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
        // 4 - 1, 2, 3, 4 Должно получится 4, 1, 3
//        int n = sc.nextInt();
//        int sum = 0;
//        int[] a = new int[n];
//        for (int i = 0; i < n;i++)
//            a[i] = sc.nextInt();
//        for (int i = 0; i < n; i++)
//            if (i % 2 == 0)
//            sum += a[i];
//        System.out.println(sum);
//        for (int i = 0; i < n; i++)
//            if (i % 2 == 0){
//        System.out.println(a[i]);
//            }

        //Task4 - Дан список (сначала количество элементов, потом сами элементы). Потом водятся два числа: a и b. Поменяйте местами значения a-ого и b-ого элементов массива и выведите его на экран
        // построчно. Гарантируется, что а и b не выходят за границы размеров массива.
        // Первое число 5 - 12, 78, 45, 378, 12, 2, 4
//        int n = sc.nextInt();
//        int sum = 0, a,b,aInd = 0,bInd = 0;
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++){
//        arr[i] = sc.nextInt();}
//        a = sc.nextInt();
//        b = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            if (a == i){ // находим индекс а
//                aInd = i; // запоминаем индекс
//                a = arr[i];} // запоминаем значение
//            if (b == i){ // находим индекс б
//                bInd = i; // запоминаем индекс
//                b = arr[i];} // запоминаем значение
//        }
//        sum = arr[bInd]; // записываем индекс
//        arr[bInd] = arr[aInd]; // меняем местами индекс б на а
//        arr[aInd] = sum; // меняем индекс а на б
//
////        Arrays.stream(arr).forEach(e-> System.out.println(e));
//                System.out.print(Arrays.toString(arr));


        // Task5 - Петя перешёл в другую школу. На уроке физкультуры ему понадобилось определить своё место в строю. Помогите ему это сделать.
        //Программа получает на вход невозрастающую последовательность натуральных чисел (сначала вводится количество, затем сами числа), означающих рост каждого человека в строю.
        // После этого вводится число X – рост Пети. Все числа во входных данных натуральные и не превышают 200.
        // Первое число 7 - 165, 163, 160, 160, 157, 157, 155, 162 - Ответ 3
//        int n = sc.nextInt();
//        int sum = 0, a,b,aInd = 0,bInd = 0, count = 1;
//        int[] arr = new int[n]; // 165, 163, 160, 160 , 157, 157, 155
//        a = sc.nextInt(); // 162
//        for (int i = 0; i < arr.length; i++) {
//                if (a <= arr[i]) {
//                    count++;}}
//        System.out.println(count);

        //Task6 - Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке.
        //Вводится список чисел. Все числа списка находятся на одной строке.
        // Первое число 6 - 1, 2 ,2 ,3, 3, 3 Ответ 1
//        int n = sc.nextInt();
//        int sum = 0, a,b,aInd = 0,bInd = 0, count = 0;
//        int[] arr = new int[n];//{1,2,2,3,3,3};
//        for (int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();}
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr.length; ++j){
//                if (arr[i] == arr[j]){
//                    sum = arr[i];
//                    count++;
//                }
//            }
//            if (count == 1){
//                System.out.println(sum + " " +count);
//            }
//            count = 0;
//        }

        //Task7 - Переставьте соседние элементы списка (A[0] c A[1], A[2] c A[3] и т.д.). Если элементов нечетное число, то последний элемент остается на своем месте.
        // Первое число 6 - 4, 5 ,3 ,4, 2, 3 Ответ 5, 4, 4, 3, 3, 2
//        int n = sc.nextInt();
//        int sum = 0, a = 0,b = 0,aInd = 0,bInd = 0, count = 0;
//        int[] arr = new int[n]; //{4,5,3,4,2,3,0};
//        for (int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();}
//        if (n % 2 == 0)
//            for (int i = 0; i < arr.length; i++) {
//                    for (int j = i + 1; j < arr.length; j++) {
//                        if (arr[i] < arr[j]) {
//                            aInd = i;
//                            a = arr[i]; // 4, 3, 2
//                            if (arr[i] < arr[j]) {
//                                bInd = j;
//                                b = arr[j]; // 5, 4, 3//
//                            }
//                        }
//                        sum = arr[bInd];
//                        arr[bInd] = arr[aInd];
//                        arr[aInd] = sum;
//                    }
//                }
//        else {
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = i + 1; j < arr.length-1; j++) {
//                    if (arr[i] < arr[j]) {
//                        aInd = i;
//                        a = arr[i]; // 4, 3, 2
//                        if (arr[i] < arr[j]) {
//                            bInd = j;
//                            b = arr[j]; // 5, 4, 3//
//                        }
//                    }
//                    sum = arr[bInd];
//                    arr[bInd] = arr[aInd];
//                    arr[aInd] = sum;
//                }
//            }
//        }
//            System.out.println(Arrays.toString(arr));

        //Task8 - Вводятся числа a и b. Создайте массив, в котором будут храниться кубы чисел от a до b. Затем вводится число n и n чисел после него.
        // Используя данные из массива найдите кубы этих. Если вводится число, не принадлежащее заданному диапазону, выведите на экран слово "Error".
        // Ввод - 5,  10, 4, 5, 8, -1, 5 Ответ - 125, 512, Error, 125
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > b || arr[i] < a) {
//                System.out.println("Error");
//            } else {
//                System.out.println((int) Math.pow(arr[i], 3));
//            }
//        }


        //Task9 - N кеглей выставили в один ряд, занумеровав их слева направо числами от 1 до N. Затем по этому ряду бросили K шаров, при этом i-й шар сбил все кегли
        // с номерами от a до b включительно. Определите, какие кегли остались стоять на месте.
        //Программа получает на вход количество кеглей N и количество бросков K. Далее идет K пар чисел a, b , при этом 1abN.
        //Программа должна вывести последовательность из N символов, где j-й символ есть “I”, если j-я кегля осталась стоять, или “.”, если j-я кегля была сбита.
















        }
}

