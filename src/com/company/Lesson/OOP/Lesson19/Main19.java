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
//        int[] arr = new int[] {5, 7, 22, 21, 4, 9, 18};
//        Node node1 = new Node(arr[0]);
//        List list = new List(node1);
//        for (int i = 1; i < arr.length; i++){
//            list.push(arr[i]);
//        }
//        System.out.println(Task.task1(list));
//        Task.task2(list);
//        list.printList();

        //Task4 - 6
//        String[] arrayOfStringsTask4 = {"tube", "youtube", "alabama", "afrika", "antarctica", "artikanka", "rambler", "afk"};
//        String[] arrayOfStrings1Task5 = {"tube", "elf", "fusion", "nail", "lock", "key", "Yellow"}; // true
//        String[] arrayOfStrings2Task5 = {"tube", "elf", "ghost", "nail", "lock", "key", "yellow"}; // false
//        String[] arrayOfStringsTask6 = {"tube", "year", "speed", "year", "tube", "range", "year", "tube", "tube","stock", "object", "year"};
//        Node nodeStr = new Node(arrayOfStringsTask6[0]);
//        List listStr = new List(nodeStr);
//        for (int i = 1; i < arrayOfStringsTask6.length; i++){
//            listStr.push(arrayOfStringsTask6[i]);
//        }
//        listStr.printList();
//        System.out.println();


//        System.out.println(Task.task5(listStr));

//        System.out.println("Совпадений с словом - "+ arrayOfStringsTask6[0]+ " " + Task.task6(listStr, true));
//        System.out.println("Совпадений с словом - "+ arrayOfStringsTask6[arrayOfStringsTask6.length-1]+ " " + Task.task6(listStr, false));

        //Task7
//        String[] arrayOfStringsTask7 = {"alpha", "brandy", "crash", "java", "lie", "Opportunity", "rock",
//                "towel", "uranus", "Victory", "zoo"};
//        List list = new List(arrayOfStringsTask7);
//        list.printList();
//        System.out.println();
//        System.out.println(Task.task7(list));

        //Task8
//        String[] arrayOfStringsBigTask8 = {"alpha", "brandy", "crash", "Java", "lie", "opportunity", "rock",
//                "towel", "Uranus", "victory", "zoo"};
//        String[] arrayOfStringsSmallTask8 = {"crash", "Java", "lie", "opportunity", "rock", "towel"};
//        List bList = new List(arrayOfStringsBigTask8);
//        bList.printList();
//        System.out.println();
//        List sList = new List(arrayOfStringsSmallTask8);
//        sList.printList();
//        System.out.println();
//        System.out.println(Task.task8(bList,sList));

        //Task9
        String[] arrayOrStringsTask9 = {"crash", "Java", "lie", "opportunity", "rock", "towel", "Uranus"};
        List list = new List(arrayOrStringsTask9);
        list.printList();
        System.out.println();
        Task.task9(list);
        list.printList();
    }
}
