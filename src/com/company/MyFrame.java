package com.company;

        import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame() throws InterruptedException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920,1080);
        JLabel label = new JLabel();

        Icon[] icons = new Icon[3];

        for (int i = 0; i < 3; i++) {
            icons[i] = new ImageIcon("src\\img\\Chik"+ (i+1) +".png");
        }

        add(label);

        setVisible(true);
        int j = 0;
        while (true) {
            label.setIcon(icons[j]);
            j++;
            if (j == 3) j = 0;
            Thread.sleep(500);
        }
    }
}
