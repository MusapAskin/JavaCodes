package com.company;

import java.util.Scanner;

public class TwoD_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen çizmek istediğiniz yıldız pramidinin boyutunu giriniz : ");
        int matrix = sc.nextInt();
        for (int i=1; i<matrix; i+=2){
            for(int j=0; j<((matrix-2)/2)-i/2; j++){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
