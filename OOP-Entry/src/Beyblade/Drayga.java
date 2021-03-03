package Beyblade;

public class Drayga extends Beyblade {
    private String holyBeast;


    public Drayga(String beyblader, int rotationSpeed, int attackPower,String holyBeast) {
        super(beyblader, rotationSpeed, attackPower);
        this.holyBeast=holyBeast;
    }

    @Override
    public void takeOutTheHolyBeast() {

        System.out.println(getBeyblader()+ " " + holyBeast + " ı ortaya çıkarıyor.");
        System.out.println(getBeyblader()+" ın saldırısı : Kaplan pençesi.");
    }

    @Override
    public void showİnfo() {
        super.showİnfo();
        System.out.println("Kutsal canavar : "+holyBeast);
    }
}
