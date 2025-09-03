package com.travel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class BookHotel extends JFrame implements ActionListener {

    JComboBox c1, c2, c3;
    JTextField t1, t2;
    JLabel l21, l22, l23, l24, l25;
    JButton b1, b2, b3;

    BookHotel(String username) {
        setBounds(200, 150, 1150, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l1 = new JLabel("BOOK HOTEL");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 26));
        l1.setForeground(Color.BLUE);
        l1.setBounds(100, 0, 300, 30);
        add(l1);

        JLabel l2 = new JLabel("Username :");
        l2.setBounds(30, 50, 150, 30);
        l2.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l2);

        l21 = new JLabel();
        l21.setBounds(200, 50, 280, 30);
        l21.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l21);

        JLabel l3 = new JLabel("Select Hotel :");
        l3.setBounds(30, 90, 150, 30);
        l3.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l3);

        c1 = new JComboBox();
        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from hotel");
            while (rs.next()) {
                String name = rs.getString("hotel");
                c1.addItem(name);
            }

        } catch (Exception e) {
        }

        c1.setBounds(200, 90, 280, 30);
        c1.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(c1);

        JLabel l4 = new JLabel("Total Persons:");
        l4.setBounds(30, 130, 150, 30);
        l4.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l4);

        t1 = new JTextField();
        t1.setBounds(200, 130, 280, 30);
        t1.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(t1);

        JLabel l5 = new JLabel("No. of Days:");
        l5.setBounds(30, 170, 150, 30);
        l5.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l5);

        t2 = new JTextField();
        t2.setBounds(200, 170, 280, 30);
        t2.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(t2);

        JLabel l6 = new JLabel("AC / Non-AC ?");
        l6.setBounds(30, 210, 150, 30);
        l6.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l6);

        c2 = new JComboBox(new String[]{"AC", "Non-AC"});
        c2.setFont(new Font("Tahoma", Font.BOLD, 16));
        c2.setBounds(200, 210, 280, 30);
        add(c2);

        JLabel l7 = new JLabel("Food Included ?");
        l7.setBounds(30, 250, 150, 30);
        l7.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l7);

        c3 = new JComboBox(new String[]{"Yes", "No"});
        c3.setFont(new Font("Tahoma", Font.BOLD, 16));
        c3.setBounds(200, 250, 280, 30);
        add(c3);

        JLabel l8 = new JLabel("ID :");
        l8.setBounds(30, 290, 150, 30);
        l8.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l8);

        l22 = new JLabel();
        l22.setBounds(200, 290, 280, 30);
        l22.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l22);

        JLabel l9 = new JLabel("ID Number :");
        l9.setBounds(30, 330, 150, 30);
        l9.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l9);

        l23 = new JLabel();
        l23.setBounds(200, 330, 280, 30);
        l23.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l23);

        JLabel l10 = new JLabel("Phone :");
        l10.setBounds(30, 370, 150, 30);
        l10.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l10);

        l24 = new JLabel();
        l24.setBounds(200, 370, 280, 30);
        l24.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l24);

        JLabel l11 = new JLabel("Total Price :");
        l11.setBounds(30, 410, 150, 30);
        l11.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l11);

        l25 = new JLabel();
        l25.setBounds(200, 410, 280, 30);
        l25.setForeground(Color.RED);
        l25.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l25);

        try {

            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from customer1 where username ='" + username + "'");
            while (rs.next()) {
                l21.setText(rs.getString("username"));
                l22.setText(rs.getString("id"));
                l23.setText(rs.getString("number"));
                l24.setText(rs.getString("phone"));

            }

        } catch (Exception e) {
        }

        b1 = new JButton("Check Price");
        b1.setBounds(30, 500, 150, 35);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Book");
        b2.setBounds(200, 500, 150, 35);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Back");
        b3.setBounds(370, 500, 150, 35);
        b3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/book.jpg"));
        Image i3 = i1.getImage().getScaledInstance(630, 450, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l12 = new JLabel(i2);
        l12.setBounds(500, 10, 630, 450);
        add(l12);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Connect c = new Connect();
                ResultSet rs = c.s.executeQuery("select * from hotel where hotel = '" + c1.getSelectedItem() + "'");

                while (rs.next()) {

                    int cost = Integer.parseInt(rs.getString("cost_per_day"));
                    int food = Integer.parseInt(rs.getString("food_charges"));
                    int ac = Integer.parseInt(rs.getString("ac_charges"));

                    int persons = Integer.parseInt(t1.getText());
                    int days = Integer.parseInt(t2.getText());

                    String acprice = (String) c2.getSelectedItem();
                    String foodprice = (String) c3.getSelectedItem();

                    if (persons * days > 0) {
                        int total = 0;
                        total += acprice.equals("AC") ? ac : 0;
                        total += foodprice.equals("Yes") ? food : 0;
                        total += cost;
                        total = total * persons * days;
                        l25.setText("Rs " + total);

                    } else {
                        l25.setText("Enter a valid number");
                    }

                }

            } catch (Exception e) {
            }

        } else if (ae.getSource() == b2) {
            try {
                Connect c = new Connect();

                String username = l21.getText();
                String hotel = (String) c1.getSelectedItem();
                String persons = t1.getText();
                String days = t2.getText();
                String ac = (String) c2.getSelectedItem();
                String food = (String) c3.getSelectedItem();
                String id = l22.getText();
                String id_number = l23.getText();
                String phone = l24.getText();
                String price = l25.getText();

                String q = "insert into bookhotel values('" + username + "','" + hotel + "','" + persons + "','" + days + "','" + ac + "','" + food + "','" + id + "','" + id_number + "','" + phone + "','" + price + "')";
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Hotel Booked Succesfully");

                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306";
                c = (Connect) DriverManager.getConnection(url, "username", "");

                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b3) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BookHotel("").setVisible(true);
    }

}
