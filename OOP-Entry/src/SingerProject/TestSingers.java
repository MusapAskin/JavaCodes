package SingerProject;

import java.util.Scanner;

public class TestSingers {
    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);

    public static void display() {
        System.out.println("Şarkıcı Listesi : \n"+
                "\t 0 - İşlemleri Görüntüle");
        System.out.println("\t 1 - Görüntüle.");
        System.out.println("\t 2 - Ekle");
        System.out.println("\t 3 - Güncelle");
        System.out.println("\t 4 - Sil");
        System.out.println("\t 5 - Ara");
        System.out.println("\t 6 - Uygulamadan çık");}

        public static void view(){singers.PrintSingers();}
        public static void add(){
            System.out.print("Eklemek istediğiniz şarkıcı : ");
            String name = scanner.nextLine();
            singers.AddSinger(name);}
        public static void update(){
            System.out.print("Güncellemek istediğiniz index(1,2,3) numarasını giriniz.");
            int index = scanner.nextInt();
            scanner.nextLine();
            String newName = scanner.nextLine();
            singers.UpdateSinger(newName,index-1);}
        public static void delete(){
            System.out.print("Silmek istediğiniz index(1,2,3) numarasını giriniz.");
            int index = scanner.nextInt();
            singers.DeleteSinger(index-1);}
        public static void search(){
            System.out.print("Aramak istediğiniz şarkıcı : ");
            String singerName = scanner.nextLine();
            singers.SearchSinger(singerName);}

        public static void main(String[]args){
            System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz.");
            display();
            boolean exit = false;
            int operation;

            while(!exit){
                System.out.print("Bir işlem seçiniz : ");
                operation = scanner.nextInt();
                scanner.nextLine();
                switch(operation){
                    case 0:
                        display();
                        break;
                    case 1:
                        view();
                        break;
                    case 2:
                        add();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        search();
                        break;
                    case 6:
                        exit=true;
                        System.out.println("Uygulamadan çıkılıyor.");

                }

            }
        }
    }

