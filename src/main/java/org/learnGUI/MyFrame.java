package org.learnGUI;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

public class MyFrame extends JFrame{
    MyFrame() {
        this.setTitle("Notes App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 500);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("logo.jpeg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new ColorUIResource(123, 50, 255));
    }
}
