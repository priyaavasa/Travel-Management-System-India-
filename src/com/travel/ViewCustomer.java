package com.travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewCustomer extends JFrame implements ActionListener {

    JButton b1, b2;
    String user;

    ViewCustomer(String username) {
        this.user = username;
        setBounds(0, 0, 1980, 900);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l20 = new JLabel("VIEW CUSTOMER DETAILS ");
        l20.setBounds(580, 50, 550, 80);
        l20.setForeground(Color.BLUE);
        l20.setFont(new Font("Times New Roman", Font.BOLD, 36));
        add(l20);

        JLabel l1 = new JLabel("Username :");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setBounds(500, 130, 150, 30);
        add(l1);

        JLabel l11 = new JLabel();
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l11.setBounds(650, 130, 200, 30);
        add(l11);

        JLabel l2 = new JLabel("ID :");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma", Font.BOLD, 25));
        l2.setBounds(900, 130, 100, 30);
        add(l2);

        JLabel l12 = new JLabel();
        l12.setForeground(Color.BLACK);
        l12.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l12.setBounds(1050, 130, 180, 30);
        add(l12);

        JLabel l3 = new JLabel("ID Number :");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Tahoma", Font.BOLD, 25));
        l3.setBounds(500, 180, 100, 30);
        add(l3);

        JLabel l13 = new JLabel();
        l13.setForeground(Color.BLACK);
        l13.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l13.setBounds(650, 180, 300, 30);
        add(l13);

        JLabel l4 = new JLabel("Name :");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma", Font.BOLD, 25));
        l4.setBounds(900, 180, 100, 30);
        add(l4);

        JLabel l14 = new JLabel();
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l14.setBounds(1050, 180, 300, 30);
        add(l14);

        JLabel l5 = new JLabel("Gender :");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Tahoma", Font.BOLD, 25));
        l5.setBounds(500, 230, 200, 30);
        add(l5);

        JLabel l15 = new JLabel();
        l15.setForeground(Color.BLACK);
        l15.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l15.setBounds(650, 230, 100, 30);
        add(l15);

        JLabel l6 = new JLabel("Country :");
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Tahoma", Font.BOLD, 25));
        l6.setBounds(900, 230, 150, 30);
        add(l6);

        JLabel l16 = new JLabel();
        l16.setForeground(Color.BLACK);
        l16.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l16.setBounds(1050, 230, 100, 30);
        add(l16);

        JLabel l7 = new JLabel("Address :");
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Tahoma", Font.BOLD, 25));
        l7.setBounds(500, 280,100, 30);
        add(l7);

        JLabel l17 = new JLabel();
        l17.setForeground(Color.BLACK);
        l17.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l17.setBounds(650, 280, 160, 30);
        add(l17);

        JLabel l8 = new JLabel("Phone :");
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Tahoma", Font.BOLD, 25));
        l8.setBounds(900, 280, 100, 30);
        add(l8);

        JLabel l18 = new JLabel();
        l18.setForeground(Color.BLACK);
        l18.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l18.setBounds(1050, 280, 150, 30);
        add(l18);

        JLabel l9 = new JLabel("Email :");
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Tahoma", Font.BOLD, 25));
        l9.setBounds(500, 330, 100, 30);
        add(l9);

        JLabel l19 = new JLabel();
        l19.setForeground(Color.BLACK);
        l19.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l19.setBounds(650, 330, 250, 30);
        add(l19);

        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b2.setForeground(Color.WHITE);
        b2.setBounds(800, 400, 150, 40);
        b2.addActionListener(this);
        add(b2);

        b1 = new JButton("Delete?");
        b1.setBounds(600, 400, 150, 40);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/priya12.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(50, 100, 400,400);
        add(l10);

        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from customer1 where username = '" + username + "'");
            if (rs.next()) {
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("id"));
                l13.setText(rs.getString("number"));
                l14.setText(rs.getString("name"));
                l15.setText(rs.getString("gender"));
                l16.setText(rs.getString("country"));
                l17.setText(rs.getString("address"));
                l18.setText(rs.getString("phone"));
                l19.setText(rs.getString("email"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {
            this.setVisible(false);
        } else {
            try {
                Connect c = new Connect();

                c.s.execute("delete from customer1 where username = '" + user + "'");

                JOptionPane.showMessageDialog(null, " Deleted Successfully");
                this.setVisible(false);

            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        new ViewCustomer("").setVisible(true);
    }
}
