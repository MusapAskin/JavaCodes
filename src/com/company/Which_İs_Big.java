package com.company;

import java.util.Scanner;

public class Which_İs_Big {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 sayı giriniz...");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if(x>y && x>z){
            System.out.println("En büyük sayı: "+x);
        }
        else if(y>x && y>z){
            System.out.println("En büyük sayı: "+y);
        }
        else{
            System.out.println("En büyük sayı: "+z);
        }

    }
}
