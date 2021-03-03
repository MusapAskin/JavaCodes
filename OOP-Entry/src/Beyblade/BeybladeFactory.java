package Beyblade;

public class BeybladeFactory {
    public Beyblade makebeyblade(String beybladeKind) {
        if(beybladeKind.equals("Dragon")){
            return new Dragon("Takao",800,300,"Mavi Ejderha","Kutsal Canavar ile Konuşma");
        }else if (beybladeKind.equals("Dranza")){
            return new Dranza("Kai",600,400,"Kırmızı Anka Kuşu");
        }else if(beybladeKind.equals("Drayga")){
            return new Dranza("Rei",800,250,"Beyaz Kaplan");
        }else if(beybladeKind.equals("Draciel")){
            return new Draciel("Max",400,1000,"Kara Kaplumbağa");
        }else{
            return null;
        }
    }
}
