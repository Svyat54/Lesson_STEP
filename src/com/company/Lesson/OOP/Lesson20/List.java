package com.company.Lesson.OOP.Lesson20;

import static java.lang.Integer.valueOf;

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

    public List(List list) {
        this.head = new Node(list.getHead().getValue());
        this.length = 1;
        Node nodeTmp = list.getHead().getNextNode();
        while (nodeTmp != null) {
            this.push(nodeTmp.getValue());
            nodeTmp = nodeTmp.getNextNode();
        }
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
        if (this.isVoid()){
            this.pushHead(value);
        }
        else {
            Node nodeTmp = this.head;
            while (nodeTmp.getNextNode() != null) {
                nodeTmp = nodeTmp.getNextNode();
            }
            nodeTmp.setNextNode(new Node(value, null, nodeTmp));
        }
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
            newNode.getNextNode().setPrevNode(newNode);
            nodeTmp.setNextNode(newNode);
        }
        this.length++;
    }

    private void pushHead(Object value) {
        if (this.isVoid()){
            this.setHead(new Node(value));
        }
        else {
            Node node = new Node(value, this.head, null);
            this.head.setPrevNode(node);
            this.head = node;
        }
    }

    public void pop() {  // Удаление последнего элемента
        Node nodeTmp = this.head;
        while (nodeTmp.getNextNode().getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.getNextNode().setPrevNode(null);
        nodeTmp.setNextNode(null);
        this.length--;
    }

    public void pop(int index) {  //удаление по индексу
        if (index == 0) {
            popHead();
        } else {
            if (index == this.length - 1) {
                pop();
            } else {
                Node nodeTmp = this.head;
                for (int i = 0; i < index - 1 && nodeTmp.getNextNode().getNextNode() != null; i++) {
                    nodeTmp = nodeTmp.getNextNode();
                }
                nodeTmp.getNextNode().getNextNode().setPrevNode(nodeTmp);
                nodeTmp.setNextNode(nodeTmp.getNextNode().getNextNode());
                this.length--;
            }
        }
    }

        public void popHead () {
            if (this.head.getNextNode() == null) {
                this.head.setPrevNode(null);  // удаление головы
                this.head.setNextNode(null);
                this.head.setValue(null);
            } else {
                this.head = this.head.getNextNode();
                this.head.setPrevNode(null);
            }
            this.length--;
        }

    public void popDell(){
        while (this.head != null){
           this.popHead();  //Удаление всех элементов
        }
    }

    public void popDellValue(Object value){  //Удаление по значению и если они повторяются тоже удаляет
        Node nodeTmp = this.head;
        int count = 0;
        while (nodeTmp != null) {
            if (nodeTmp.getValue() == value) {
                this.pop(count);
                count--;
            }
                count++;
                nodeTmp = nodeTmp.getNextNode();
            }
        }

    public void popValue(Object value){  //Удаление значения по введённому числу
        Node tmp = this.head;
        int count = 0;
        while (tmp != null){
            if (tmp.getValue() == value){
                this.pop(count);
                count--;
                break;
            }
            count++;
            tmp = tmp.getNextNode();
        }
    }

    public boolean popTwoel(List list){ //Определение, можно ли удалить из списка каких-нибудь два элемента так, чтобы новый список оказался упорядоченным.
        Node tmp;
        int count = 0;
        for (int i = 0; i < list.length; i++){
            tmp = list.getHead();
            while (tmp.getNextNode() != null){
                if (Integer.parseInt(tmp.getValue().toString()) > Integer.parseInt(tmp.getNextNode().getValue().toString())){
                    System.out.println(tmp.getValue());
                    list.popValue(tmp.getValue());
                    count++;
                }
                tmp = tmp.getNextNode();
            }
        }
        return (count >= 1);
    }

//    public void popValueCopy(List list){
//
//    }

//    public void coup (List list){
//        Node tmp;
//        for (int i = 0; i < list.getLength(); i++) {
//            tmp = list.getHead();
//            while (tmp.getNextNode() != null) {
//                tmp = tmp.getNextNode();
//            }
//            list.push(tmp.getValue(), i);
//            list.pop();
//        }
//    }

    public void replace (Object value, Object valueNew){  //Изменение всех элементов списка с данным значением на новое.
        Node tmp = this.head;
        while (tmp != null){
            if (tmp.getValue() == value){
                tmp.setValue(valueNew);
            }
            tmp = tmp.getNextNode();
        }
    }

    public boolean isVoid(){
        return (this.length == 0); // Проверяет список на пустоту
    }

    public int uniqueVal(){
        List listTmp = new List(this); //Определение, сколько различных значений содержится в списке.
        int count = 0;
        while (listTmp.getHead().getValue() != null) {
            listTmp.popDellValue(listTmp.getHead().getValue());
            count++;
        }

        return count;
    }

    public boolean valueList(Object value){  //Поиск данного значения в списке
        Node tmp = this.head;
        while (tmp.getNextNode() != null){
            if(tmp.getValue() == value){
                return true;
            }
            tmp = tmp.getNextNode();
        }
        return false;
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

