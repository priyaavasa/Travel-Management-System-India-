package com.travel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class BookPackage extends JFrame implements ActionListener {

    JComboBox c1;
    JLabel l21, l31, l41, l51, l61;
    JTextField t1, t2;
    JButton b1, b2, b3;

    BookPackage(String username) {
        setBounds(0, 0, 1980, 1080);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/bookpackage.jpg"));
        Image i3 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(550, 100, 800, 380);
        add(la1);

        JLabel l1 = new JLabel("BOOK PACKAGE");
        l1.setBounds(150, 10, 400, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        add(l1);

        JLabel l2 = new JLabel("Username :");
        l2.setBounds(40, 70, 200, 30);
        l2.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l2);

        l21 = new JLabel();
        l21.setBounds(290, 70, 150, 30);
        l21.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l21);

        JLabel l3 = new JLabel("Select Package :");
        l3.setBounds(40, 120, 250, 30);
        l3.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l3);

        c1 = new JComboBox(new String[]{"Mysore", "Bidar", "Kalaburagi","Bangluru","Chitradurga","Vijayapura","Shivamogga","Udupi","Uttarkannada","Yadgiri"});
        c1.setBounds(290, 120, 220, 30);
        c1.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(c1);

        JLabel l4 = new JLabel("Total Persons :");
        l4.setBounds(40, 170, 250, 30);
        l4.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l4);

        t1 = new JTextField();
        t1.setBounds(290, 170, 220, 30);
        t1.setText("0");
        t1.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(t1);

        JLabel l5 = new JLabel("ID :");
        l5.setBounds(40, 220, 150, 30);
        l5.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l5);

        l31 = new JLabel();
        l31.setBounds(290, 220, 250, 30);
        l31.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l31);

        JLabel l6 = new JLabel("ID Number :");
        l6.setBounds(40, 270, 200, 30);
        l6.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l6);

        l41 = new JLabel();
        l41.setBounds(290, 270, 250, 30);
        l41.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l41);

        JLabel l7 = new JLabel("Phone :");
        l7.setBounds(40, 320, 150, 30);
        l7.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l7);

        l51 = new JLabel();
        l51.setBounds(290, 320, 150, 30);
        l51.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l51);

        JLabel l8 = new JLabel("Total Price :");
        l8.setBounds(40, 370, 200, 30);
        l8.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l8);

        l61 = new JLabel();
        l61.setBounds(290, 370, 150, 30);
        l61.setFont(new Font("Tahoma", Font.BOLD, 25));
        l61.setForeground(Color.RED);
        add(l61);

        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from customer1 where username = '" + username + "'");
            while (rs.next()) {
                l21.setText(rs.getString("username"));
                l31.setText(rs.getString("id"));
                l41.setText(rs.getString("number"));
                l51.setText(rs.getString("phone"));

            }

        } catch (SQLException e) {
        }

        b1 = new JButton("Check Price");
        b1.setBounds(40, 450, 150, 35);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Book Package");
        b2.setBounds(210, 450, 150, 35);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Back");
        b3.setBounds(390, 450, 150, 35);
        b3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String p = (String) c1.getSelectedItem();
            int cost = 0;

            if (p.equals("Mysore")) {
                cost += 12000;
            } else if (p.equals("Bidar")) {
                cost += 5000;
            } else if (p.equals("Kalaburagi")) {
                cost += 4500;
            }else if (p.equals("Bengluru")) {
                cost += 18000;
            }else if (p.equals("Chittradurga")) {
                cost += 8000;
            }else if (p.equals("Vijayapura")) {
                cost += 6000;
            }else if (p.equals("Shivamogga")) {
                cost += 10000;
            }else if (p.equals("Udupi")) {
                cost += 14000;
            }else if (p.equals("Uttarkannada")) {
                cost += 12000;
            }else if (p.equals("Yadgiri")) {
                cost += 6500;
            }

            cost *= Integer.parseInt(t1.getText());
            l61.setText("Rs " + cost);

        } else if (ae.getSource() == b2) {
            try {
                Connect c = new Connect();
                String price = l61.getText();
                String username = l21.getText();
                String p = (String) c1.getSelectedItem();
                String persons = t1.getText();
                String id = l31.getText();
                String id_no = l41.getText();
                String phone = l51.getText();

                c.s.executeUpdate("insert into bookpackage values ('" + username + "','" + p + "','" + persons + "','" + id + "','" + id_no + "','" + phone + "','" + price + "')");
                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b3) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BookPackage("").setVisible(true);
    }
}
