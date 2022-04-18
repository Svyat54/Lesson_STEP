package com.company.Lesson;
import java.util.Scanner;

public class Lesson8 {
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in);
        //str1.contains("text") --> проверяет находится ли строка в переменной
        //String str1 = "Hello"; // str.charAt(0) --> обращается к символу 1 те H
        //String pass = sc.nextLine();


// генератор паролей
//        char [] numbers  = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A' };
//        Scanner scanner = new Scanner(System.in);
//        String password = scanner.nextLine(); // "fish2sword"
//        int count_digits = 0, count_alpha = 0;// ascii java
//        for(int i = 0; i < password.length();i++)
//        {
//            if(((int)password.charAt(i) >= 48 && (int)password.charAt(i) <=57) )
//            {
//                count_digits++;
//            }
//            if(((int)password.charAt(i) >= 97 && (int)password.charAt(i) <=122) || ((int)password.charAt(i) >= 65 && (int)password.charAt(i) <=90))
//            {
//                count_alpha++;
//            }
//        }
//        System.out.println("Кол-во букв - " + count_alpha);
//        System.out.println("Кол-во цифр - " + count_digits);
//        System.out.println("Кол-во символов - " + (password.length() - count_alpha - count_digits ));
//        if(password.length() >= 8)
//        {
//            if(count_alpha > 0)
//            {
//                if(count_digits>0)
//                {
//                    if(password.length() - count_alpha - count_digits > 0)
//                    {
//                        System.out.println("Ваш пароль подходит");
//                    }
//                    else
//                    {
//                        System.out.println("В пароле должен быть как минимум один знак");
//                    }
//                }
//                else
//                {
//                    System.out.println("В пароле должна быть как минимум одна цифра");
//                }
//            }
//            else{
//                System.out.println("В пароле должно быть больше одной буквы");
//            }
//        }
//        else{
//            System.out.println("Пароль меньше восьми символов");
//        }

        // генератор случайных паролей
//        String s = "";
//        char sym = (char) (byte) (97 + (int) (Math.random() * ((122 - 97) + 1)));
//        for (int i = 0; i <= 8; i++){
//            if (Math.random() < 0.5){
//                sym = (char) (byte) (97 + (int) (Math.random() * ((122 - 97) + 1)));
//            } else {
//                sym = (char) (byte) (48 + (int) (Math.random() * ((57 - 48) + 1)));
//            }
//            s += sym;
//        }
//        System.out.print(s);

        // взлом паролей
//        String pass = "qwerty";
//        String s = "";
//        int j = 0;
//        while (!pass.equals(s)){
//            s = "";
//        char sym = (char) (byte) (97 + (int) (Math.random() * ((122 - 97) + 1)));
//        for (int i = 0; i < 6; i++){
//                sym = (char) (byte) (97 + (int) (Math.random() * ((122 - 97) + 1)));
//            s += sym;
//        }j++;
//        if(j % 1000000 == 0){
//            System.out.println(s);
//        }}
//        System.out.print(s);

        //DZ
//        Сделать подсчет гласных букв в тексте. Есть переменная типа String (вводите с клавиатуры). В конце вывести количество гласных букв
//        char [] arr = new char[] {'а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю', 'е', 'ё'};
//        int count = 0;
//        System.out.print("Введите текст на RUS языке: ");
//        String str = sc.nextLine();
//        for (int i = 0; i < str.length(); i++){
//            for (int j = 0; j < arr.length; j++){
//            if (str.charAt(i) == arr[j]){
//                count++;
//            }}
//        }
//        System.out.println("Кол-во гласных букв = " + count);

//        Есть переменная типа String (вводите с клавиатуры). В конце вывести количество  слов в предложении.
//        char [] arr = new char[] {' '};
//        int count = 1;
//        System.out.print("Введите текст: ");
//        String str = sc.nextLine();
//        for (int i = 0; i < str.length(); i++){
//            for (int j = 0; j < arr.length; j++){
//                if (arr[j] == str.charAt(i)){
//                count++;
//            }}
//        }
//        System.out.println("Кол-во слов: " +count);

        //правильный вариант
//        char [] arr = new char[] {' '};
//        int count = 1;
//        System.out.print("Введите текст: ");
//        String str = sc.nextLine();
//        if (str.isEmpty()){
//            count = 0;}
//        for (int i = 0; i < str.length(); i++){
//            if (str.equals(" ") || str.equals("  ") || str.equals("   ")){count=0;}
//            for (int j = 0; j < arr.length; j++){
//                if (arr[j] == str.charAt(i)){
//                    count++;}}}
//        System.out.println((count));
    }
}
