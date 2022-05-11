package com.company.Lesson.OOP.Lesson19;

import java.util.Iterator;

public class ListIterator implements Iterator <Node> {
    private List list;
    private Node tmp;
    private int count;

    public ListIterator(List list) {
        this.list = list;
        this.tmp = list.getHead();
        this.count = 0;
    }

    @Override
    public boolean hasNext(){
        return this.count < this.list.getLenght();
    }

    @Override
    public Node next (){
        Node nodetmp = tmp;
        count++;
        tmp = tmp.getNextNode();
        return nodetmp;
    }
}
