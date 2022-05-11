package com.company.Lesson.OOP.Lesson20;

public class List {
    private Node head;
    private int length;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public List() {
        this.head = null;
        this.length = 0;
    }

    public List(Node head) {
        this.head = head;
        this.length = 1;
    }

    public List(Object[] arrayInput) {
        this.head = new Node(arrayInput[0]);
        for (int i = 1; i < arrayInput.length; i++) {
            this.push(arrayInput[i]);
        }
        this.length = arrayInput.length;
    }

    public Node getLast() {
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        return nodeTmp;
    }

    public void printList() {
        System.out.print("[");
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode() != null) {
            System.out.print(nodeTmp.getValue() + ", ");
            nodeTmp = nodeTmp.getNextNode();
        }
        System.out.print(nodeTmp.getValue() + "]");
        System.out.println();
    }

    public void push(Object value) {
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.setNextNode(new Node(value, null, nodeTmp));
        this.length++;
    }

    public void push(Object value, int index) {
        if (index == 0) {
            this.pushHead(value);
        }
        else {
            Node nodeTmp = this.head;
            for (int i = 0; i < index - 1 && nodeTmp.getNextNode() != null; i++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            Node newNode = new Node(value, nodeTmp.getNextNode(), nodeTmp);
            nodeTmp.setNextNode(newNode);
        }
        this.length++;
    }

    private void pushHead(Object value) {
        Node node = new Node(value, this.head, null);
        this.head.setPrevNode(node);
        this.head = node;
    }

    public void pop() {
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode().getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.getNextNode().setPrevNode(null);
        nodeTmp.setNextNode(null);
        this.length--;
    }

    public void pop(int index) {
        if (index == 0) {
            popHead();
        }
        else {
            Node nodeTmp = this.head;
            for (int i = 0; i < index - 1 && nodeTmp.getNextNode().getNextNode() != null; i++) {
                nodeTmp = nodeTmp.getNextNode();
            }
            nodeTmp.getNextNode().getNextNode().setPrevNode(nodeTmp);
            nodeTmp.setNextNode(nodeTmp.getNextNode().getNextNode());
            this.length--;
        }
    }

    public void popHead() {
        this.head = this.head.getNextNode();
        this.head.setPrevNode(null);
        this.length--;
    }

    public void reversList() {
        System.out.print("[");
        Node nodeTmp = this.getLast();
        while (nodeTmp.getPrevNode() != null) {
            System.out.print(nodeTmp.getValue() + ", ");
            nodeTmp = nodeTmp.getPrevNode();
        }
        System.out.print(nodeTmp.getValue() + "]");
        System.out.println();
    }
}
