package com.company;

public class LambdaExpression {
    interface lambda{
        int run(int x);
    }


    public static void main(String[] args) {
        lambda l = x -> x * x;
        System.out.println(l.run(5));
    }
}
