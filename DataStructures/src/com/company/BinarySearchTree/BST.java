package com.company.BinarySearchTree;

public class BST {
    private BSTNode root;

    public BST(){root = null;}

    public BSTNode getRoot() { return root; }

    public void add(int value){
        BSTNode pp = null;
        BSTNode p = root;
        while(p!=null){
            pp=p;
            if (value==p.value) return;
            else if(value<p.value) p = p.left;
            else{ p = p.right;}
        }

        BSTNode x =new BSTNode();
        x.value = value;
        x.left=null;
        x.right=null;

        if (root==null) root=x;
        else if (value<pp.value) pp.left = x;
        else pp.right = x;
    }

    public BSTNode find2(int value){
        return find2(root,value);
    }

    public BSTNode find2(BSTNode root,int value){
      if (root == null) return null;
      if (value == root.value) return root;
      else if (value < root.value) return find2(root.left,value);
      else  { return find2(root.right,value);}
    }

    public BSTNode min(){
        if (root == null) return null;
        BSTNode p = root;
        while(p.left!=null){
            p=p.left;
        }
        return p;
    }

    public BSTNode max(){
        if (root == null) return null;
        BSTNode p = root;
        while (p.right!=null){
            p=p.right;
        }
        return p;
    }

}
