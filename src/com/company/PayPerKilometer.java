package com.company;
import java.util.Scanner;

public class PayPerKilometer {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç kilometre yol aldınız? ");
        double distance = scanner.nextDouble();
        System.out.println("Aracınız kilometre başı kaç lira yakıyor?");
        double ppk = scanner.nextDouble();

        double total = distance*ppk;

        System.out.println("Toplam ödemeniz gereken tutar "+ total +" TL'dir.");

    }
}
