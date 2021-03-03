package MemoryGame;

import java.util.Scanner;

public class Main {
    private static Card[][] cards = new Card[4][4];
    public static void main(String[] args) {

        cards[0][0] = new Card('E');
        cards[0][1] = new Card('A');
        cards[0][2] = new Card('B');
        cards[0][3] = new Card('F');
        cards[1][0] = new Card('G');
        cards[1][1] = new Card('A');
        cards[1][2] = new Card('D');
        cards[1][3] = new Card('H');
        cards[2][0] = new Card('F');
        cards[2][1] = new Card('C');
        cards[2][2] = new Card('D');
        cards[2][3] = new Card('H');
        cards[3][0] = new Card('E');
        cards[3][1] = new Card('G');
        cards[3][2] = new Card('B');
        cards[3][3] = new Card('C');

        while (isGameOver()==false){
            gameBoard();
            Guess();
        }
    }

    public static void Guess(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci tahmin(matriksin 1.ve 2. index değerlerini boşluk bırakarak giriniz.): ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();

        cards[i1][j1].setGuess(true);
        gameBoard();

        System.out.println("Birinci tahmin(1.ve 2. değerleri boşluk bırakarak giriniz.): ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();

        if (cards[i1][j1].getValue()==cards[i2][j2].getValue()){
            System.out.println("Doğru tahmin.");
            cards[i2][j2].setGuess(true);
        }else{
            System.out.println("Yanlış tahmin.");
            cards[i1][j1].setGuess(false);
        }
    }

    public static boolean isGameOver(){
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (cards[i][j].isGuess()==false){
                    return false;
                }
            }
        }
        System.out.println("Tebrikler Oyunu Başarı İle Bitirdiniz.");
        return true;
    }

    public static void gameBoard(){
        for (int i=0; i<4; i++){
            System.out.println("___________________");
            for (int j=0; j<4; j++){
                if (cards[i][j].isGuess()){
                    System.out.print(" |"+cards[i][j].getValue()+"| ");
                }else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("___________________");


    }
}
