package com.company;

import java.util.Random;
import java.util.Scanner;

public class ReadMyMind {
    public static void main(String[] args) {
        System.out.println("1.Adım : Bir sayı tut");
        System.out.println("2.Adım : O sayıyı 2 ile çarp");
        Random r = new Random();
        double number = r.nextInt(50);
        System.out.println("3.Adım : Çıkan sonuca "+(int)number+" ekleyin.");
        System.out.println("4.Adım : Şimdide sonucu 2 ye böl");
        System.out.println("5.Adım : ilk tuttuğun sayıyıda sonuçtan çıkarın");
        System.out.println("***********************************************");
        System.out.print("İlemleri yaptıysanız 'evet' yazınız :");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if (text.equals("evet")){
            System.out.println("Cevap : "+number/2);
        }else {
            System.out.println("Lütfen işlemleri yapıp evet yazınız");
        }
    }
}
