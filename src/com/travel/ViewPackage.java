package com.travel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class ViewPackage extends JFrame implements ActionListener {

    JButton b1, b2;
    String user;

    ViewPackage(String username) {
        this.user = username;
        setBounds(0, 0,1980, 1080);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/bookedDetails.jpg"));
        Image i3 = i1.getImage().getScaledInstance(540, 400, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(650, 100, 600, 380);
        add(la1);

        JLabel heading = new JLabel("VIEW PACKAGE DETAILS");
        heading.setFont(new Font("Times New Roman", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        heading.setBounds(50, 0, 480, 40);
        add(heading);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(40, 70, 200, 30);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l1);

        JLabel l11 = new JLabel();
        l11.setBounds(290, 70, 250, 30);
        l11.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l11);

        JLabel l2 = new JLabel("Package :");
        l2.setBounds(40, 120, 150, 30);
        l2.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l2);

        JLabel l21 = new JLabel();
        l21.setBounds(290, 120, 150, 30);
        l21.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l21);

        JLabel l3 = new JLabel("Total Persons :");
        l3.setBounds(40, 170, 200, 30);
        l3.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l3);

        JLabel l31 = new JLabel();
        l31.setBounds(290, 170, 150, 30);
        l31.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l31);

        JLabel l4 = new JLabel("ID :");
        l4.setBounds(40, 220, 150, 30);
        l4.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l4);

        JLabel l41 = new JLabel();
        l41.setBounds(290, 220, 250, 30);
        l41.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l41);

        JLabel l5 = new JLabel("ID Number :");
        l5.setBounds(40, 270, 250, 30);
        l5.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l5);

        JLabel l51 = new JLabel();
        l51.setBounds(290, 270, 250, 30);
        l51.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l51);

        JLabel l6 = new JLabel("Phone :");
        l6.setBounds(40, 320, 150, 30);
        l6.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l6);

        JLabel l61 = new JLabel();
        l61.setBounds(290, 320, 150, 30);
        l61.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l61);

        JLabel l7 = new JLabel("Price :");
        l7.setBounds(40, 370, 150, 30);
        l7.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l7);

        JLabel l71 = new JLabel();
        l71.setBounds(290, 370, 150, 30);
        l71.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l71);

        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from bookPackage where username = '" + username + "'");
            while (rs.next()) {
                l11.setText(rs.getString(1));
                l21.setText(rs.getString(2));
                l31.setText(rs.getString(3));
                l41.setText(rs.getString(4));
                l51.setText(rs.getString(5));
                l61.setText(rs.getString(6));
                l71.setText(rs.getString(7));
            }
        } catch (Exception e) {

        }
        b1 = new JButton("Back");
        b1.setBounds(250, 425, 150, 35);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Delete ?");
        b2.setBounds(50, 425, 150, 35);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
        } else {
            try {
                Connect c = new Connect();

                c.s.executeUpdate("delete from bookpackage where username='" + user + "'");

                JOptionPane.showMessageDialog(null, " Deleted Successfully");
                this.setVisible(false);

            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        new ViewPackage("").setVisible(true);
    }
}
