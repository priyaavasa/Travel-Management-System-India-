package com.travel;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable {

    JProgressBar p;
    Thread t;
    String username;

    public void run() {
        try {
            for (int i = 1; i <= 101; i++) {
                int m = p.getMaximum();
                int n = p.getValue();

                if (n < m) {
                    p.setValue(p.getValue() + 1);
                } else {
                    i = 101;
                    setVisible(false);
                    new Dashboard(username).setVisible(true);
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {

        }
    }

    Loading(String user) {
        username = user;

        t = new Thread(this);

        setSize(1500, 985);
        //setBounds(500, 200, 700, 400);
        setTitle("Loading...");
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0, 0, 1500, 985);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/P2-Gallery.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 785, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(0, 0, 1300, 785);
        p1.add(l11);

        JLabel l1 = new JLabel("Travel & Tourism Management System");
        l1.setForeground(Color.CYAN);
        l1.setFont(new Font("Tahoma", Font.BOLD, 35));
        l1.setBounds(320, 120, 750, 40);
        l11.add(l1);

        p = new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(500, 200, 300, 30);
        l11.add(p);

        JLabel l2 = new JLabel("Please Wait...");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma", Font.BOLD, 16));
        l2.setBounds(600, 230, 150, 30);
        l11.add(l2);

        JLabel l3 = new JLabel("Welcome " + username);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        l3.setBounds(500, 280, 400, 40);
        l11.add(l3);

        t.start();

    }

    public static void main(String[] args) {
        new Loading("").setVisible(true);
    }
}
