package com.travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Destination extends JFrame implements Runnable {

    JLabel l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19;
    Thread th;
    JLabel caption;

    public void run() {
        try {

            l2.setVisible(true);
            caption.setText("India Gate");
            l2.add(caption);
            Thread.sleep(3500);
            l2.setVisible(false);

            l3.setVisible(true);
            caption.setText("Juhu Beach");
            l3.add(caption);
            Thread.sleep(3500);
            l3.setVisible(false);

            l4.setVisible(true);
            caption.setText("Marine Drive");
            l4.add(caption);
            Thread.sleep(3500);
            l4.setVisible(false);

            l5.setVisible(true);
            caption.setText("Jehangir Art Gallery");
            l5.add(caption);
            Thread.sleep(3500);
            l5.setVisible(false);

            l6.setVisible(true);
            caption.setText("Bandra worli sea Link");
            l6.add(caption);
            Thread.sleep(3500);
            l6.setVisible(false);

            l7.setVisible(true);
            caption.setText("Elephant Cave");
            l7.add(caption);
            Thread.sleep(2800);
            l7.setVisible(false);

            l8.setVisible(true);
            caption.setText("Sanjay Gandhi National park");
            l8.add(caption);
            Thread.sleep(3500);
            l8.setVisible(false);

            l9.setVisible(true);
            caption.setText("Chatrapathi Shivaji Terminus");
            l9.add(caption);
            Thread.sleep(3500);
            l9.setVisible(false);

            l10.setVisible(true);
            caption.setText("Global Vipasana pagoda");
            l10.add(caption);
            Thread.sleep(3500);
            l10.setVisible(false);

            l11.setVisible(true);
            caption.setText("Korigad Fort Trail");
            l11.add(caption);
            Thread.sleep(3500);
            l11.setVisible(false);

            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Destination() {

        setBounds(300, 100, 900, 700);
        getContentPane().setBackground(Color.BLUE);
        setTitle("Destination");
        th = new Thread(this);
        setLayout(null);

        caption = new JLabel();
        caption.setBounds(20, 0, 1000, 50);
        caption.setForeground(Color.BLUE);
        caption.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        add(caption);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/dest1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 700);
        add(l2);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("com/travel/dest2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i4);
        l3.setBounds(0, 0, 900, 700);
        add(l3);
        l3.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("com/travel/dest3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 900, 700);
        add(l4);
        l4.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("com/travel/dest4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(0, 0, 900, 700);
        add(l5);
        l5.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("com/travel/dest5.jpg"));
        Image i14 = i13.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(0, 0, 900, 700);
        add(l6);
        l6.setVisible(false);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("com/travel/dest6.jpg"));
        Image i17 = i16.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(0, 0, 900, 700);
        add(l7);
        l7.setVisible(false);

        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("com/travel/dest7.jpg"));
        Image i20 = i19.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        l8 = new JLabel(i21);
        l8.setBounds(0, 0, 900, 700);
        add(l8);
        l8.setVisible(false);

        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("com/travel/dest8.jpg"));
        Image i23 = i22.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        l9 = new JLabel(i24);
        l9.setBounds(0, 0, 900, 700);
        add(l9);
        l9.setVisible(false);

        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("com/travel/dest9.jpg"));
        Image i26 = i25.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
        l10 = new JLabel(i27);
        l10.setBounds(0, 0, 900, 700);
        add(l10);
        l10.setVisible(false);

        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("com/travel/dest10.jpg"));
        Image i29 = i28.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i30 = new ImageIcon(i29);
        l11 = new JLabel(i30);
        l11.setBounds(0, 0, 900, 700);
        add(l11);
        l11.setVisible(false);

        th.start();

    }

    public static void main(String args[]) {
        new Destination().setVisible(true);

    }

}
