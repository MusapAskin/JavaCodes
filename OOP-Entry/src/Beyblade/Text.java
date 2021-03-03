package Beyblade;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------");
        System.out.println("Beyblade programına goşgeldiniz.Çıkış içn q ya basınız.");
        System.out.println("----------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Hangi beyblade i üretmek istiyorsunuz? : ");
            String option = scanner.nextLine();
            System.out.println("----------------------------------------------------------");
            if (option.equals("q")) {
                System.out.println("Programdan çıkılıyor.");
                break;
            } else {
                BeybladeFactory factory = new BeybladeFactory();
                Beyblade beyblade = factory.makebeyblade(option);
                if (beyblade == null) {
                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz...");
                } else {
                    beyblade.showİnfo();
                    beyblade.attack();
                    beyblade.takeOutTheHolyBeast();
                    System.out.println("----------------------------------------------------------");
                }
            }
        }
    }
}
