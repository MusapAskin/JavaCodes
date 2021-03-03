package com.company;
/*Kabarcık sıralamasını göstermek amacıyla tasarlanmış program örneği.*/
import java.util.Scanner;
import java.lang.Math;
public class BubbleShort {
    final static int max = 2000;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] list = new int[max];
        System.out.println("Liste boyunu giriniz.");
        int n = keyboard.nextInt();
        for (int i = 0; i < n; i++)
            list[i] = (int) Math.round(Math.random() * 5) + 1;
        list = bubble(list, n);
        System.out.println("Sıralı liste : ");
        for (int i = 0; i < n; i++) {
            System.out.println(list[i]);
        }
    }

    public static int[] bubble(int[] x, int size) {
        int temp;
        for (int k = 1; k < size; k++)
            for (int i = 0; i < size - k; i++)
                if (x[i] > x[i + 1]) {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                }
        return x;
    }
}
