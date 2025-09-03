package com.travel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class DeleteCustomer extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4;
    String username;

    DeleteCustomer(String user) {

        this.username = user;
        setBounds(0, 0, 1980, 1080);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel head = new JLabel("Delete All The Details");
        head.setFont(new Font("Times New Roman", Font.BOLD, 40));
        head.setBounds(450, 10, 400, 40);
        head.setForeground(Color.BLUE);
        add(head);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(400, 70, 250, 30);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        add(l1);

        JLabel l11 = new JLabel();
        l11.setBounds(510, 70, 150, 30);
        l11.setFont(new Font("Times New Roman", Font.BOLD, 25));
        add(l11);

        JLabel l2 = new JLabel("Name :");
        l2.setBounds(400, 110, 250, 30);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        add(l2);

        JLabel l21 = new JLabel();
        l21.setBounds(510, 110, 150, 30);
        l21.setFont(new Font("Times New Roman", Font.BOLD, 25));
        add(l21);

        JLabel last = new JLabel("This will delete all the details");
        last.setBounds(350, 170, 700, 30);
        last.setForeground(Color.RED);
        last.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(last);

        JLabel last1 = new JLabel("regarding Customer details, Package and");
        last1.setBounds(250, 210, 700, 35);
        last1.setForeground(Color.RED);
        last1.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(last1);
        
        JLabel last2 = new JLabel(" booked hotel details.");
        last2.setBounds(400, 250, 700, 35);
        last2.setForeground(Color.RED);
        last2.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(last2);

        try {
            Connect c = new Connect();

            ResultSet rs = c.s.executeQuery("select * from customer1 where username = '" + username + "'");
            if (rs.next()) {
                l11.setText(rs.getString("username"));
                l21.setText(rs.getString("name"));
            }
        } catch (Exception e) {
        }

        b1 = new JButton("Delete ?");
        b1.setBounds(350, 300, 150, 30);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(600, 300, 150, 30);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/drop.png"));
        Image i3 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(800, 150, 300, 300);
        add(la1);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Connect c = new Connect();

                c.s.executeUpdate("delete from account where username='" + username + "'");  //account is an parent table. if we delete a row in parent table this 
                //will delete related data in child table also		
                JOptionPane.showMessageDialog(null, "All the Details Deleted Successfully");
                System.exit(0);

            } catch (Exception e) {
            }

        } else if (ae.getSource() == b2) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new DeleteCustomer("").setVisible(true);
    }
}
