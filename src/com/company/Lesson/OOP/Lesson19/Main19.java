package com.company.Lesson.OOP.Lesson19;
//ДЗ
//Выполнить 4-5 заданий из самостоятельной работы используя механизм итераторов (там где это уместно)

public class Main19 {
    public static void main(String[] args) {
//        Node node1 = new Node(1);
//
//        List list1 = new List(node1);
//        list1.push(2);
//        list1.push(3);
//        list1.push(4);
//        list1.push(5);
//        ListIterator lsti = new ListIterator(list1);
////        while (lsti.hasNext()) {
////            System.out.println(lsti.next().getValue());
////        }
//        lsti.forEachRemaining((node) -> System.out.println(node.getValue()));

        //Для таска 1-3
        int[] arr = new int[] {5, 7, 22, 21, 4, 9, 18}; // 12.285714285714286
        Node node1 = new Node(arr[0]);
        List list = new List(node1);
        for (int i = 1; i < arr.length; i++){
            list.push(arr[i]);
        }
        System.out.println(Task.task1(list));
    }
}
