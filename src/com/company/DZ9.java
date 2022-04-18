package com.company;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.lang.String;
import java.io.*;
public class DZ9 {
    public static void  main (String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //Task 1 - Ввести с клавиатуры строку текста, а затем один символ. Показать на консоль индексы и количество совпадений (ищем вхождения символа в строку). В случае если совпадений не
        //найдено, вывести соответствующий текст. - DONE
//        int count = 0, index = 0;
//        System.out.print("Какой символ ищем: ");
//        String sym = sc.next();
//        String [] arrsym = {sym};
//        System.out.print("Введите текст: ");
//        String str = sc.next();
//        String [] arrtext = str.split("");
//        for (int i = 0; i< arrtext.length;i++){
//            for (int j = 0; j < arrsym.length; j++){
//                if (arrsym[j].equals(arrtext[i])){
//                    count++;
//                    index = i;}}}
//                if (count > 0){
//                    System.out.println("Индекс: " + index + " встречается "+count+ " раз(а)");}
//                else System.out.println("Совпадений нет");


        // Task 2 - Написать программу, которая создаст строку, в которой находятся все целые числа, начиная с 1, выписаны в одну строку «123456789101112131415...». Строка должна быть
        //длиной не более 1 000 символов. По числу n (введенного с клавиатуры), выведите цифру на n-й позиции (используется нумерация с 1).
        //DONE
//        System.out.print("Введите число: ");
//        int n = sc.nextInt();
//        String str = "1";
//        int count = 0;
//        for (int i = 2; ; i++){
//            if (str.length() < 1000 - 1){
//                str += i;
//            } else {break;}
//        }
//        System.out.println(str);
//        System.out.println();
//        System.out.println("Цифра в позиции: " + str.charAt(n - 1));

        // Task3 - Подсчитать среднюю длину слова, во введенном с клавиатуры предложении. - Done
//        System.out.print("Введите слово: ");
//        String str = sc.nextLine();
//        double count = 0, dlina = 0;
//        String [] arr = str.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            count++;
//            dlina += arr[i].length();}
//        if (str.isEmpty()){
//            System.out.println("Нет вводных для подсчёта");}
//           if (count > 1) {
//                        System.out.print("Средняя длина слова :" + dlina/count);}


        //Task4 - Ввести строку с клавиатуры (латиницей). Из введенной строки выбрать все слова, начинающиеся на гласные буквы и заканчивающиеся на согласные. Вывести отобранные
        //слова на консоль.


        //Task5 - Ввести строку с клавиатуры. В строке должны содержаться слова, которые могут быть раздельные пробелами или двоеточиями. Необходимо вычислить количество слов в
        //строке, у которых четное количество букв. - Done
//        System.out.print("Введите слово: ");
//        String str = sc.nextLine();
//        double count = 0, dlina = 0;
//        String [] arr = str.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            dlina = arr[i].length();
//        if (dlina % 2 == 0) {
//               count ++;}}
//        if (str.isEmpty()){
//            System.out.println("Нет вводных для подсчёта");}
//            if (count > 1)
//        System.out.print("Кол-во слов с чётным кол-вом букв: " + count);
//            else {
//                    System.out.println("Введённые слова содержат нечётное кол-во букв");}


        //Task 7 - Пользователь вводит с клавиатуры любую строку. Поменять в исходной строке все большие буквы на маленькие, а маленькие – на большие. Если в строке при-
        //сутствуют цифры, заменить на символ подчеркивания и вывести результат на консоль. - DONE

//        char text, progress;
//        progress = 0;
//        System.out.print("Введите текст в конце !: ");
//        do {
//            text = (char) System.in.read();
//            if (text >= 65 && text <= 90) // буквы переводятся в строчные
//                progress = (char) (text+32);
//            if (text >= 91 && text <= 122) // буквы переводтся в заглавные
//                progress = (char) (text-32);
//            if (text >= 49 && text <=58)
//                progress = (char) 95;
//            if (progress != 0){
//                System.out.print(progress);}
//            else
//                System.out.print(text);
//                progress = 0;
//        }
//        while (text != '!');
//        System.out.println("Для завершения введите !");



        //Task 10 - Напишите программу, которая будет печатать ромбовидный рисунок на основе строки, введенной с клавиатуры (максимальная длина – 50 символов).
        //Пример вывода для строки testing: - DONE
//        String text = "";
//        System.out.print("Введите текст до 50 символов ");
//        String str = sc.nextLine();
//        String [] arr = str.split("");

        //Мой вариант
//        if (arr.length > 50)
//            System.out.println("Введено слово превышающее 50 символов");
//        else {
//        for (int i =0; i < arr.length - 1; i++){
//            text += arr[i];
//            String text1 = " ".repeat(arr.length - i) + text;
//            System.out.println(text1);}
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(str.substring(i));}}

        //         не мой вариант
//        for (int i = 0; i < arr.length; i++)
//            System.out.println(" ".repeat(arr.length - i) + str.substring(arr.length - i));
//        for (int i = 0; i < arr.length; i++)
//            System.out.println(str.substring(i));

//        for (int i = 0; i < arr.length; i ++){
//            count = i;
//            if (count >= 6){
//                System.out.println("Введен текст превышающий 50 символов");
//                break;}}






        //Task12 -
//        public class Task12_UltimateCompleted {
//
//            static String initializeString (String strInput) {
//                return strInput.replace(';', ':');
//            }
//            static boolean isEyes (String strInput, int index) {
//                return  (strInput.charAt(index) == ':');
//            }
//            static boolean isMouth (String strInput, int index) {
//                return (strInput.charAt(index) == '[' | strInput.charAt(index) == ']' | strInput.charAt(index) == '(' |
//                        strInput.charAt(index) == ')');
//            }
//            static boolean isNose (String strInput, int index) {
//                return (strInput.charAt(index) == '-');
//            }
//            static boolean isRightEyes (String strInput, int index) {
//                if (index == 0)
//                    return (isNose(strInput, index + 1) || isMouth(strInput,index + 1));
//                else
//                    return ((!isNose(strInput, index - 1) && !isEyes(strInput, index - 1) &&
//                            !isMouth(strInput, index - 1)) &&
//                            (isMouth(strInput, index + 1) || isNose(strInput, index + 1)));
//            }
//            static boolean isCompleteSmile (String strInput, int index) {
//                if (index == strInput.length() - 1)
//                    return true;
//                else
//                    return (!isEyes(strInput, index) && ! isNose(strInput, index) && !isMouth(strInput, index));
//            }
//            static int switchMethod (int elementsCounter, String strInput, int index) {
//                if (elementsCounter == 0)                                                   //ищем глаза
//                    if (isEyes(strInput,index) && isRightEyes(strInput, index))
//                        return 1;
//                    else
//                        return 0;
//
//                if (elementsCounter == 1)                                                   //есть глаза- ищем нос или рот
//                    if (isMouth(strInput, index))
//                        return 2;
//                    else
//                    if (isNose(strInput, index))
//                        return 1;
//                    else
//                        return - 1;
//
//                if (elementsCounter == 2)                                                   //есть глаза и нос- ищем рот
//                    if (isNose(strInput, index))
//                        return 0;
//                    else
//                    if (isMouth(strInput, index))
//                        if (isCompleteSmile(strInput,index))
//                            return 2;
//                        else
//                            return 1;
//                    else
//                        return -1;
//
//                if (elementsCounter == 3)                                                   //есть смайл, проверка на закрывающий символ или продолжение рта
//                    if (index == strInput.length() - 1)
//                        return 1;
//                    else
//                    if (strInput.charAt(index) == strInput.charAt(index - 1))
//                        return 0;
//                    else
//                    if (isCompleteSmile(strInput, index))
//                        return 1;
//                    else return -1;
//
//                return -1;
//            }
//
//            static int smilesCounter (String strInput) {
//                int elementsCounter = 0;
//                int smilesCounter = 0;
//
//                for (int i = 0; i < strInput.length(); i ++) {
//                    if (switchMethod(elementsCounter, strInput, i) == -1)
//                        elementsCounter = 0;
//                    else {
//                        elementsCounter += switchMethod(elementsCounter, strInput, i);
//                        if (elementsCounter == 4) {
//                            smilesCounter++;
//                            //System.out.println(smilesCounter + "\t" + i);
//                            elementsCounter = 0;
//                        }
//                    }
//                }
//                return smilesCounter;
//            }
//
//            public static void main(String[] args) {
//                String str1 = ";;==) :-))))))))) :---]{ ;------]";
//                String str2 = ";;==) :-))))))))) :---]{ ;------] :(((";
//                String str3 = ":) :-))))))))) :---]) ];------]";
//                String str4 = " :}}.:]]]]";
//
//                System.out.println(str1);
//                str1 = initializeString(str1);
//                System.out.println(smilesCounter(str1));
//
//                System.out.println(str2);
//                str2 = initializeString(str2);
//                System.out.println(smilesCounter(str2));
//
//                System.out.println(str3);
//                str3 = initializeString(str3);
//                System.out.println(smilesCounter(str3));
//
//                System.out.println(str4);
//                str4 = initializeString(str4);
//                System.out.println(smilesCounter(str4));
//            }
//        }
            }
        }

