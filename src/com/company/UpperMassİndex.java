package com.company;

import java.util.Scanner;

public class UpperMassİndex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu giriniz... : ");
        double size = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz... : ");
        double weight = scanner.nextDouble();


        double Body_mass_İndex =(double) (weight/(size*size)) ;

        if(Body_mass_İndex < 18.5){
            System.out.println("Zayıfsınız.");
        }
        else if (18.5 <= Body_mass_İndex && Body_mass_İndex <= 25) {
            System.out.println("Normal kilodasınız...");
        } else {
            if(25 <= Body_mass_İndex && Body_mass_İndex <=  30){
                System.out.println("Fazla kilolusunuz...");
            }
            else if( Body_mass_İndex > 30 ){
                System.out.println("Öbezsiniz...");
            }
        }
    }
}
