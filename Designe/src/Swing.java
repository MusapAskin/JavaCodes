import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame jframe = new JFrame("First Tıtle");
                jframe.setSize(400,200);
                jframe.setLocation(750,350);
                jframe.setVisible(true);

                jframe.getContentPane().setLayout(new FlowLayout());
                JLabel label = new JLabel("Name");
                JTextField text1 = new JTextField(15);
                JButton button1 = new JButton("Send");
                JButton button2 = new JButton("Click");
                JButton button3 = new JButton("Entry");

                jframe.getContentPane().add(label);
                jframe.getContentPane().add(text1);
                jframe.getContentPane().add(button1);
                jframe.getContentPane().add(button2);
                jframe.getContentPane().add(button3);

                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label.setText("Hello "+text1.getText()+", welcome.");
                    }
                });

                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane panel = new JOptionPane();
                        panel.showInternalMessageDialog(null,"Welcome to panel.");
                    }
                });

                button3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String name = JOptionPane.showInputDialog("Pleace enter your name : ");
                        JOptionPane.showInternalMessageDialog(null,"Welcome to Tardis "+name);
                    }
                });




                jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

    }
}
