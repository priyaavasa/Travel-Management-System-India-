package com.travel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class BookedHotel extends JFrame implements ActionListener {

    JButton b1, b2;
    String user;

    BookedHotel(String username) {
        this.user = username;
        setBounds(330, 150, 1000, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/bookedDetails.jpg"));
        Image i3 = i1.getImage().getScaledInstance(540, 400, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(400, 30, 600, 380);
        add(la1);

        JLabel heading = new JLabel("BOOKED HOTEL DETAILS");
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        heading.setForeground(Color.BLUE);
        heading.setBounds(50, 0, 280, 40);
        add(heading);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(40, 50, 150, 30);
        l1.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l1);

        JLabel l11 = new JLabel();
        l11.setBounds(250, 50, 150, 30);
        l11.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l11);

        JLabel l2 = new JLabel("Hotel Name :");
        l2.setBounds(40, 90, 150, 30);
        l2.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l2);

        JLabel l21 = new JLabel();
        l21.setBounds(250, 90, 150, 30);
        l21.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l21);

        JLabel l3 = new JLabel("Total Persons :");
        l3.setBounds(40, 130, 150, 30);
        l3.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l3);

        JLabel l31 = new JLabel();
        l31.setBounds(250, 130, 150, 30);
        l31.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l31);

        JLabel l4 = new JLabel("Total Days :");
        l4.setBounds(40, 170, 150, 30);
        l4.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l4);

        JLabel l41 = new JLabel();
        l41.setBounds(250, 170, 150, 30);
        l41.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l41);

        JLabel l5 = new JLabel("AC included? :");
        l5.setBounds(40, 210, 150, 30);
        l5.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l5);

        JLabel l51 = new JLabel();
        l51.setBounds(250, 210, 150, 30);
        l51.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l51);

        JLabel l6 = new JLabel("Food ? :");
        l6.setBounds(40, 250, 150, 30);
        l6.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l6);

        JLabel l61 = new JLabel();
        l61.setBounds(250, 250, 150, 30);
        l61.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l61);

        JLabel l7 = new JLabel("ID :");
        l7.setBounds(40, 290, 150, 30);
        l7.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l7);

        JLabel l71 = new JLabel();
        l71.setBounds(250, 290, 150, 30);
        l71.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l71);

        JLabel l8 = new JLabel("ID Number :");
        l8.setBounds(40, 330, 150, 30);
        l8.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l8);

        JLabel l81 = new JLabel();
        l81.setBounds(250, 330, 150, 30);
        l81.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l81);

        JLabel l9 = new JLabel("Phone :");
        l9.setBounds(40, 370, 150, 30);
        l9.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l9);

        JLabel l91 = new JLabel();
        l91.setBounds(250, 370, 150, 30);
        l91.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l91);

        JLabel l10 = new JLabel("Total Cost :");
        l10.setBounds(40, 410, 150, 30);
        l10.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l10);

        JLabel l12 = new JLabel();
        l12.setBounds(250, 410, 150, 30);
        l12.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l12);

        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from bookhotel where username = '" + username + "'");
            while (rs.next()) {
                l11.setText(rs.getString(1));
                l21.setText(rs.getString(2));
                l31.setText(rs.getString(3));
                l41.setText(rs.getString(4));
                l51.setText(rs.getString(5));
                l61.setText(rs.getString(6));
                l71.setText(rs.getString(7));
                l81.setText(rs.getString(8));
                l91.setText(rs.getString(9));
                l12.setText(rs.getString(10));
            }
        } catch (Exception e) {

        }
        b1 = new JButton("Back");
        b1.setBounds(330, 460, 150, 35);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Delete ?");
        b2.setBounds(100, 460, 150, 35);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b2.setBackground(Color.BLUE);
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

                c.s.executeUpdate("delete from bookhotel where username='" + user + "'");

                JOptionPane.showMessageDialog(null, " Deleted Successfully");
                //System.exit(0);
                this.setVisible(false);

            } catch (Exception e) {
            }

        }

    }

    public static void main(String[] args) {
        new BookedHotel("").setVisible(true);
    }
}
