package com.company;

import java.util.Scanner;

public class Faktöriyel {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Faktöriyel değerini hesaplamak istediğiniz sayıyı giriniz.");
        double factorial = scanner.nextDouble();
        double result = 1;
        for (; 1 < factorial; factorial--){
           result *=factorial;
        }
        System.out.println(result);
    }
}
//Recursive(yinelemeli) yapı ile Stack(Yığın) bağlantılı faktöriyel

/*public void factorial(int n){

       if(n == 0)
           return 1;

        return n*factorial(n-1);
 */