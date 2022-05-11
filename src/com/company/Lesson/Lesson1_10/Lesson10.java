package com.company.Lesson.Lesson1_10;

public class Lesson10 {
        //Напишите метод, который принимает два числа в качестве параметра и отображает все четные числа между ними
//    public static void task2 (int a, int b ){
//        for (int i = a + 1; i < b; i++){
//            if (i % 2 == 0){
//                System.out.println(i + " ");}}}

    // Напишите метод, который возвращает максимальное из четырёх чисел. Числа передаются в качестве параметров.
//    public static int task4 (int a, int b, int c, int d) {
//        return Math.max(Math.max(a, b) , Math.max(c,d));}

    // Напишите метод, который возвращает сумму чисел в указанном диапазоне. Границы диапазона передаются в качестве параметров
//    public static int task5 (int a, int b){
//        int sumnumb = 0;
//        for (int i = a; i <= b; i++){
//               sumnumb+=i;}
//        return sumnumb;}

//    //Напишите метод, который проверяет является ли число простым. Число передаётся в качестве параметра. Если число простое нужно вернуть из метода true, иначе false
//    public static boolean task6 (int a){
////    i < a / 2 +1
//        for (int i = 2; i < a - 1; i++){
//            if (a % i == 0){
//                return false;}}
//        return true;}

    //Напишите метод, который проверяет является ли шестизначное число «счастливым». Число передаётся в качестве параметра. Если число счастливое нужно вернуть из метода true, иначе false.
    //«Счастливое шестизначное число» — это число у которого сумма первых трёх цифр равна сумме трёх вторых цифр. Например, 123420 — счастливое 1+2+3 = 4+2+0, а 723422 — несчастливое 7+2+3 != 4+2+2
//    public static boolean task7 (int number){
//        int left = 0;
//        int right = 0;
//        //123 % 10 = 3
//        for (int i = 0; i < 6; i++){
//            if (i < 3){
//                right += number % 10;}
//            else if (i >= 3){
//                left += number % 10;}
//        number /= 10;}
//    return left == right;}

    //Самостоятельная работа
//Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа. Метод принимает в качестве параметра: длину линии, направление, символ.
//    public static int samos1 (int dlin, int napr, char sym){
//        for (int i = 0; i < dlin; i++) {
//            if (napr == 0) {
//                System.out.println(sym);
//            } else {
//                System.out.print(sym);}}
//        return sym;}

//Напишите метод, вычисляющий сумму элементов массива. Массив передаётся в качестве параметра.
//    public static int samos2 (int a){
//        int [] arr = new int [5];
//        for (int i = 0; i < arr.length; i++){
//            a += i;}
//        return a;}

//    Напишите метод для нахождения максимума в массиве. Массив передаётся в качестве параметра.
//    public static int samos3 (int[] arr){
//        int max = 0;
//        for (int i = 0; i < arr.length; i++ ){
//            max = Math.max(arr[i], max);}
//        return max;}

    //Пользователь вводит с клавиатуры строку. Проверьте является ли введенная строка палиндромом. Палин- дром — слово или текст, которое читается одинаково слева направо и справа налево.
    // Например, кок; А роза упала на лапу Азора; доход; А буду я у дуба.

    public static void main (String[] args){
//        task2(5,10);
//        System.out.println( task4(5,8,10,19));
//        System.out.println(task5(1,5));
//        System.out.println(task6(13)); // простое число должно делиться на 1 и на само себя без остатка, 13(True) простое число, 12(False) составное //if( isPrime(arr[i])) - isPrime - это число простое
//        System.out.println(task7(123420));
//        System.out.println();
//        System.out.println(task7(723422));

//        samos1(9,10,'@');
//        System.out.println(samos2(0));

//        int [] arr = new int [] {1, -9, 4, 44, 23, 90, -1};
//        System.out.println(samos3(arr));
    }
}






