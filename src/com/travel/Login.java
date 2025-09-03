package com.travel;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;

public class Login extends JFrame implements ActionListener {

    JButton b1, b2, b3;
    JTextField t1;
    JPasswordField p3;

    public Login() {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Login");
        setSize(1280, 854);
        
        JPanel p2 = new JPanel();
        p2.setBackground(Color.WHITE);
        p2.setBounds(0, 0, 1280, 854);
        p2.setLayout(null);
        add(p2);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("com/travel/priya1.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1280, 754, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l11 = new JLabel(i6);
        l11.setBounds(0, 0, 1280, 754);
        p2.add(l11);

        JLabel head = new JLabel("Login Page");
        head.setFont(new Font("Algerian", Font.BOLD, 30));
        head.setBounds(570, 45, 200, 60);
        head.setForeground(Color.WHITE);
        l11.add(head);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(530, 120, 150, 25);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 24));
        l11.add(l2);

        t1 = new JTextField();
        t1.setBounds(530, 160, 260, 30);
        t1.setFont(new Font("Tahoma", Font.BOLD, 16));
        t1.setBorder(new LineBorder(new Color(133, 193, 233)));
        l11.add(t1);

        JLabel l3 = new JLabel("Password");
        l3.setBounds(530, 200, 150, 25);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l11.add(l3);

        p3 = new JPasswordField();
        p3.setBounds(530, 240, 260, 30);
        p3.setFont(new Font("Tahoma", Font.BOLD, 16));
        p3.setBorder(new LineBorder(new Color(133, 193, 233)));
        l11.add(p3);

        b1 = new JButton("Login");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        b1.setBounds(530, 300, 100, 35);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBorder(new LineBorder(new Color(133, 193, 233)));
        b1.addActionListener(this);
        l11.add(b1);

        b2 = new JButton("Sign up");
        b2.setBounds(680, 300, 100, 35);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBorder(new LineBorder(new Color(133, 193, 233)));
        b2.addActionListener(this);
        l11.add(b2);

        b3 = new JButton("Forgot Password?");
        b3.setBounds(550, 370, 200, 35);
        b3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b3.setBorder(new LineBorder(new Color(133, 193, 233)));
        b3.addActionListener(this);
        l11.add(b3);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String username = t1.getText();
        String password = p3.getText();

        if (ae.getSource() == b1) {
            if (username.equals("") || (password.equals(""))) {
                JOptionPane.showMessageDialog(null, "Enter the Details correctly!");
            } else {
                try {
                    String sql = "select * from account where binary username = '" + username + "' AND binary password ='" + password + "' ";
                    Connect c = new Connect();
                    ResultSet row = c.s.executeQuery(sql);

                    if (row.next()) {
                        this.setVisible(false);
                        new Loading(username).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or Password!");

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
            new Signup().setVisible(true);

        } else if (ae.getSource() == b3) {
            this.setVisible(false);
            new ForgotPassword(username).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

}
