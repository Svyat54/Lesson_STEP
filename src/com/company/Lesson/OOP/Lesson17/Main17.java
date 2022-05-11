package com.company.Lesson.OOP.Lesson17;

import com.company.Lesson.OOP.Lesson18.List;
import com.company.Lesson.OOP.Lesson18.Node;

public class Main17 {
    public static void main (String [] args){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        List list1 = new List(node1);

        node1.setNextNode(node2); // Ссылаемся на следующую ноду с помощью setNextNode
        node2.setNextNode(node3);
        node3.setNextNode(node4);


//        list1.printList();

//        list1.push(9); // Добавляем новый эл в конце
//
//        list1.push(8, 3); // добавляем в элемент массива новое число
//        list1.printList();

//        list1.push(0); // добавляет эл в начало
//        list1.printList();

//        list1.pop(); // удаляет последний эл
//        list1.printList();

//        list1.pop(2); // удаляет i элемент
//        list1.printList();

//        list1.pop(0); // удаляет первый эл тк index = 0
//        list1.printList();


//        Node tmp = node1; //Пока нода не равна нул, идёт присвоение текущей ноды
//        while (tmp != null){
//            System.out.println(tmp.getValue());
//            tmp = tmp.getNextNode();
//        }
    }
}
