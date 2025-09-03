package com.travel;

import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4;

    Payment() {
        setBounds(0, 0, 1980, 1060);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.WHITE);
        p2.setBounds(0, 0, 1980, 1060);
        p2.setLayout(null);
        add(p2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/pay.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(0, 0, 1300, 700);
        p2.add(l11);

        b2 = new JButton("Paytm");
        b2.setBounds(270, 480, 150, 40);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l11.add(b2);

        b3 = new JButton("PhonePe");
        b3.setBounds(920, 480, 150, 40);
        b3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l11.add(b3);

        b1 = new JButton("Google Pay");
        b1.setBounds(580, 250, 150, 40);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l11.add(b1);

        b4 = new JButton("Back");
        b4.setBounds(570, 580, 150, 40);
        b4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l11.add(b4);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Desktop.getDesktop().browse(new URL("https://pay.google.com").toURI());
                this.setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b2) {
            try {
                Desktop.getDesktop().browse(new URL("https://www.paytm.com").toURI());
                this.setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b3) {
            try {
                Desktop.getDesktop().browse(new URL("https://www.phonepe.com").toURI());
                this.setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == b4) {
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Payment().setVisible(true);
    }

}
