package com.company;

import java.util.Scanner;

public class PrimeFinding {
    public PrimeFinding() {

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("----------------------------------------------------------------");
            System.out.print("Asal kontrolü yapmak istediğiniz sayıyı giriniz (1 ve 2 hariç): ");
            int number = in.nextInt();
            System.out.println("----------------------------------------------------------------");

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Girdiğiniz sayı asal değildir.");
                    System.out.println("(Programdan çıkmak için q ya yeni sayı girmek için Enter a basınız...)");
                    break;
                } else {
                    System.out.println("Girdiğiniz sayı asaldır.");
                    System.out.println("(Programdan çıkmak için q ya yeni sayı girmek için Enter a basınız...)");
                    break;
                }
            }
            Scanner quit = new Scanner(System.in);
            String q = quit.nextLine();
            if(q.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
        }
    }
}

class Prime{
    public static void main(String[] args) {
         new PrimeFinding();
    }
}


