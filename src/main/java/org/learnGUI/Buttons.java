package org.learnGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Buttons extends JFrame{
    JButton button;
    Buttons() {
        ImageIcon image = new ImageIcon("logo.png");

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.setText("Click this...");
        button.addActionListener(e -> System.out.println("xdddd"));
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("Cosmic Sans", Font.BOLD, 25));
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(null);
        this.add(button);
    }
}
