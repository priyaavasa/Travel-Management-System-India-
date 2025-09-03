package com.travel;

import java.awt.*;
import javax.swing.*;

public class Welcome extends JFrame {

    public static void main(String[] args) {

        welcomeFrame f1 = new welcomeFrame();
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.pack();
        f1.setTitle("Tourism");
        f1.setBounds(0, 0, 1374, 812);
    }
}

class welcomeFrame extends JFrame implements Runnable {

    Thread t1;

    welcomeFrame() {

        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/priya7.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1274, 712, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel l1 = new JLabel(i2);
        add(l1);

        t1 = new Thread(this);
        t1.start();
    }

    public void run() {
        try {
            Thread.sleep(5000);
            this.setVisible(false);

            Login l = new Login();
            l.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
