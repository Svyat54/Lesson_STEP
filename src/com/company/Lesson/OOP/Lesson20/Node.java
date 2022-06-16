package com.company.Lesson.OOP.Lesson20;

public class Node {
    private Object value;
    private Node nextNode;
    private Node prevNode;

    public Node getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node() {
        this.value = null;
        this.nextNode = null;
        this.nextNode = null;
    }

    public Node(Object value) {
        this.value = value;
        this.nextNode = null;
        this.nextNode = null;
    }

    public Node(Object value, Node nextNode, Node prevNode) {
        this.value = value;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

    public boolean nodeEqualValue(Node node) {
        return (this.getValue() == node.getValue());
    }
}
