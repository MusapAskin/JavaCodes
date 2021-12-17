package WorkWithFiles;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void creadFile(String fileName) {
        File file = new File("G:\\Code\\JavaCodes\\BTK\\src\\WorkWithFiles\\" + fileName);
        try {
            if (file.createNewFile())
                System.out.println("Dosya oluşturuldu.");
            else
                System.out.println("Dosya zaten mevcut.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(String fileName) {
        File file = new File("G:\\Code\\JavaCodes\\BTK\\src\\WorkWithFiles\\" + fileName);
        if (file.exists()) {
            System.out.println("Dosya adı:" + file.getName());
            System.out.println("Dosya yolu:" + file.getAbsolutePath());
            System.out.println("Dosya okunurluğu:" + file.canRead());
            System.out.println("Dosya yazılabilirliği:" + file.canWrite());
            System.out.println("Dosya boyutu(byte):" + file.length());
        }

    }

    public static void readFile(String  fileName) {
        File file = new File("G:\\Code\\JavaCodes\\BTK\\src\\WorkWithFiles\\" + fileName);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile(String fileName,String write){

        try {
           BufferedWriter writer = new BufferedWriter(new FileWriter("G:\\Code\\JavaCodes\\BTK\\src\\WorkWithFiles\\" + fileName,true));
           writer.newLine();
            writer.write(write);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        //creadFile("Student.txt");
        //getFileInfo("Student.txt");
        //writeFile("Student.txt","Ad:Mus'ap Aşkın, Boy:177cm, Kilo:90");
        //readFile("Student.txt");

    }
}
