package org.gui;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource;

public class Main{
    public static void main(String [] args) {
    MyFrame frame = new MyFrame();

    JLabel label = new JLabel();
    label.setText("Some text...");
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.CENTER);
    label.setForeground(new ColorUIResource(0, 0, 0));
    frame.add(label);



    }
}
