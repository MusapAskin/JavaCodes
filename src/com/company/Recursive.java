package com.company;

public class Recursive {
     static int recursiveFactorial(int n) {
        if (n == 0){ return (1);}
        else return (n * recursiveFactorial(n - 1)); }
    public static void main(String[] args) {
         int r = new Recursive().recursiveFactorial(5);
        System.out.println(r);
    }
}