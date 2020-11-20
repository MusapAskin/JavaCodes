package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ChangingVariables {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz : ");
        int fits_number = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz : ");
        int second_number = scanner.nextInt();

        System.out.println("Değerler değiştirilmeden önce...");
        System.out.println("Birimci sayı : " + fits_number + " İkinci sayı : "+second_number);

        int temp = fits_number;
        fits_number = second_number;
        second_number  = temp;

        System.out.println("Değerler değiştirildikten sonra...");
        System.out.println("Birimci sayı : " + fits_number + " İkinci sayı : "+second_number);

    }
}
