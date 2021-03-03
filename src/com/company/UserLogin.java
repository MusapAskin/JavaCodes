package com.company;

import java.util.Scanner;

public class
UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loginRight = 3;
        String systemUser = "Musap Aşkın";
        String systemPassword = "12345";

        System.out.println("******************************");
        System.out.println("Kullanıcı girişine hoşgeldiniz.");
        System.out.println("******************************");

        while (true){
            System.out.print("Kullanıcı adı : ");
            String user = scanner.nextLine();
            System.out.print("Parola : ");
            String password = scanner.nextLine();
            System.out.println("-------------------------------");
            if (password.equals(systemPassword) && user.equals(systemUser)){
                System.out.println("Hoşgeldiniz, "+user);
                break;
            }
            else if(!user.equals(systemUser) && password.equals(systemPassword)){
                System.out.println("Kullanıcı adınız yanlış...");
                loginRight -= 1;
                System.out.println("Kalan giriş hakkınız : "+loginRight);
                System.out.println("-------------------------------");
            }
            else if(user.equals(systemUser) && !password.equals(systemPassword)){
                System.out.println("Parolanız yanlış...");
                loginRight -= 1;
                System.out.println("Kalan giriş hakkınız : "+loginRight);
                System.out.println("-------------------------------");
            }
            else {
                System.out.println("Kullanıcı adınız ve parolanız yanlış...");
                loginRight -= 1;
                System.out.println("Kalan giriş hakkınız : "+loginRight);
                System.out.println("-------------------------------");
            }
            if (loginRight == 0){
                System.out.println("Giriş hakkınız kalmadı. Daha sonra tekrar deneyiniz.");
            }
        }

    }
}
