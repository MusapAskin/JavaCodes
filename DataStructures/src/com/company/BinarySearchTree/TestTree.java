package com.company.BinarySearchTree;

public class TestTree {
    public static void main(String[] args) {
        BST tree = new BST();
        System.out.print("Numbers : ");
        for(int i=0; i<10; i++){
            int number = (int)(Math.random()*100);
            System.out.print(number+" ");
            tree.add(number);
        };
    }
}
