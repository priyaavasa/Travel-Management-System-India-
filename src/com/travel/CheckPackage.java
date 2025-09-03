package com.travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckPackage extends JFrame implements ActionListener {

    JButton b2;

    CheckPackage() {

        setTitle("Check Package");
        setBounds(0, 0, 1980, 900);
        String[] package1 = new String[]{"    Mysore", "* 3 Days and 2 Nights","* Full City tour","* Brunch+Dinner local food of that region", "* Best in town hotel", "* 3 star lodge", "* English Speaking Guide", "* Mysore palce, Mysore mueseum, ", "  Mysore zoo,Lalit palace and etc", "Rs 12000 only", "priya13.jpg", "separator.png"};
        String[] package2 = new String[]{"     Bidar", "* 2 Days and 1 Night","* Full City tour","* Brunch+Dinner local food of that region", "* Best in town hotel", "* 3 star lodge", "* English Speaking Guide", "* Guru Nanak, Narsimah Jarna, Bidar ", "Khilla,Bidar Garden and etc", "Rs 5000 only", "bidar2-1_1.jpg", "separator.png"};
        String[] package3 = new String[]{"Kalaburagi", "* 2 Days and 1 Night","* Full City tour","* Brunch+Dinner local food of that region", "* Best in town hotel", "* 3 star lodge", "* English Speaking Guide", "* Appa Temple, Appa lake, Gulbarga", "University, buddhavihar, Jyotirlinga & etc", "Rs 4500 only", "sharan.jpg", "separator.png"};
        String[] package4 = new String[]{"Bangluru", "* 5 Days and 6 Nights", "* Full City tour","* Brunch+Dinner local food of that region", "* Best in town hotel", "* 3 star lodge", "* English Speaking Guide", "Vidhansoudha, Cubbon Park, ", "Winter Special", "Rs 18000 only", "p25-gallery.jpg", "separator.png"};
        String[] package5 = new String[]{"Chitradurga", "* 3 Days and 2 Nights", "* Full City tour","* Brunch+Dinner local food of that region", "* Best in town hotel", "* 3 star lodge", "* English Speaking Guide", "BBQ Dinner", "Winter Special", "Rs 8000 only", "package3.jpg", "separator.png"};
        String[] package6 = new String[]{"Vijayapura", "* 2 Days and 1 Night", "* Full City tour", "* Brunch+Dinner local food of that region", "* Best in town hotel", "* 3 star lodge", "* English Speaking Guide", "BBQ Dinner", "Winter Special", "Rs 6000 only", "v2-1.jpg", "separator.png"};
        String[] package7 = new String[]{"Shivamogga", "* 3 Days and 2 Nights", "* Full City tour", "* Brunch+Dinner local food of that region", "* Best in town hotel", "* 3 star lodge", "* English Speaking Guide", "BBQ Dinner", "Winter Special", "Rs 10000 only", "jogfall.jpg", "separator.png"};
        String[] package8 = new String[]{"     Udupi", "* 5 Days and 6 Nights", "* Full City tour", "* Brunch+Dinner local food of that region", "* Best in town hotel", "* 3 star lodge", "* English Speaking Guide", "BBQ Dinner", "Winter Special", "Rs 14000 only", "Venur-Bahubali.jpg", "separator.png"};
        String[] package9 = new String[]{"Uttarkannada", "* 4 Days and 2 Nights", "* Full City tour", "* Brunch+Dinner local food of that region", "* Best in town hotel", "* 3 star lodge", "* English Speaking Guide", "BBQ Dinner", "Winter Special", "Rs 12000 only", "aralaguppe Banner.jpg", "separator.png"};
        String[] package10 = new String[]{" Yadgiri", "* 2 Days and 1 Night", "* Full City tour", "* Brunch+Dinner local food of that region", "* Best in town hotel", "* 3 star lodge", "* English Speaking Guide", "BBQ Dinner", "Winter Special", "Rs 6500 only", "balichakra1.jpg", "separator.png"};

        JPanel p1 = createPackage(package1);
        JPanel p2 = createPackage(package2);
        JPanel p3 = createPackage(package3);
        JPanel p4 = createPackage(package4);
        JPanel p5 = createPackage(package5);
        JPanel p6 = createPackage(package6);
        JPanel p7 = createPackage(package7);
        JPanel p8 = createPackage(package8);
        JPanel p9 = createPackage(package9);
        JPanel p10 = createPackage(package10);

        JTabbedPane pane = new JTabbedPane();

        pane.addTab("Mysore", null, p1);
        pane.addTab("Bidar", null, p2);
        pane.addTab("Kalaburagi", null, p3);
        pane.addTab("Bangluru", null, p4);
        pane.addTab("Chitradurga", null, p5);
        pane.addTab("Vijayapura", null, p6);
        pane.addTab("Shivamogga", null, p7);
        pane.addTab("Udupi", null, p8);
        pane.addTab("UttarKannada", null, p9);
        pane.addTab("Yadgiri", null, p10);

        add(pane, BorderLayout.CENTER);

        b2 = new JButton("Back");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 24));
        b2.setBounds(200, 480, 100, 35);
        b2.addActionListener(this);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);

        p1.add(b2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {
            this.setVisible(false);
        }

    }

    public JPanel createPackage(String[] pack) {

        JPanel p1 = new JPanel();
        p1.setVisible(true);
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        JLabel l1 = new JLabel(pack[0]);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Algerian", Font.BOLD, 35));
        l1.setBounds(170, 10, 300, 30);
        p1.add(l1);

        JLabel l2 = new JLabel(pack[1]);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l2.setForeground(Color.BLUE);
        l2.setBounds(40, 60, 300, 40);
        p1.add(l2);

        JLabel l3 = new JLabel(pack[2]);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l3.setForeground(Color.RED);
        l3.setBounds(40, 110, 300, 40);
        p1.add(l3);

        JLabel l4 = new JLabel(pack[3]);
        l4.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l4.setForeground(Color.BLUE);
        l4.setBounds(30, 160, 500, 30);
        p1.add(l4);

        JLabel l5 = new JLabel(pack[4]);
        l5.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l5.setForeground(Color.RED);
        l5.setBounds(30, 210, 300, 30);
        p1.add(l5);

        JLabel l6 = new JLabel(pack[5]);
        l6.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l6.setForeground(Color.BLUE);
        l6.setBounds(30, 260, 300, 30);
        p1.add(l6);

        JLabel l7 = new JLabel(pack[6]);
        l7.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l7.setForeground(Color.RED);
        l7.setBounds(30, 310, 300, 30);
        p1.add(l7);

        JLabel l8 = new JLabel(pack[7]);
        l8.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l8.setForeground(Color.BLUE);
        l8.setBounds(30, 350, 500, 30);
        p1.add(l8);

        JLabel l10 = new JLabel(pack[8]);
        l10.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l10.setForeground(Color.BLUE);
        l10.setBounds(30, 390, 500, 30);
        p1.add(l10);

        JLabel l11 = new JLabel(pack[9]);
        l11.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l11.setForeground(Color.RED);
        l11.setBounds(150, 430, 500, 30);
        p1.add(l11);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/" + pack[10]));
        Image i2 = i1.getImage().getScaledInstance(700, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(550, 110, 700, 450);
        p1.add(l12);

        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/" + pack[11]));
        Image j2 = j1.getImage().getScaledInstance(225, 37, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel l13 = new JLabel(j3);
        l13.setBounds(10, 10, 525, 37);
        p1.add(l13);

        return p1;
    }

    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }

}
