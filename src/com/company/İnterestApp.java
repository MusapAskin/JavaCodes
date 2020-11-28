package com.company;

import java.util.Scanner;

public class İnterestApp {
    void rate(){
        Scanner scanner = new Scanner(System.in);
        int principal;
        int maturity;
        System.out.println("Bankamıza hoşgeldiniz. Faiz oranımız %6'dır.");
        System.out.println("Yatırmak isdeğiniz tutarı giriniz : ");
        principal = scanner.nextInt();
        System.out.println("Paranızı kaç yıl vadeli yatırmak istiyorsunuz ?");
        maturity = scanner.nextInt();
        int totalmoney = principal;
        double interestRate = 0.06;
        for (int i = 1; i <= maturity; i++){
            totalmoney += (totalmoney * interestRate);
            System.out.println(i+" .yılın sonunda toplam paranız : " + totalmoney);
        }
    }
    public static void main(String[] args) {
        İnterestApp bank = new İnterestApp();
        bank.rate();
    }
}
