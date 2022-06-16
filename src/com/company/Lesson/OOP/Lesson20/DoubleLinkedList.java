package com.company.Lesson.OOP.Lesson20;

public class DoubleLinkedList {
    private NodeDouble head;
    private int length;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public NodeDouble getHead() {
        return head;
    }

    public void setHead(NodeDouble head) {
        this.head = head;
    }

    public NodeDouble getNodeByIndex(int index) {
        NodeDouble nodeTmp = this.head;
        int count = 0;
        while (nodeTmp != null) {
            if(count == index){
                return nodeTmp;
            }
            count++;
            nodeTmp = nodeTmp.getNextNode();
        }
        return new NodeDouble(null, null, null);
    }

    public DoubleLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public DoubleLinkedList(NodeDouble head) {
        this.head = head;
        this.length = 1;
    }

    public DoubleLinkedList(Object[] arrayInput) {
        this.head = new NodeDouble(arrayInput[0]);
        for (int i = 1; i < arrayInput.length; i++) {
            this.push(arrayInput[i]);
        }
        this.length = arrayInput.length;
    }

    public DoubleLinkedList(DoubleLinkedList doubleLinkedList) {
        this.head = new NodeDouble(doubleLinkedList.getHead().getValue());
        this.length = 1;
        NodeDouble nodeTmp = doubleLinkedList.getHead().getNextNode();
        while (nodeTmp != null) {
            this.push(nodeTmp.getValue());
            nodeTmp = nodeTmp.getNextNode();
        }
    }

    public NodeDouble getLast() {
        NodeDouble nodeDoubleTmp = this.head;
        while (nodeDoubleTmp.getNextNode() != null) {
            nodeDoubleTmp = nodeDoubleTmp.getNextNode();
        }
        return nodeDoubleTmp;
    }

    public void printList() {
        System.out.print("[");
        NodeDouble nodeDoubleTmp = this.head;
        while (nodeDoubleTmp.getNextNode() != null) {
            System.out.print(nodeDoubleTmp.getValue() + ", ");
            nodeDoubleTmp = nodeDoubleTmp.getNextNode();
        }
        System.out.print(nodeDoubleTmp.getValue() + "]");
        System.out.println();
    }

    public void push(Object value) {
        if (this.isVoid()) {
            this.pushHead(value);
        }
        else {
            NodeDouble nodeDoubleTmp = this.head;
            while (nodeDoubleTmp.getNextNode() != null) {
                nodeDoubleTmp = nodeDoubleTmp.getNextNode();
            }
            nodeDoubleTmp.setNextNode(new NodeDouble(value, null, nodeDoubleTmp));
        }
        this.length++;
    }

    public void push(Object value, int index) {
        if (index == 0) {
            this.pushHead(value);
        }
        else {
            NodeDouble nodeDoubleTmp = this.head;
            for (int i = 0; i < index - 1 && nodeDoubleTmp.getNextNode() != null; i++) {
                nodeDoubleTmp = nodeDoubleTmp.getNextNode();
            }
            NodeDouble newNodeDouble = new NodeDouble(value, nodeDoubleTmp.getNextNode(), nodeDoubleTmp);
            newNodeDouble.getNextNode().setPrevNode(newNodeDouble);
            nodeDoubleTmp.setNextNode(newNodeDouble);
        }
        this.length++;
    }

    private void pushHead(Object value) {
        if (this.isVoid()) {
            this.setHead(new NodeDouble(value));
        }
        else {
            NodeDouble nodeDouble = new NodeDouble(value, this.head, null);
            this.head.setPrevNode(nodeDouble);
            this.head = nodeDouble;
        }
    }

    public void pop() {
        NodeDouble nodeDoubleTmp = this.head;
        while (nodeDoubleTmp.getNextNode().getNextNode() != null) {
            nodeDoubleTmp = nodeDoubleTmp.getNextNode();
        }
        nodeDoubleTmp.getNextNode().setPrevNode(null);
        nodeDoubleTmp.setNextNode(null);
        this.length--;
    }

    public void pop(int index) {
        if (index == 0) {
            popHead();
        }
        else {
            if(index == this.length - 1) {
                pop();
            }
            else {
                NodeDouble nodeDoubleTmp = this.head;
                for (int i = 0; i < index - 1 && nodeDoubleTmp.getNextNode().getNextNode() != null; i++) {
                    nodeDoubleTmp = nodeDoubleTmp.getNextNode();
                }
                nodeDoubleTmp.getNextNode().getNextNode().setPrevNode(nodeDoubleTmp);
                nodeDoubleTmp.setNextNode(nodeDoubleTmp.getNextNode().getNextNode());
                this.length--;
            }
        }
    }

    public void popHead() {
        if(this.head.getNextNode() == null) {
            this.head.setPrevNode(null);
            this.head.setNextNode(null);
            this.head.setValue(null);
        }
        else {
            this.head = this.head.getNextNode();
            this.head.setPrevNode(null);
        }
        this.length--;
    }

    public void popAll() {
        while (this.head.getValue() != null) {
            this.popHead();
        }
    }

    public void popValue(Object value) {
        NodeDouble nodeTmp = this.head;
        int count = 0;
        while (nodeTmp != null) {
            if (nodeTmp.getValue() == value) {
                this.pop(count);
                count--;
                break;
            }
            count++;
            nodeTmp = nodeTmp.getNextNode();
        }
    }

    public void popAllValues(Object value) {
        NodeDouble nodeTmp = this.head;
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

    public void popClones(int index) {
        for (int i = 0; i < this.length; i ++) {
            if (i != index) {
                if (this.getNodeByIndex(i).getValue() == this.getNodeByIndex(index).getValue()) {
                    this.pop(i);
                    i--;
                }
            }
        }
    }

    public void popAllClones() {
        for (int i = 0; i < this.length; i++) {
            this.popClones(i);
        }
    }

    public void replace(Object valuePrev, Object valueNew) {
        NodeDouble nodeTmp = this.head;
        while (nodeTmp != null) {
            if(nodeTmp.getValue() == valuePrev) {
                nodeTmp.setValue(valueNew);
            }
            nodeTmp = nodeTmp.getNextNode();
        }
    }

    public boolean isSymmetric() {
        for (int i = 0; i < this.length / 2; i++) {
            if( getNodeByIndex(i).getValue() != getNodeByIndex(this.length - 1 - i).getValue()) {
                return false;
            }
        }
        return true;
    }

    public int uniqueValues() { //  Определение, сколько различных значений содержится в списке.
        DoubleLinkedList newList = new DoubleLinkedList(this);
        int countUnique = 0;
        while (newList.getHead().getValue() != null) {
            newList.popAllValues(newList.getHead().getValue());
            countUnique++;
        }
        return countUnique;
    }

    public boolean isVoid() {
        return (this.length == 0);
    }

    public NodeDouble nodeByValue(Object value) {
        NodeDouble nodeTmp = this.head;
        while (nodeTmp != null) {
            if (value == nodeTmp.getValue()) {
                return nodeTmp;
            }
            nodeTmp = nodeTmp.getNextNode();
        }
        return new NodeDouble(null, null, null);
    }

    /*public DoubleLinkedList reverse() {
        DoubleLinkedList listTmp = new DoubleLinkedList(new NodeDouble(this.getLast().getValue(), null, null));
        NodeDouble nodeTmp = this.getLast();
        while(nodeTmp.getPrevNode() != null) {
            listTmp.push(nodeTmp.getPrevNode().getValue());
            nodeTmp = nodeTmp.getPrevNode();
        }
        this. = listTmp;
    }*/

    public void inverseValues() {
        Object valueTmp;
        for (int i = 0; i < this.length / 2; i ++) {
            valueTmp = this.getNodeByIndex(i).getValue();
            this.getNodeByIndex(i).setValue(this.getNodeByIndex(this.length - i - 1).getValue());
            this.getNodeByIndex(this.length - i - 1).setValue(valueTmp);
        }
    }

    public void reverseList() {
        System.out.print("[");
        NodeDouble nodeTmp = this.getLast();
        while (nodeTmp.getPrevNode() != null) {
            System.out.print(nodeTmp.getValue() + ", ");
            nodeTmp = nodeTmp.getPrevNode();
        }
        System.out.print(nodeTmp.getValue() + "]");
    }
}

