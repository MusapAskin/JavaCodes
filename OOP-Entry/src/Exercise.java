import java.util.Scanner;

public class Exercise {
    private int pushup;
    private int burpee;
    private int situp;
    private int squat;

    public Exercise(int pushup, int burpee, int situp, int squat) {
        this.pushup = pushup;
        this.burpee = burpee;
        this.situp = situp;
        this.squat = squat;
    }

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushup) {
        this.pushup = pushup;
    }

    public int getBurpee() {
        return burpee;
    }

    public void setBurpee(int burpee) {
        this.burpee = burpee;
    }

    public int getSitup() {
        return situp;
    }

    public void setSitup(int situp) {
        this.situp = situp;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }

    public void makeAmove(String movementType, int number){
        if (movementType.equals("burpee")){
            doBurpee(number);
        }
        else if (movementType.equals("pushup")){
            doPushup(number);
        }
        else if (movementType.equals("situp")){
            doSitup(number);
        }
        else if(movementType.equals("squat")){
            doSquat(number);
        }
        else{
            System.out.println("Geçersiz hareket...");
        }
    }

    public void doBurpee(int number){
        if(burpee==0){
            System.out.println("Yapacak burpee kalmadı...");
        }
        if(burpee-number<0){
            System.out.println("Hedeflediğin sayıyı geçtin.Tebrikler!");
            burpee=0;
            System.out.println("Kalan burpee : "+burpee);
        }
        else{
            burpee-=number;
            System.out.println("Kalan burpee : "+burpee);
        }

    }

    public void doSitup(int number){
        if(situp==0){
            System.out.println("Yapacak situp kalmadı...");
        }
        if(situp-number<0){
            System.out.println("Hedeflediğin sayıyı geçtin.Tebrikler!");
            situp=0;
            System.out.println("Kalan situp : "+situp);
        }
        else{
            situp-=number;
            System.out.println("Kalan situp : "+situp);
        }

    }

    public void doPushup(int number){
        if(pushup==0){
            System.out.println("Yapacak pushup kalmadı...");
        }
        if(pushup-number<0){
            System.out.println("Hedeflediğin sayıyı geçtin.Tebrikler!");
            pushup=0;
            System.out.println("Kalan pushup : "+pushup);
        }
        else{
            pushup-=number;
            System.out.println("Kalan pushup : "+pushup);
        }

    }

    public void doSquat(int number){
        if(squat==0){
            System.out.println("Yapacak squat kalmadı...");
        }
        if(squat-number<0){
            System.out.println("Hedeflediğin sayıyı geçtin.Tebrikler!");
            squat=0;
            System.out.println("Kalan squat : "+squat);
        }
        else{
            squat -=number;
            System.out.println("Kalan squat : "+squat);
        }

    }

    public boolean exerciseİsFinished(){
        return (burpee==0)&&(situp==0)&&(pushup==0)&&(squat==0);
    }
}
class Workout{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Idman Programına Hoşgeldiniz...");
        System.out.println("-----------------------");
        String exercises="- İdman türleri -\n"
                +"1)Burpee\n"
                +"2)Pushup\n"
                +"3)Situp\n"
                +"4)Squat";
        System.out.println(exercises);
        System.out.println("-----------------------");
        System.out.println("- Bir idman oluşturun - ");
        System.out.print("Burpee sayısı : ");
        int burpee=sc.nextInt();
        System.out.print("Pushup sayısı : ");
        int pushup=sc.nextInt();
        System.out.print("Situp sayısı : ");
        int situp=sc.nextInt();
        System.out.print("Squat sayısı : ");
        int squat=sc.nextInt();
        sc.nextLine();

        Exercise exercise = new Exercise(burpee,pushup,squat,situp);
        System.out.println("İdman başlıyor...");
        while(exercise.exerciseİsFinished()==false){
            System.out.print("Hareket Türü(burpee,pushup,situp,squat) : ");
            String kind = sc.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız? : ");
            int number=sc.nextInt();
            sc.nextLine();
            exercise.makeAmove(kind,number);
        }
        System.out.println("İdmanınızı başarı ile tamamladınız.Tebrikler...");
    }
}
