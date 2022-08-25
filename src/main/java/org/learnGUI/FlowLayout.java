package org.learnGUI;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.GridLayout;

public class FlowLayout {
    public static void main(String [] main) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3,3,0,0));

        for(int i=1; i<10; i++) {
            String s = String.valueOf(i);
            frame.add(new JButton(s));
        }

        frame.setVisible(true);
    }
    
}
