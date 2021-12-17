package Threading;

public class Main {
    public static void main(String[] args) {
        KronometreThread firstThread=new KronometreThread("firstThread ");
        KronometreThread secondThread=new KronometreThread("secondThread");
        KronometreThread thirdThread=new KronometreThread("thirdThread ");
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}
