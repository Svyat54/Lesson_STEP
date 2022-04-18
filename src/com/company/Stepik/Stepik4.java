package com.company.Stepik;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Метод	Описание
//String str1 = "Java";
//String str2 = "Hello";
//String str3 = str1 + " " + str2;
//System.out.println(str3); // Hello Java

//s.concat()	 объединяет строки
//String str1 = "Java";
//String str2 = "Hello";
//str2 = str2.concat(str1); // HelloJava

//s.length()	 возвращает длину строки
//String str1 = "Java";
//System.out.println(str1.length()); // 4

//s.valueOf()	 преобразует объект в строковый вид

//s.join()	 соединяет строки с учетом разделителя
//String str1 = "Java";
//String str2 = "Hello";
//String str3 = "Legasoft";
//String str = String.join(" - ", str2, str1, str3); // Hello - Java - Legasoft

//s.сompare()	 сравнивает две строки
//String str1 = "hello";
//String str2 = "world";
//String str3 = "hell";
//
//System.out.println(str1.compareTo(str2)); // -15 - str1 меньше чем strt2
//System.out.println(str1.compareTo(str3)); // 1 - str1 больше чем str3

//s.charAt()	 возвращает символ строки по индексу
//String str = "Java";
//char c = str.charAt(2);
//System.out.println(c); // v

//s.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)	 возвращает группу символов
//String str = "Hello world!";
//int start = 6;
//int end = 11;
//char[] dst=new char[end - start];
//str.getChars(start, end, dst, 0);
//System.out.println(dst); // world

//s.equals()	 сравнивает строки с учетом регистра
//s.equalsIgnoreCase()	 сравнивает строки без учета регистра
//String str1 = "Hello";
//String str2 = "hello";
//System.out.println(str1.equals(str2)); // false
//System.out.println(str1.equalsIgnoreCase(str2)); // true

//s.regionMatches()	 сравнивает подстроки в строках
//String str1 = "Hello world";
//String str2 = "I work";
//boolean result = str1.regionMatches(6, str2, 2, 3);
//System.out.println(result); // true

//s.indexOf()	 находит индекс первого вхождения подстроки в строку
//String str = "Hello world";
//int index1 = str.indexOf('l'); // 2
//int index2 = str.indexOf("wo"); //6
//int index3 = str.lastIndexOf('l'); //9

//s.isEmpty()	 возвращает true, если строка пуста, иначе - false

//s.lastIndexOf()	 находит индекс последнего вхождения подстроки в строку

//s.startsWith()	 определяет, начинается ли строка с подстроки
//String str = "myfile.exe";
//boolean start = str.startsWith("my"); //true
//boolean end = str.endsWith("exe"); //true

//s.endsWith()	 определяет, заканчивается ли строка на определенную подстроку

//s.replace()	 заменяет в строке одну подстроку на другую
//String str = "Hello world";
//String replStr1 = str.replace('l', 'd'); // Heddo wordd
//String replStr2 = str.replace("Hello", "Bye"); // Bye world

//s.trim()	 удаляет начальные и конечные пробелы
//String str = "  hello world  ";
//str = str.trim(); // hello world

//s.substring() возвращает подстроку, начиная с определенного индекса
//до конца или до определенного индекса

//s.toLowerCase()	 переводит все символы строки в нижний регистр
//String str = "Hello World";
//System.out.println(str.toLowerCase()); // hello world
//System.out.println(str.toUpperCase()); // HELLO WORLD

//s.toUpperCase()	 переводит все символы строки в верхний регистр
//s.toCharArray()	 преобразовывает строку в массив символов

//split()
//String text = "FIFA will never regret it";
//String[] words = text.split(" ");
//for(String word : words){
//    System.out.println(word);
//}

// Строки
public class Stepik4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Task1 - Необходимо вывести  строку "yes", если символ является цифрой, и строку "no" в противном случае.
        // Ввод - 8 , yes e - no
//        char c = sc.next().charAt(0);
//        if (c >= '0' && c <= '9') {
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }

        //Task2 - Дана строка. Вывести строки; Гарантируется, что вводится строчке, состоящая не менее, чем из 5 символов.
        // Ввод - ABCDEFGHI; Ответ:
        //C - Сначала выведите третий символ этой строки.
        //H - Во второй строке выведите предпоследний символ этой строки.
        //ABCDE - В третьей строке выведите первые пять символов этой строки.
        //ABCDEFG - В четвертой строке выведите всю строку, кроме последних двух символов.
        //DEFGHI - На пятой строке выведите всю строку, кроме первых 3 символов.
        //9 - На шестой строке выведите длину данной строки.
//        String str = sc.nextLine(); // ABCDEFGHI
//            char c = str.charAt(2);
//            int start = 0;
//            int end = 5;
//            char[] dst = new char[end - start];
//            str.getChars(start, end, dst, 0);
//
//            int a = 0;
//            int b = str.length() - 2;
//            char[] dst1 = new char[b - a];
//            str.getChars(a, b, dst1, 0);
//
//            int a1 = 3;
//            int b1 = str.length();
//            char[] dst2 = new char[b1 - a1];
//            str.getChars(a1, b1, dst2, 0);
//
//        if (str.length() >= 6) {
//            System.out.println(c);
//            System.out.println(str.toCharArray()[str.length()-2]);
//            System.out.println(dst);
//            System.out.println(dst1);
//            System.out.println(dst2);
//            System.out.println(str.length());
//        }

        //Task3 - задание с заменом слов
        //Вход:
        //арахис - лергия;
        //колбаса - замена
        //рецепт 1. арахис 100гр, мороженое 200гр. возьмите арахис и измелчите его. посыпьте измельчённый арахис на мороженое. рецепт
        // Ответ: рецепт 1.
        // колбаса 100гр, мороженое 200гр. возьмите колбаса и измелчите его. посыпьте измельчённый колбаса на мороженое.
//        String str = "рецепт 1. арахис 100гр, мороженое 200гр. возьмите арахис и измелчите его. посыпьте измельчённый арахис на мороженое.";
//        String s = "арахис";
//        String s1 = "колбаса";
//        String replStr2 = str.replace(s, s1);
//        System.out.println(replStr2);

        //Task4 - Вводится число n, затем n строчек, которые необходимо соединить. После вводится ещё одна строка - которая должна быть в качестве разделителя.
        // Выведите одну строку - все введённые выше слова через разделитель.
        //Ввод: 5 , Привет, это, курсы, по , Java, -
//        int a = sc.nextInt();
//        String str;
//        String sym;
//        String [] arr = new String[a];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.next();
//        }
//        sym = sc.next();
//        str = String.join(sym,arr);
////        str = String.join(sym = sc.nextLine(),arr);
//                System.out.println(str);

        //Task5 - Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра. Определите индексы первого и последнего её вхождения.
        // 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
        //4
        // Ответ 0 - 28
//        String str = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
//        String numb = sc.nextLine();
//        System.out.println(str.indexOf(numb));
//        System.out.println(str.lastIndexOf(numb));

        //Task6 - Маша и Олег играли в игру. Маша читала статьи в газете и выписывала слова, которые начинаются на её любимую букву и заканчиваются на любимую букву её друга Олега.
        // Олег же наоборот - слова, которые начинаются на его любимую букву и заканчиваются на любимую букву Маши. Обратите внимание, что буквы могут быть в разных регистрах (большие/маленькие).
        // Определите, сколько слов выписали дети.
        //Ввод: а, в, Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
        //Ответ 2, 3
//        int count = 0;
//        int count1 = 0;
//        String m = sc.nextLine();
//        String o = sc.nextLine();
//        String str = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
//        String [] arr = str.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].startsWith(m) && arr[i].endsWith(o) || arr[i].startsWith(m.toUpperCase(Locale.ROOT)) && arr[i].endsWith(o)){
//                count++;
//            }
//            else if (arr[i].startsWith(o) && arr[i].endsWith(m) || arr[i].startsWith(o.toUpperCase(Locale.ROOT)) && arr[i].endsWith(m)){
//                count1++;
//            }
//        }
//        System.out.println(count);
//        System.out.println(count1);

        //Task7 -















    }
}