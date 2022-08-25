package org.learnGUI;

import javax.swing.JFrame;

public class NewWindow {
    JFrame frame = new JFrame("New Window");

    NewWindow() {
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }
}
