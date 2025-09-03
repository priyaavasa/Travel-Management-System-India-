package com.travel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Signup extends JFrame implements ActionListener {

    JButton b1, b2;
    JTextField t1, t2, t3, t4;
    JComboBox c1;

    public Signup() {
        setSize(1500, 985);
        setTitle("Signup");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0, 0, 1500, 985);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/bidar2-1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 655, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(0, 0, 1300, 655);
        p1.add(l11);

        JLabel head = new JLabel("Register Now");
        head.setFont(new Font("Algerian", Font.BOLD, 40));
        head.setBounds(520, 45, 350, 60);
        head.setForeground(Color.WHITE);
        l11.add(head);

        JLabel l1 = new JLabel("Username :");
        l1.setForeground(Color.DARK_GRAY);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setBounds(480, 130, 150, 25);
        l11.add(l1);

        t1 = new JTextField();
        t1.setBounds(680, 130, 200, 25);
        t1.setFont(new Font("Tahoma", Font.BOLD, 30));
        t1.setBorder(new LineBorder(new Color(133, 193, 233)));
        l11.add(t1);

        JLabel l2 = new JLabel("Name :");
        l2.setForeground(Color.DARK_GRAY);
        l2.setFont(new Font("Tahoma", Font.BOLD, 25));
        l2.setBounds(480, 170, 150, 25);
        l11.add(l2);

        t2 = new JTextField();
        t2.setBounds(680, 170, 200, 25);
        t2.setFont(new Font("Tahoma", Font.BOLD, 16));
        t2.setBorder(new LineBorder(new Color(133, 193, 233)));
        l11.add(t2);

        JLabel l3 = new JLabel("Password :");
        l3.setForeground(Color.DARK_GRAY);
        l3.setFont(new Font("Tahoma", Font.BOLD, 25));
        l3.setBounds(480, 210, 150, 25);
        l11.add(l3);

        t3 = new JTextField();
        t3.setBounds(680, 210, 200, 25);
        t3.setFont(new Font("Tahoma", Font.BOLD, 16));
        t3.setBorder(new LineBorder(new Color(133, 193, 233)));
        l11.add(t3);

        JLabel l4 = new JLabel("Security Question :");
        l4.setForeground(Color.DARK_GRAY);
        l4.setFont(new Font("Tahoma", Font.BOLD, 25));
        l4.setBounds(420, 250, 250, 25);
        l11.add(l4);

        c1 = new JComboBox(new String[]{"Your Favorite TMKOC character?", "Your Bestfriend Birthday?", "Your Favrite cousin from the family?", "Your Favorite lecturer in the college?","Favorite Meme character"});
        c1.setBounds(680, 250, 200, 25);
        c1.setForeground(Color.BLACK);
        c1.setFont(new Font("Tahoma", Font.BOLD, 10));
        c1.setBorder(new LineBorder(new Color(133, 193, 233)));
        l11.add(c1);

        JLabel l5 = new JLabel("Answer :");
        l5.setForeground(Color.DARK_GRAY);
        l5.setFont(new Font("Tahoma", Font.BOLD, 25));
        l5.setBounds(480, 290, 150, 25);
        l11.add(l5);

        t4 = new JTextField();
        t4.setBounds(680, 290, 200, 25);
        t4.setFont(new Font("Tahoma", Font.BOLD, 16));
        t4.setBorder(new LineBorder(new Color(133, 193, 233)));
        l11.add(t4);

        b1 = new JButton("Create");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b1.setBounds(550, 350, 100, 30);
        b1.setBorder(new LineBorder(new Color(133, 193, 233)));
        b1.addActionListener(this);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        l11.add(b1);

        b2 = new JButton("Back");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setBounds(700, 350, 100, 30);
        b2.setBorder(new LineBorder(new Color(133, 193, 233)));
        b2.addActionListener(this);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        l11.add(b2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String username = t1.getText();
            String name = t2.getText();
            String password = t3.getText();
            String security = (String) c1.getSelectedItem();
            String answer = t4.getText();

            if (username.equals("") || (name.equals("")) || (password.equals("")) || (answer.equals(""))) {
                JOptionPane.showMessageDialog(null, "Enter the Details correctly!");
            } else if (password.length() >= 6) {

                String query = "insert into account values('" + username + "','" + name + "','" + password + "','" + security + "','" + answer + "')";
                try {
                    Connect c = new Connect();
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Account created Successfully");
                    this.setVisible(false);
                    new Login().setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Password must contains atleast 6 characters!");
            }

        } else if (ae.getSource() == b2) {
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Signup().setVisible(true);
    }

}
