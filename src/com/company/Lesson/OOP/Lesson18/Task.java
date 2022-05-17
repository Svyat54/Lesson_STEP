package com.company.Lesson.OOP.Lesson18;

import java.util.Arrays;

public class Task {
    //Task1 - Найти среднее арифметическое значение элементов списка.
    //
    public static double task1 (List list){
        int sum = 0;
        int count = 0;
        Node tmp = list.getHead();
        while (tmp != null) {
            sum += (int) tmp.getValue();
            tmp = tmp.getNextNode();
            count++;
            System.out.println(sum+ " " + count);
        }
        return (double) sum/count;
    }

    //Task2 - Перенести в начало списка его последний элемент.
    //
    public static void task2(List list){
        Node tmp = list.getHead();
        while (tmp.getNextNode() != null) {
            tmp = tmp.getNextNode();
        }
        list.push(tmp.getValue(),0);
        list.pop();
    }

    //Task3 - Поменять местами первый и последний элементы списка.
    //
    public static void task3(List list){
        Node tmp = list.getHead();
        Node tmp1 = list.getHead();
        while (tmp.getNextNode() != null) {
            tmp = tmp.getNextNode();
        }
        list.push(tmp.getValue(),0);
        list.pop();
        list.push(list.getHead().getNextNode().getValue());
        list.pop(0);
    }

    //Task4 - Определить количество слов в списке, которые начинаются и заканчиваются на одну букву.
    //
    public static int task4 (List list) {
        int count = 0;
        Node tmpStr = list.getHead();
        while (tmpStr != null){
            if (Character.toLowerCase(tmpStr.getValue().toString().charAt(0)) ==
                    Character.toLowerCase(tmpStr.getValue().toString().charAt(tmpStr.getValue().toString().length() - 1))){
                count++;
            }
            tmpStr = tmpStr.getNextNode();
        }
        return count;
    }

    //Task5 - Проверить, что каждое следующее слово в списке начинается с последней буквы предыдущего.
    //
    public static boolean task5(List list){
//            int count = 0;
        Node tmpStr = list.getHead();
        while (tmpStr.getNextNode() != null){
            if (Character.toLowerCase(tmpStr.getValue().toString().charAt(tmpStr.getValue().toString().length() -1 )) != Character.toLowerCase(tmpStr.getNextNode().getValue().toString().charAt(0))){
                return false;
            }
            tmpStr = tmpStr.getNextNode();
        }
        return true;
    }

    // Task6 - Определить количество слов в списке, которые совпадают с первым или (последним) словом списка.
    public static int task6(List list, boolean isHead) {
        int count = 0;
        if (isHead) {
            Node tmp = list.getHead();
            while (tmp != null) {
                if (tmp.getValue().equals(list.getHead().getValue())) {
                    count++;
//                    System.out.println(tmp.getValue());
                }
                tmp = tmp.getNextNode();
            }
            return count;
        } else {
            Node tmp = list.getHead();
            while (tmp.getNextNode() != null) {
                tmp = tmp.getNextNode();
            }
            String str = tmp.getValue().toString();
            tmp = list.getHead();
            while (tmp != null) {
                if (tmp.getValue().toString().equals(str)) {
                    count++;
                }
                tmp = tmp.getNextNode();
            }
        }
        return count;
    }

    //Task7 - Проверить, упорядочены ли элементы списка по алфавиту.
    public static boolean isAlphabet (String word1, String word2){
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if (Character.toLowerCase(word1.charAt(i)) != Character.toLowerCase(word2.charAt(i))) {
                return ((Character.toLowerCase(word1.charAt(i)) < Character.toLowerCase(word2.charAt(i))));
            }
        }
        return (word1.length() < word2.length());
    }

    public static boolean task7(List list) {
        Node tmp = list.getHead();
        while (tmp.getNextNode() != null) {
            if (!isAlphabet(tmp.getValue().toString(), tmp.getNextNode().getValue().toString())) {
                return false;
            }
            tmp = tmp.getNextNode();
        }
        return true;
    }

    //Task8 - Определить, входит ли список L1 в L2.
    //
    public static boolean task8 (List bList, List sList){
        Node bigList = bList.getHead();
        Node smalList = sList.getHead();
        while (bigList.getNextNode() != null){
            if (bigList.getValue() == smalList.getValue()){
                while (smalList.getNextNode() != null){
                    smalList = smalList.getNextNode();
                    bigList = bigList.getNextNode();
                    while (bigList.getValue() != smalList.getValue()){
                        return false;
                    }
                }
            }
            bigList = bigList.getNextNode();
        }
        return true;
    }

    //Task9 - Перевернуть список наоборот.
    public static void task9(List list){
        Node tmp; // создаём ноду
        for (int i = 0; i < list.getLenght(); i++) {   // цикл по длине листа
            tmp = list.getHead(); // объявляем ноду головой
            while (tmp.getNextNode() != null) {   // доходим до последнего элемента
                tmp = tmp.getNextNode(); // прявязываем значение ноды, последнего элемента
            }
            list.push(tmp.getValue(), i); // добавляем tmp в начало по индексу
            list.pop(); // удаляем последний элемент списка
        }
        }
    }

