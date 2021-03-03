package com.company;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int s1 = 1, s2 = 1, result = 0;
        for (int i = 0; i < n; i++) {
            result = s1 + s2;
            s1 = s2;
            s2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int r = new Fibonacci().fibonacci(5);
        System.out.println(r);
    }
}
