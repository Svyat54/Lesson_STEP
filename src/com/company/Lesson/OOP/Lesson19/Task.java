package com.company.Lesson.OOP.Lesson19;

public class Task {
    //Task1 - Найти среднее арифметическое значение элементов списка.
    //Done
    public static double task1 (List list){
    int sum = 0;
        ListIterator lsti = new ListIterator(list);
        while (lsti.hasNext()) {
            sum += (int)lsti.next().getValue();
        }
        return (double) sum/ list.getLenght();
}

    //Task2 - Перенести в начало списка его последний элемент.
    //
    public static void task2(List list){
//        Node tmp = list.getHead();
//        while (tmp.getNextNode() != null) {
//            tmp = tmp.getNextNode();
//        }
//        list.push(tmp.getValue(),0);
//        list.pop();

//        ListIterator lsti = new ListIterator(list);
//        while (lsti.hasNext()){
//
//        }
//        lsti.next();
}

    //Task3 - Поменять местами первый и последний элементы списка.
    //
    public static void task3(List list){
//        Node tmp = list.getHead();
//        Node tmp1 = list.getHead();
//        while (tmp.getNextNode() != null) {
//            tmp = tmp.getNextNode();
//        }
//        list.push(tmp.getValue(),0);
//        list.pop();
//        list.push(list.getHead().getNextNode().getValue());
//        list.pop(0);

        ListIterator lsti = new ListIterator(list);
        while (lsti.hasNext()){

        }
        lsti.next();
    }

    //Task4 - Определить количество слов в списке, которые начинаются и заканчиваются на одну букву.
    //Done
    public static int task4 (List list) {
        int count = 0;
        ListIterator lsti = new ListIterator(list);
        while (lsti.hasNext()){
            if(Character.toLowerCase(lsti.getTmp().getValue().toString().charAt(0)) ==
                    Character.toLowerCase(lsti.getTmp().getValue().toString().charAt(lsti.getTmp().getValue().toString().length() - 1))){
                count++;
            }
            lsti.next();
        }
        return count;
    }

    //Task5 - Проверить, что каждое следующее слово в списке начинается с последней буквы предыдущего.
    //Done
    public static boolean task5(List list){
        ListIterator lsti = new ListIterator(list);
        while (lsti.getTmp().getNextNode() != null){
            if (Character.toLowerCase(lsti.getTmp().getValue().toString().charAt(lsti.getTmp().getValue().toString().length() -1 )) !=
                    Character.toLowerCase(lsti.getTmp().getNextNode().getValue().toString().charAt(0))){
                return false;
            }
            lsti.next();
        }
        return true;
    }

    // Task6 - Определить количество слов в списке, которые совпадают с первым или (последним) словом списка.
    //Done
    public static int task6(List list, boolean isHead) {
        int count = 0;
        ListIterator lsti = new ListIterator(list);
        if (isHead) {
            while (lsti.getTmp().getNextNode() != null) {
                if (lsti.getTmp().getValue().equals(lsti.getList().getHead().getValue())) {
                    count++;
                }
                lsti.next();
            }
            return count;
        } else {
            while (lsti.hasNext()) {
                if (list.getTail().getValue().toString().equals(lsti.getTmp().getValue().toString())) {
                    count++;
                }
                lsti.next();
            }
        }
        return count;
    }

    //Task7 - Проверить, упорядочены ли элементы списка по алфавиту.
    //Done
    public static boolean isAlphabet (String word1, String word2){
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if (Character.toLowerCase(word1.charAt(i)) != Character.toLowerCase(word2.charAt(i))) {
                return ((Character.toLowerCase(word1.charAt(i)) < Character.toLowerCase(word2.charAt(i))));
            }
        }
        return (word1.length() < word2.length());
    }
    public static boolean task7(List list) {
        ListIterator lsti = new ListIterator(list);
        while (lsti.getTmp().getNextNode() != null) {
            if (!isAlphabet(lsti.getTmp().getValue().toString(), lsti.getTmp().getNextNode().getValue().toString())) {
                return false;
            }
            lsti.next();
        }
        return true;
    }

    //Task8 - Определить, входит ли список L1 в L2.
    //Done
    public static boolean task8(List listBig, List listSmall){
        StringBuilder stringBuilderBig = new StringBuilder();
        StringBuilder stringBuilderSmall = new StringBuilder();
        ListIterator lsti = new ListIterator(listBig);
        while (lsti.hasNext()){
            stringBuilderBig.append(lsti.getTmp().getValue().toString());
            lsti.next();
        }
        System.out.println(stringBuilderBig);
        lsti = new ListIterator(listSmall);
        while (lsti.hasNext()){
            stringBuilderSmall.append(lsti.getTmp().getValue().toString());
            lsti.next();
        }
        return (stringBuilderBig.toString().contains(stringBuilderSmall.toString()));
    }
    //Task9 - Перевернуть список наоборот.
    public static void task9(List list){
        Node tmp = list.getHead();

        while (tmp.getNextNode() != null){
            String[] arr = tmp.getValue().toString().split("");
            for(int i = arr.length - 1; i >= 0; i--){
                System.out.println(arr[i]);
            }
            tmp = tmp.getNextNode();
        }
    }
}