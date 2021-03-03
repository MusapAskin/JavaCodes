package Beyblade;

public class Dragon extends Beyblade{
    private String holyBeast;
    private String secretAttack;


    public Dragon(String beyblader, int rotationSpeed,int attackPower,String holyBeast,String secretAttack) {
        super(beyblader, rotationSpeed, attackPower);
        this.holyBeast=holyBeast;
        this.secretAttack=secretAttack;
    }

    @Override
    public void takeOutTheHolyBeast() {
        System.out.println(getBeyblader()+ " " + holyBeast + " ı ortaya çıkarıyor.");
        System.out.println(getBeyblader()+" ın saldırısı : Hayalet kasırgası.");
    }

    @Override
    public void showİnfo() {
        super.showİnfo();
        System.out.println("Kutsal canavar : "+holyBeast);
        System.out.println("Gizli yetenek : "+secretAttack);
    }
}
