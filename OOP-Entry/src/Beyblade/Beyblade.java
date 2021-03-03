package Beyblade;

public class Beyblade {
    private String beyblader;
    private int rotationSpeed;
    private int attackPower;

    public Beyblade(String beyblader, int rotationSpeed, int attackPower) {
        this.beyblader = beyblader;
        this.rotationSpeed = rotationSpeed;
        this.attackPower = attackPower;
    }

    public String getBeyblader() {
        return beyblader;
    }

    public void setBeyblader(String beyblader) {
        this.beyblader = beyblader;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public void attack(){
        System.out.println(beyblader + " " + attackPower + " ve " + rotationSpeed+ " ile saldırıyor.");
    }
    public void takeOutTheHolyBeast(){
        System.out.println("Bu beyblade'in kutsal canavarı yok.");
    }
    public void showİnfo(){
        System.out.println("Beybladeci : "+beyblader);
        System.out.println("Dönüş Hızı : "+rotationSpeed);
        System.out.println("Saldırı Gücü : "+attackPower);
    }
}
