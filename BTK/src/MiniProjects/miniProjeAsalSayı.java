package MiniProjects;

public class miniProjeAsalSayı {
    public static void prime(int number) {

        boolean control = true;

        if (number == 2) System.out.println(number + " asal sayıdır.");
        if (number == 1) System.out.println(number + " asal sayı değildir.");
        for (int i = 2; i < number; i++) {
            if (number % i == 0) control = false;
        }
        if (control) System.out.println(number + " asal sayıdır.");
        else System.out.println(number + " asal sayı değildir.");

    }
}

