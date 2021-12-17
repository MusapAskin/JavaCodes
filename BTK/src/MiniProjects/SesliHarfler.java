package MiniProjects;

import javax.swing.*;

public class SesliHarfler {
    public static void letters(char Char) {
        char Ch=Character.toUpperCase(Char);
        char[] boldVowels = {'A', 'I', 'O', 'U',};
        char[] thinVowels = {'E', 'İ', 'Ö', 'Ü' };

        for (char ch : boldVowels) {
            if (Ch == ch) {
                JOptionPane.showInternalMessageDialog(null,Char+" KALIN SESLİ HARFTİR.","CEVAP",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        for (char ch : thinVowels) {
            if (Ch == ch) {
                JOptionPane.showInternalMessageDialog(null,Char+" İNCE SESLİ HARFTİR.","CEVAP",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showInternalMessageDialog(null,Char+" SESLİ HARF DEĞİLDİR.","CEVAP",JOptionPane.INFORMATION_MESSAGE);

    }
}


