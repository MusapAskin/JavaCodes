package com.company;

import java.util.Scanner;

public class FindHipotenüs {
public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);

    System.out.print("Dik üçgene ait kısa kenarı giriniz : ");
    int short_edge = scanner.nextInt();

    System.out.print("Dik üçgene ait uzun kenarı giriniz : ");
    int long_edge = scanner.nextInt();

    double x = (Math.pow(short_edge,2)+Math.pow(long_edge,2));
    double hipotenüs = Math.sqrt(x);

    System.out.println("Üçgenin Hipotenüsü : "+hipotenüs);
}
}
