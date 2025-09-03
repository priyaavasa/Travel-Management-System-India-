package com.travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Dashboard extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14;
    String username, gender;

    Dashboard(String username) {

        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 2000, 50);
        p1.setBackground(new Color(129, 187, 235));
        add(p1);

        JLabel l3 = new JLabel("Dash Board");
        l3.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        l3.setBackground(Color.WHITE);
        l3.setForeground(Color.BLACK);

        l3.setBounds(45, 10, 300, 30);
        p1.add(l3);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 50, 1500, 900);
        add(p2);

        b1 = new JButton("Add Personal Details");
        b1.setBackground(new Color(133, 193, 233));
        b1.setOpaque(false);
        b1.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b1.setForeground(Color.BLACK);
        b1.setMargin(new Insets(0, 0, 0, 60));
        b1.setBounds(0, 0, 300, 40);
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("Update Personal Details");
        b2.setBackground(new Color(133, 193, 233));
        b2.setOpaque(false);
        b2.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b2.setForeground(Color.BLACK);
        b2.setMargin(new Insets(0, 0, 0, 30));
        b2.setBounds(0, 40, 300, 40);
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("View Details");
        b3.setBackground(new Color(133, 193, 233));
        b3.setOpaque(false);
        b3.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b3.setForeground(Color.BLACK);
        b3.setMargin(new Insets(0, 0, 0, 110));
        b3.setBounds(0, 80, 300, 40);
        b3.addActionListener(this);
        p2.add(b3);

        b4 = new JButton("Delete all Details");
        b4.setBackground(new Color(133, 193, 233));
        b4.setOpaque(false);
        b4.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b4.setForeground(Color.BLACK);
        b4.setMargin(new Insets(0, 0, 0, 80));
        b4.setBounds(0, 440, 300, 40);
        b4.addActionListener(this);
        p2.add(b4);

        b5 = new JButton("Check Package");
        b5.setBackground(new Color(133, 193, 233));
        b5.setOpaque(false);
        b5.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b5.setForeground(Color.BLACK);
        b5.setMargin(new Insets(0, 0, 0, 105));
        b5.setBounds(0, 120, 300, 40);
        b5.addActionListener(this);
        p2.add(b5);

        b6 = new JButton("Book package");
        b6.setBackground(new Color(133, 193, 233));
        b6.setOpaque(false);
        b6.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b6.setForeground(Color.BLACK);
        b6.setMargin(new Insets(0, 0, 0, 115));
        b6.setBounds(0, 160, 300, 40);
        b6.addActionListener(this);
        p2.add(b6);

        b7 = new JButton("View Package");
        b7.setBackground(new Color(133, 193, 233));
        b7.setOpaque(false);
        b7.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b7.setForeground(Color.BLACK);
        b7.setMargin(new Insets(0, 0, 0, 115));
        b7.setBounds(0, 200, 300, 40);
        b7.addActionListener(this);
        p2.add(b7);

        b8 = new JButton("Check Hotels");
        b8.setBackground(new Color(133, 193, 233));
        b8.setOpaque(false);
        b8.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b8.setForeground(Color.BLACK);
        b8.setMargin(new Insets(0, 0, 0, 120));
        b8.setBounds(0, 240, 300, 40);
        b8.addActionListener(this);
        p2.add(b8);

        b9 = new JButton("Book Hotel");
        b9.setBackground(new Color(133, 193, 233));
        b9.setOpaque(false);
        b9.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b9.setForeground(Color.BLACK);
        b9.setMargin(new Insets(0, 0, 0, 135));
        b9.setBounds(0, 280, 300, 40);
        b9.addActionListener(this);
        p2.add(b9);

        b10 = new JButton("View Booked Hotel");
        b10.setBackground(new Color(133, 193, 233));
        b10.setOpaque(false);
        b10.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b10.setForeground(Color.BLACK);
        b10.setMargin(new Insets(0, 0, 0, 62));
        b10.setBounds(0, 320, 300, 40);

        b10.addActionListener(this);
        p2.add(b10);

        b11 = new JButton("Destination");
        b11.setBackground(new Color(133, 193, 233));
        b11.setOpaque(false);
        b11.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b11.setForeground(Color.BLACK);
        b11.setMargin(new Insets(0, 0, 0, 130));
        b11.setBounds(0, 360, 300, 40);

        b11.addActionListener(this);
        p2.add(b11);

        b12 = new JButton("Payment Gateway");
        b12.setBackground(new Color(133, 193, 233));
        b12.setOpaque(false);
        b12.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b12.setForeground(Color.BLACK);
        b12.setMargin(new Insets(0, 0, 0, 65));
        b12.setBounds(0, 400, 300, 40);
        b12.addActionListener(this);
        p2.add(b12);

        b13 = new JButton("About Us");
        b13.setBackground(new Color(133, 193, 233));
        b13.setOpaque(false);
        b13.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b13.setForeground(Color.BLACK);
        b13.setMargin(new Insets(0, 0, 0, 150));
        b13.setBounds(0, 480, 300, 40);
        b13.addActionListener(this);
        p2.add(b13);

        b14 = new JButton("Logout");
        b14.setBackground(new Color(133, 193, 233));
        b14.setOpaque(false);
        b14.setFont(new Font("Tahoma ", Font.BOLD, 20));
        b14.setForeground(Color.BLACK);
        b14.setMargin(new Insets(0, 0, 0, 170));
        b14.setBounds(0, 520, 300, 40);
        b14.addActionListener(this);
        p2.add(b14);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/priya4.png"));
        Image i2 = i1.getImage().getScaledInstance(1340, 724, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1340, 724);
        p2.add(l1);

    }

    public void actionPerformed(ActionEvent ae) {
        Connect c = new Connect();

        if (ae.getSource() == b1) {
            if (true) {
                try {
                    String sql = "select * from customer1 where binary username='" + username + "'";
                    ResultSet row = c.s.executeQuery(sql);
                    if (row.next()) {
                        JOptionPane.showMessageDialog(null, "User Details are already exist..");
                    } else {
                        new AddCustomer(username).setVisible(true);
                    }
                } catch (Exception e) {
                }
            }
        } else if (ae.getSource() == b2) {
            new UpdateCustomer(username, gender).setVisible(true);
        } else if (ae.getSource() == b3) {
            new ViewCustomer(username).setVisible(true);
        } else if (ae.getSource() == b4) {
            new DeleteCustomer(username).setVisible(true);
        } else if (ae.getSource() == b5) {
            new CheckPackage().setVisible(true);
        } else if (ae.getSource() == b6) {
            if (true) {
                try {
                    String sql = "select * from bookpackage where binary username='" + username + "'";
                    ResultSet row = c.s.executeQuery(sql);
                    if (row.next()) {
                        JOptionPane.showMessageDialog(null, "User already booked one package..");
                    } else {
                        new BookPackage(username).setVisible(true);
                    }
                } catch (Exception e) {
                }
            }
        } else if (ae.getSource() == b7) {
            new ViewPackage(username).setVisible(true);
        } else if (ae.getSource() == b8) {
            new CheckHotels().setVisible(true);
        } else if (ae.getSource() == b9) {
            if (true) {
                try {
                    String sql = "select * from bookhotel where binary username='" + username + "'";
                    ResultSet row = c.s.executeQuery(sql);
                    if (row.next()) {
                        JOptionPane.showMessageDialog(null, "User already booked one hotel..");
                    } else {
                        new BookHotel(username).setVisible(true);
                    }
                } catch (Exception e) {
                }
            }
        } else if (ae.getSource() == b10) {
            new BookedHotel(username).setVisible(true);
        } else if (ae.getSource() == b11) {
            new Destination().setVisible(true);
        } else if (ae.getSource() == b12) {
            new Payment().setVisible(true);
        } else if (ae.getSource() == b13) {
            new About().setVisible(true);
        } else if (ae.getSource() == b14) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Dashboard("").setVisible(true);
    }
}
