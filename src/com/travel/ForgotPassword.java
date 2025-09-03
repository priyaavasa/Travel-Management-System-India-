package com.travel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;

public class ForgotPassword extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5;
    JButton b1, b2, b3;

    ForgotPassword(String username) {

        String user = username;

        setSize(1900, 1100);
        //setBounds(350, 200, 700, 450);
        setTitle("Forgot Password");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(0, 0, 1900, 1100);
        p.setBackground(Color.WHITE);
        add(p);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/priya3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(0, 0, 1600, 900);
        p.add(l11);

        JLabel head = new JLabel("Forgot Your Password?");
        head.setFont(new Font("Algerian", Font.BOLD, 30));
        head.setBounds(500, 45, 400, 60);
        head.setForeground(Color.WHITE);
        l11.add(head);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(450, 130, 230, 30);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l11.add(l1);

        t1 = new JTextField();
        t1.setBounds(600, 130, 200, 30);
        t1.setFont(new Font("Tahoma", Font.BOLD, 16));
        t1.setBorder(new LineBorder(new Color(133, 193, 233)));
        l11.add(t1);

        b1 = new JButton("Search");
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Tahoma", Font.BOLD, 16));
        b1.addActionListener(this);
        b1.setBounds(850, 130, 130, 30);
        l11.add(b1);

        JLabel l2 = new JLabel("Name :");
        l2.setBounds(450, 180, 230, 30);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma", Font.BOLD, 25));
        l11.add(l2);

        t2 = new JTextField();
        t2.setBounds(600, 180, 200, 30);
        t2.setFont(new Font("Tahoma", Font.BOLD, 16));
        t2.setBorder(new LineBorder(new Color(133, 193, 233)));
        t2.setEditable(false);
        l11.add(t2);

        JLabel l3 = new JLabel("Security Question :");
        l3.setBounds(350, 230, 350, 30);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Tahoma", Font.BOLD, 25));
        l11.add(l3);

        t3 = new JTextField();
        t3.setBounds(600, 230, 200, 30);
        t3.setFont(new Font("Tahoma", Font.BOLD, 12));
        t3.setBorder(new LineBorder(new Color(133, 193, 233)));
        t3.setEditable(false);
        l11.add(t3);

        JLabel l4 = new JLabel("Answer :");
        l4.setBounds(450, 280, 230, 30);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Tahoma", Font.BOLD, 25));
        l11.add(l4);

        t4 = new JTextField();
        t4.setBounds(600, 280, 200, 30);
        t4.setFont(new Font("Tahoma", Font.BOLD, 16));
        t4.setBorder(new LineBorder(new Color(133, 193, 233)));
        l11.add(t4);

        b2 = new JButton("Retrieve");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Tahoma", Font.BOLD, 16));
        b2.addActionListener(this);
        b2.setBounds(850, 280, 130, 30);
        l11.add(b2);

        JLabel l5 = new JLabel("Password :");
        l5.setBounds(450, 330, 230, 30);
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Tahoma", Font.BOLD, 25));
        l11.add(l5);

        t5 = new JTextField();
        t5.setBounds(600, 330, 200, 30);
        t5.setFont(new Font("Tahoma", Font.BOLD, 16));
        t5.setBorder(new LineBorder(new Color(133, 193, 233)));
        l11.add(t5);

        b3 = new JButton("Back");
        b3.setBackground(Color.RED);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b3.addActionListener(this);
        b3.setBounds(550, 390, 130, 30);
        l11.add(b3);

    }

    public void actionPerformed(ActionEvent ae) {
        Connect c = new Connect();

        if (ae.getSource() == b1) {

            if (t1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the username ");
            } else {
                try {
                    String sql = "select * from account where binary username='" + t1.getText() + "'";
                    ResultSet row = c.s.executeQuery(sql);
                    if (row.next()) {
                        t2.setText(row.getString("name"));
                        t3.setText(row.getString("security"));
                    } else {
                        JOptionPane.showMessageDialog(null, "There is no such user");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (ae.getSource() == b2) {
            if (t4.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Incorrrect Security Answer");

            } else {
                try {
                    String sql = "select * from account where binary answer='" + t4.getText() + "' AND binary username='" + t1.getText() + "'";
                    ResultSet row = c.s.executeQuery(sql);
                    if (row.next()) {
                        t5.setText(row.getString("password"));
                    } else {
                        JOptionPane.showMessageDialog(null, "Enter the answer properly");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (ae.getSource() == b3) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new ForgotPassword("").setVisible(true);
    }

}
