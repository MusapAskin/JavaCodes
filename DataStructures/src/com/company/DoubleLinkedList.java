package com.company;

import java.util.Arrays;

public class DoubleLinkedList {

    Node headNode;

    public static class Node{
        Object value;
        Node next;
        Node previous;
        public Node(Object value, Node previous, Node next){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public DoubleLinkedList(){
        headNode = null;
    }

    public void add(Object val){
        Node newNode = new Node(val,null,null);
        if (headNode == null) {
             headNode = newNode;
        }else {
            newNode.next = headNode;
            headNode.previous = newNode;
            headNode = newNode;
        }
    }

    public void delete(){
        headNode = headNode.next;
        headNode.previous = null;
    }

    public void display(){
        Node n = headNode;
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
    }
}

class Double {
    public static void main(String[] args) {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        for (String s : Arrays.asList("Aşkın", "Musap", "Computer Scientist")) {
                linkedList.add(s);
        }
        linkedList.display();
        System.out.println("-----------");
        linkedList.delete();
        System.out.println("Deleting...");
        System.out.println("-----------");
        linkedList.display();
        System.out.println("-----------");
        linkedList.delete();
        System.out.println("Deleting...");
        System.out.println("-----------");
        linkedList.display();
    }
}


