package com.company.Lesson.OOP.Lesson17;

public class List {
    private Node head;
    public List() {
        this.head = null;
    }
    public List(Node head) {
        this.head = head;
    }

    public void printList (){
        Node tmp1 = this.head;
        while (tmp1 != null){
            System.out.println(tmp1.getValue());
            tmp1 = tmp1.getNextNode();
        }
    }

    public void push(int value){
        Node tmp1 = this.head;
        while (tmp1.getNextNode() != null){
            tmp1 = tmp1.getNextNode();
        }
        tmp1.setNextNode(new Node(value)); // Добавляем новый эл в конце
    }

    public void push (int value, int index){
        if (index == 0 ){
            this.pushHead(value);   // добавляем эл в начало, вызываем метод
        }
        else {
            Node tmp1 = this.head;
            for (int i = 0; i < index - 1 && tmp1.getNextNode() != null; i++) {
                tmp1 = tmp1.getNextNode();
            }
            Node newNode = new Node(value, tmp1.getNextNode()); // добавляем в элемент массива новое число
            tmp1.setNextNode(newNode);
        }
    }
    private void pushHead(int value){
        Node node = new Node(value, this.head);
        this.head = node; // добавляет в начало
    }

    public void pop (){
        Node tmp1 = this.head;
        while (tmp1.getNextNode().getNextNode() != null){
            tmp1 = tmp1.getNextNode();
        }
        tmp1.setNextNode(null); // удаляет последний эл
    }

    public void pop (int index){
        if (index == 0){
            popHead(); // удаляем первый эл
        }
        else {
            Node tmp1 = this.head;
            for (int i = 0; i < index - 1 && tmp1.getNextNode().getNextNode() != null; i++) {
                tmp1 = tmp1.getNextNode();
            }
            tmp1.setNextNode(tmp1.getNextNode().getNextNode()); // удаляет i элемент
        }
    }

    private void popHead(){
        this.head = this.head.getNextNode();
    }


}
