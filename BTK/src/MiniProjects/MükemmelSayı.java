package MiniProjects;

public class MükemmelSayı {
    public static void perfectNumber(int number){
        int total=0;
        for (int i=1;i<number;i++){
            if (number%i==0)
                total +=i;
        }
        if (total==number) System.out.println(number+" Mükemmel sayıdır.");
        else System.out.println(number+" Mükemmel sayı değildir.");
    }
}

