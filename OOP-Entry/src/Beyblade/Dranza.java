package Beyblade;

public class Dranza extends Beyblade{
    private String holyBeast;

    public Dranza(String beyblader, int rotationSpeed, int attackPower, String holyBeast) {
        super(beyblader, rotationSpeed, attackPower);
        this.holyBeast = holyBeast;
    }

    @Override
    public void showİnfo() {
        super.showİnfo();
        System.out.println("Kutsal canavar : "+holyBeast);
    }

    @Override
    public void takeOutTheHolyBeast() {
        System.out.println(getBeyblader()+ " " + holyBeast + " ı ortaya çıkarıyor.");
        System.out.println(getBeyblader()+" ın saldırısı : Alev kılıcı.");
    }
}
