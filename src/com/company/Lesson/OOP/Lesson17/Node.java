package com.company.Lesson.OOP.Lesson17;

public class Node {
    int value;
    Node nextNode;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node() {
        this.value = 0;
        this.nextNode = null;
    }

    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
    public Node(int value){
        this.value = value;
        this.nextNode = null;
    }
}
