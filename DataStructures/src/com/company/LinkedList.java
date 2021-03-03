package com.company;

import java.util.Arrays;

public class LinkedList {

    public static class Node{

        Object value;
        Node next;

        public Node(Object value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    Node headNode;

    public LinkedList(){
        headNode = null;
    }

    public void add(Object val){
        Node newNode = new Node(val,null);
        if (headNode != null) {
            newNode.next = headNode;
        }
        headNode = newNode;
    }

    public void delete(){
        headNode = headNode.next;
    }

    public void display(){
        Node n = headNode;
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (String s : Arrays.asList("Aşkın", "Musap", "Computer scientist")) {
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
