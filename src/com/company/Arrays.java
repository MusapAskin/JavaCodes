package com.company;

public class Arrays {
    public static void main(String[] args){
        int[] numbers = new int[500000];
        long startTime = System.nanoTime();

        for (int i=0;i<numbers.length;i++){ numbers[i]=i; }
        long secondTime = System.nanoTime();

        System.out.println(numbers[200000]);
        long thirdTime = System.nanoTime();

        System.out.println(numbers[0]);
        long fourthTime = System.nanoTime();

        for (int i=0;i<numbers.length;i++){ System.out.println(numbers[i]); }
        long fifthTime = System.nanoTime();

        System.out.println("First For Loop Time  : "+(secondTime-startTime));
        System.out.println("System For Loop Time : "+(fifthTime-fourthTime));
        System.out.println("Random Access  : "+(thirdTime-secondTime));
        System.out.println("Random Access 2: "+(fourthTime-thirdTime));


    }

}
