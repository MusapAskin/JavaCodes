package com.company;

public class Stack <T> {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    Stack(int size){
        this.maxSize = size;
        stackArray = new Object[size];
        this.top = -1;
    }

    public void push(Object newItem){
        if(isFull()){
            System.out.println("The stack is full...");
            return;
        }
        top = top+1;
        stackArray[top] = newItem;
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public <T> T pop(){
        if(isEmpty()){
            System.out.println("The Stack is empty...");
            return null;
        }
        T item = (T) stackArray[top];
        top = top-1;
        return item;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

}

class stackImpl{
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        while (!stack.isEmpty()){
            int value = stack.pop();
            System.out.println(value);
        }
        stack.pop();
    }
}
