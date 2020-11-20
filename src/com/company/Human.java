package com.company;

public class Human {
    static double size;
    static double weight;
    static int  age;
    static String eyecolor;
    static  String haircolor;
public Human(){
    System.out.println("Bir insan oluşturuldu!");

}
public Human(int age,double size,double weight){
    this();
    this.weight = weight;
    this.size = size;
    this.age =  age;
}
    void eat() {
        System.out.println("Yemek yedim.");
        weight++;
        System.out.println("Kilom arttı : "+ weight);
    }

    public void run() {
        System.out.println("Koştum.");
        System.out.println("Musap : Yoruldum. Su içmem lazım.");
    }

    public void drinks() {
        System.out.println("Su içtim.");
        System.out.println("Musap : Oh! Dünya varmış.");
    }

    public static void main(String[] args) {
        Human sebo = new Human(27,1.75,75);
        Human musap = new Human();
        musap.size = 1.75;
        musap.weight = 85;
        musap.age = 22;
        musap.eyecolor = "Kahverengi";
        musap.haircolor = "Koyu Kahverengi";
        System.out.println("Musap'ın boyu : " + size + ", kilosu : " + weight +", yaşı : "+ age + " göz rengi : " + eyecolor + ", saç rengi : " + haircolor);
        musap.eat();
        musap.run();

        musap.drinks();


    }
}