import javax.swing.*;

public class FormDesigne {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUI g = new GUI();
            g.setVisible(true);
            g.setSize(400,200);
            g.setLocation(750,350);
            g.setVisible(true);
            g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
