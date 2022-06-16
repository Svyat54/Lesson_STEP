package com.company.Lesson.OOP.Lesson21;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.LinkedList;

//Stack - последний зашел, первый ушел
class Stack {
    private int[] arr;
    private int size;
    private int lastIndex;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.lastIndex = -1;
    }

    public void push(int value) throws IndexOutOfBoundsException {
        this.lastIndex++;
        if (lastIndex >= arr.length){
            throw new IndexOutOfBoundsException();
        }
        this.arr[this.lastIndex] = value;
        }

        public int pop(){
        int tmpArr = this.arr[this.lastIndex];
        this.arr[this.lastIndex] = 0;
        this.lastIndex--;
        return tmpArr;
        }

        //возвращает последний элемент без удаления
        public boolean isEmpty(){
        return this.lastIndex == -1;
        }

        //возвращает True/False если стек пустой или нет
        public int peek() {
        return this.arr[this.lastIndex];
    }

        //проверяет наличие элемента в стеке
        public int search (int value) {
            for(int i = 0; i < this.arr.length; i++){
                if (this.arr[i] == value){
                    return i;
            }
        }
        return -1;
    }
    }

//SetofStacks
class SetOfStacks <E> {
    private E[] arr;
    private int size; //размер
    private int lastIndex; //Конечный индекс
    private int listInd; //кол-во стопок
    LinkedList <E[]> arr1 = new LinkedList<E[]>();

    public SetOfStacks(int size) {
        this.size = size;
        lastIndex=-1;
        listInd=0;
//    ur = (E[]) new Object[size];
//    ul.add(ur);
        arr1.add((E[]) new Object[size]); //Создаём список приводим в массив
    }


}


    //Как известно, слишком высокая стопка тарелок может развалиться. Следовательно, в реальной жизни, когда высота стопки превысила бы некоторое пороговое значение, мы начали бы складывать
    // тарелки в новую стопку. Реализуйте структуру данных SetofStacks, имитирующую реальную ситуацию. Структура SetofStacks должна состоять из нескольких стеков, новый стек создается, как только
    // предыдущий достигнет порогового значения.
    // Методы SetofStacks.push() и SetofStacks.pop() должны вести себя так же, как при работе с одним стеком (то есть метод pop() должен возвращать те же
    // значения, которые бы он возвращал при использовании одного большого стека). Реализуйте функцию popAt(int index), которая осуществляет операцию pop c заданным внутренним стеком.
public class Main {
    public static void main(String[] args){
//        Stack st = new Stack(5);
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
////        st.push(6);
//
//        System.out.println(st.pop() + " " + st.getLastIndex());
//        System.out.println(st.pop() + " " + st.getLastIndex());
//        System.out.println(st.pop() + " " + st.getLastIndex());
//        System.out.println(st.pop() + " " + st.getLastIndex());
//        System.out.println(st.peek());
//        System.out.println(st.isEmpty());
//        System.out.println(st.pop() + " " + st.getLastIndex());
//        System.out.println(st.isEmpty());
//
//        System.out.println(st.search(3));

        LinkedList<Stack> SOSarr = new LinkedList<>();
        SOSarr.push(new Stack(10));
        for (int i = 0; i < 10; i++){
            SOSarr.get(0).getArr()[i] = i + 1;
        }
        for (int i = 0; i < 10; i++){
            System.out.println(SOSarr.get(0).getArr()[i]);
        }



    }
}
