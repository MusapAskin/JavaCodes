import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JTextField textField2;
    private JPanel Panel;
    private JTextField textField1;
    private JButton button1;

    public GUI() {
        add(Panel);
        setTitle("Member Log In");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username ,pswd;
                username = textField1.getText();
                pswd = textField2.getText();
                System.out.println("Username : "+username+"\nPassword : "+pswd);
                System.out.println("--------------------");

            }
        });
    }
}
