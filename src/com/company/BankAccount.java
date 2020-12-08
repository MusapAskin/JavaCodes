
package com.company;

import java.util.Scanner;

class Account{
    //Field Properties - Alan Özellikleri(objeye ait)
    Scanner scanner = new Scanner(System.in);
    private int customerNo;
    private String customer;
    private double accountAmount;

    //Constructor - Yapıcı Metod
    public Account(int no,String cos,double aa){
        customerNo=no;
        customer=cos;
        accountAmount=aa;
    }
    //Costumer İnformation - Müşteri bilgisi
    public void show(){
        System.out.println(customerNo+" "+customer+" "+accountAmount);
    }
    //Para Çekme
    public void takeMoney(){
        System.out.println("Çekmek istediğiniz tutarı giriniz.");
        double amount=scanner.nextDouble();
        if (amount>accountAmount){
            System.out.println("Yeterli Bakiye yok. Bakiyeniz : "+accountAmount);
        }
        else if(amount>1500){
            System.out.println("Bir günde 1500 tl'den fazla çekemezsiniz...");
        }
        else{
            accountAmount-=amount;
            System.out.println(amount+" TL hesabınızdan çekildi."+"\nYeni Bakiye : "+accountAmount+" TL");
        }
    }
    //Account Amount - Hesap bakiyesi sorgulama
    public void check(){
        System.out.println("Güncel Bakiye : "+accountAmount);
    }
    //Para Ekleme
    public void addMoney() {
        System.out.println("Yatırmak istediğiniz tutarını giriniz.");
        double amount= scanner.nextDouble();
        accountAmount+=amount;
        System.out.println(amount+" TL hesabınıza yatırıldı."+"\nYeni Bakiye : "+accountAmount+" TL");
    }
}
public class BankAccount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Account customer1=new Account(1,"Musap Aşkın ",10000);

        System.out.println(
                "***********************************"+
                "\n1.işlem: Hesabı göster "+"           |"+
                " \n2.İşlem: Para yatır."+"              |"+
                "\n3.işlem: Para çek"+"                 |"+
                "\n4.işlem: Hesap tutarını göster."+"   |" +
                "\n***********************************");
        System.out.println("İşlemi seçiniz.");
        System.out.println("***********************************");
        System.out.println("(Çkış için -1'e basınız.)");

        while(true) {
            int operation = scanner.nextInt();
            if (operation == -1){
                System.out.println("Hesaptan çıkılıyor");
                break;
            }
            switch (operation) {
                case 1:
                    customer1.show();
                    break;
                case 2:
                    customer1.addMoney();
                    break;
                case 3:
                    customer1.takeMoney();
                    break;
                case 4:
                    customer1.check();
                    break;
                default:
                    break;
            }
        }
    }
}

