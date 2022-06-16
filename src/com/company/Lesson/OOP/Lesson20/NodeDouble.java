package com.company.Lesson.OOP.Lesson20;

public class NodeDouble {
    private Object value;
    private NodeDouble nextNodeDouble;

    public NodeDouble getPrevNode() {
        return prevNodeDouble;
    }

    public void setPrevNode(NodeDouble prevNodeDouble) {
        this.prevNodeDouble = prevNodeDouble;
    }

    private NodeDouble prevNodeDouble;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public NodeDouble getNextNode() {
        return nextNodeDouble;
    }

    public void setNextNode(NodeDouble nextNodeDouble) {
        this.nextNodeDouble = nextNodeDouble;
    }

    public NodeDouble() {
        this.value = null;
        this.nextNodeDouble = null;
        this.nextNodeDouble = null;
    }

    public NodeDouble(Object value) {
        this.value = value;
        this.nextNodeDouble = null;
        this.nextNodeDouble = null;
    }

    public NodeDouble(Object value, NodeDouble nextNodeDouble, NodeDouble prevNodeDouble) {
        this.value = value;
        this.nextNodeDouble = nextNodeDouble;
        this.prevNodeDouble = prevNodeDouble;
    }

    public boolean nodeEqualValue(NodeDouble nodeDouble) {
        return (this.getValue() == nodeDouble.getValue());
    }

}
