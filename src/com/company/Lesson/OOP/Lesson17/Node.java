package com.company.Lesson.OOP.Lesson17;

public class Node {
    int value;
    Node nextNode;
    public int getValue() {
        return value;
    } // Вызов значения

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }
    // установка следующей ноды например node1.getNextNode.getValue - показывает значение следующей ноды, те 2

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }  // Ссылаемся на следующую ноду

    public Node() {  ////Значение 0, и следующая нода пустая
        this.value = 0;
        this.nextNode = null;
    }

    public Node(int value, Node nextNode) {  ////Устанавливаем значение, и устанавливаем ноду
        this.value = value;
        this.nextNode = nextNode;
    }
    public Node(int value){  //Устанавливаем значение, а следующая нода пустая
        this.value = value;
        this.nextNode = null;
    }
}
