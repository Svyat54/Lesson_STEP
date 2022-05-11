package com.company.Lesson.OOP.Lesson20;
//DZ
//http://www.itmathrepetitor.ru/programmirovanie-zadachi-na-spiski/

public class Main {
    public static void main (String[] args){
//        Integer [] arr = new Integer[] {1, 2, 3, 4, 5, 6, 7};
//        List list = new List(arr);
//
//        list.printList();
//        System.out.println();
//        list.pop(3);
//        list.printList();
//        System.out.println();
//        list.reversList();
//        System.out.println();
//        list.pop();
//        list.printList();
//        System.out.println();
//        list.reversList();
//        System.out.println();
//        list.popHead();
//        list.printList();
//        list.reversList();

        //Динамический массив
        int [] arr = new int[] {1, 2, 3, 4, 5 };
        DynamicArr arr1 = new DynamicArr(arr);
        arr1.printArr();
        arr1.push(6);
        arr1.printArr();


    }

}
