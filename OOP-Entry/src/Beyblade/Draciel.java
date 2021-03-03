package Beyblade;

public class Draciel extends Beyblade{
    private String holyBeast;


    public Draciel(String beyblader, int rotationSpeed, int attackPower,String holyBeast) {
        super(beyblader, rotationSpeed, attackPower);
        this.holyBeast=holyBeast;
    }

    @Override
    public void takeOutTheHolyBeast() {
        System.out.println(getBeyblader()+ " " + holyBeast + " ı ortaya çıkarıyor.");
        System.out.println(getBeyblader()+" ın savunması : Kale savunması.");
    }

    @Override
    public void showİnfo() {
        super.showİnfo();
        System.out.println("Kutsal canavar : "+holyBeast);
    }
}
