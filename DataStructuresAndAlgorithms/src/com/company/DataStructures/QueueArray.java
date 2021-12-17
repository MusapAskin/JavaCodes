package com.company.DataStructures;

public class QueueArray <T> {
    
    Object[] arrayQueue;
    int rear, front, maxSize, nItems;
    
    public QueueArray(int maxSize){
        this.maxSize = maxSize;
        arrayQueue = new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public void enqueue(Object object){
        if(isFull()){
            System.out.println("Queue is full...");
            return;
        }
        rear++;
        arrayQueue[rear] = object;
        nItems++;
    }

    public T dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty...");
            return null;
        }
        T objectOut = (T) arrayQueue[front];
        for (int i = 1; i < rear+1; i++){
            T tmp = (T) arrayQueue[i];
            arrayQueue[i-1] = tmp;
        }
        arrayQueue[rear] = null;
        nItems--;
        rear--;
        System.out.print("Firs in first out(FIFO) is work : ");
        return objectOut;
    }

    public void printer(){
        System.out.println("Listing the elements in the queue...");
        for (int i = 0; i < arrayQueue.length; i++){
            System.out.println("Element Order ["+(i+1)+"] " + arrayQueue[i]);
        }
    }

    private boolean isFull() {
        return (nItems == maxSize);
    }

    private boolean isEmpty() {
        return (nItems == 0);
    }
}

class Queue {
    public static void main(String[] args) {
        QueueArray<Integer> queue = new QueueArray<>(4);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.printer();
    }
}
