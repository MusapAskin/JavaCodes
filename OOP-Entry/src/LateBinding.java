public class LateBinding {
    static class Animal{
        public void catchPrey(){
            System.out.println("Animal catch prey");
        }
    }

    static class Eagle extends Animal{
        public void  catchPrey(){
            System.out.println("Eagle catch prey");
        }
    }

    static class Crocodile extends Animal{
        public void catchPrey(){
            System.out.println("Crocodile catch prey");
        }
    }

}

class PolymorphismExample {

    public static LateBinding.Animal randomSelect(){
        int sel = ((int)(Math.random() * 3) );
        LateBinding.Animal a = null;
        if (sel==0) a = new LateBinding.Animal();
        if (sel==1) a = new LateBinding.Eagle();
        if (sel==2) a = new LateBinding.Crocodile();
        return a;
    }

    public static void main(String[] args) {
        LateBinding.Animal[] animals = new LateBinding.Animal[3];

        for (int i=0; i<3; i++){
            animals[i] = randomSelect();
        }
        for (int j=0; j<3; j++){
            animals[j].catchPrey();
        }

    }
}

