import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************************");
        String procces = "1. Toplama\n"+ "2. Çıkarma\n"+ "3. Bölme\n"+"4. Çarpma";
        System.out.println(procces);
        System.out.println("*******************************");

        System.out.println("Lütfen bir işlem seçiniz...");
        String operation = scanner.nextLine();

        double x;
        double y;

        System.out.println("Birinci sayıyı giriniz: ");
        x = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        y = scanner.nextInt();

        switch (operation){
            case "1":
                System.out.println("Toplam : "+(x+y));
                break;
            case "2":
                System.out.println("Fark : "+(x-y));
                break;
            case "3":
                System.out.println("Bölüm : "+(x/y));
                break;
            case "4":
                System.out.println("Çarpım : "+(x*y));
                break;
        }






    }
}
