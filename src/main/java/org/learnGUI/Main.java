package org.learnGUI;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

public class Main{
    public static void main(String [] args) {
        ImageIcon image = new ImageIcon("logo.png");
        // Main window
        JFrame frame = new JFrame();
        frame.setTitle("Notes App");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setBackground(new ColorUIResource(128, 56, 255));

        // Label
        JLabel label = new JLabel();
        label.setText("Some text...");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(Color.WHITE);
        label.setIcon(image);
        label.setSize(100,100);
        label.setIconTextGap(-25);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 100, 100);

        // Panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.RED);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);

        //Add element to main window
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
