package com.company.DataStructures;

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

    public void addHead(Object value){
        Node newNode = new Node(value,null);
        if (headNode != null) {
            newNode.next = headNode;
        }
        headNode = newNode;
    }

    public void add(Object value){
        Node newNode =new Node(value,null);
        Node node=headNode;
        if (node!=null) {
            while (node.next != null)
                node = node.next;
            node.next=newNode;
        }
        else headNode=newNode;
    }

    public void deleteHead(){
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
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addHead(0);
        linkedList.display();

    }
}
