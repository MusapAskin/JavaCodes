package com.company;

import java.util.Scanner;

public class ArmstrongNumberFind {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayıyı giriniz : ");
        int number = scanner.nextInt();

        System.out.println("Sayının basamak sayısını giriniz : ");
        int numberOfDigits = scanner.nextInt();

        int tempNumb = number;
        int total = 0;

        do{
            int stepValue = tempNumb % 10;
            tempNumb /= 10;
            
            total += Math.pow(stepValue,numberOfDigits);
        }
        while(tempNumb > 0);
        if (number == total){
            System.out.println("Bu sayı bir armstrong sayısıdır.");
        }
        else{
            System.out.println("Bu sayı bir armstrong sayısı değildir.");
        }
    }
}
