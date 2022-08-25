package org.learnGUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.*;

public class LayeredPane {
    public static void main(String [] main) {
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150,150,200,200);
        
        JLayeredPane pane = new JLayeredPane();
        pane.setBounds(0,0,500,500);
        pane.add(label1);
        pane.add(label2);
        pane.add(label3);

        JFrame frame = new JFrame("JLayeredPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(pane);
    }

}
