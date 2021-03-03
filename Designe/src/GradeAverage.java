import javax.swing.*;

public class GradeAverage {
    public static void main(String[] args) {
        int vize1,final1;


        String Vize1 = JOptionPane.showInputDialog( null,"Lütfen Vize Notunuzu Giriniz","VIZE NOTU",JOptionPane.QUESTION_MESSAGE);
        vize1 = Integer.parseInt(Vize1);
        while(vize1<0 || vize1>100){
            Vize1 = JOptionPane.showInputDialog(null,"Lütfen 1.vize notunuzu giriniz : "
                    ,"Hatalı Giriş",JOptionPane.WARNING_MESSAGE);
        }
        String Final1 = JOptionPane.showInputDialog(null,"Lütfen Final Notunuzu Giriniz","FİNAL NOTU",JOptionPane.QUESTION_MESSAGE);
        final1 = Integer.parseInt(Final1);
        while(final1<0 || final1>100){
            Final1 = JOptionPane.showInputDialog(null,"Lütfen final notunuzu giriniz : "
                    ,"Hatalı Giriş",JOptionPane.WARNING_MESSAGE);
        }

        double avarage = vize1*0.4+final1*0.6;

        ImageIcon confetti = new ImageIcon("G:\\Code\\JavaCodes\\Designe\\src\\İmage\\confetti.jpg");
        ImageIcon sad = new ImageIcon("G:\\Code\\JavaCodes\\Designe\\src\\İmage\\sadStudent.jpg");


        if (avarage>50)
            JOptionPane.showInternalMessageDialog(null,"Tebrikler, dersten geçtiniz.","Result",JOptionPane.INFORMATION_MESSAGE,confetti);
        else JOptionPane.showInternalMessageDialog(null,"Üzgünüm...\nDersten kaldın. Daha çok çalış!","Result",JOptionPane.INFORMATION_MESSAGE,sad);

    }
}
