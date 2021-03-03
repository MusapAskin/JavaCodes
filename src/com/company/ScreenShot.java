package com.company;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.io.File;
import javax.imageio.ImageIO;


public class ScreenShot {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton captureButton = new JButton("Take ScreenShot");
        captureButton.setFont(new  Font("Segoe UI",Font.BOLD,18));
        captureButton.setForeground(Color.WHITE);
        captureButton.setBackground(Color.black);
        captureButton.setFocusable(false);
        frame.add(captureButton,BorderLayout.PAGE_END);
        JLabel message = new JLabel();
        frame.setLocation(750,250);
        message.setHorizontalAlignment(JLabel.CENTER);
        frame.add(message, BorderLayout.CENTER);
        frame.setTitle("Mus'ap");
        frame.setSize(400,300);
        frame.setVisible(true);

        captureButton.addActionListener(e -> {
            try {
                String imagePath="C://Users//lenovo//Pictures//Saved Pictures//screenshot.jpg";
                Robot robot = new Robot();
                Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                BufferedImage image = robot.createScreenCapture(capture);
                ImageIO.write(image,"jpg",new File(imagePath));
                message.setText("Screenshot captured");
                message.setFont(new Font("Segoe UI",Font.ITALIC,18));
            } catch (Exception exp){
                message.setText(exp.getMessage());
            }

        });
    }
}
