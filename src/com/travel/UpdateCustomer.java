package com.travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateCustomer extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    //JComboBox c1;
    JRadioButton r1, r2;
    JButton b1, b2;
    String gender;

    UpdateCustomer(String username, String gender) {

        setBounds(0, 0, 1980, 900);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
                
        JLabel l11 = new JLabel("UPDATE CUSTOMER DETAILS ");
        l11.setForeground(Color.BLUE);
        l11.setBounds(530, 80, 550, 40);
        l11.setFont(new Font("Times New Roman", Font.BOLD, 36));

        add(l11);

        JLabel l1 = new JLabel("Username :");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        l1.setBounds(600, 150, 180, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(780, 150, 250, 30);
        t1.setEditable(false);
        t1.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(t1);

        JLabel l2 = new JLabel("ID :");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma", Font.BOLD, 25));
        l2.setBounds(600,190, 180, 30);
        add(l2);

        t8 = new JTextField();
        t8.setBounds(780, 190, 250, 30);
        t8.setFont(new Font("Tahoma", Font.BOLD, 20));
        t8.setEditable(false);
        add(t8);

        JLabel l3 = new JLabel("ID Number :");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Tahoma", Font.BOLD, 25));
        l3.setBounds(600, 230, 180, 30);
        add(l3);

        t2 = new JTextField();
        t2.setBounds(780, 230, 250, 20);
        t2.setFont(new Font("Tahoma", Font.BOLD, 20));
        t2.setEditable(false);
        add(t2);

        JLabel l4 = new JLabel("Name :");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma", Font.BOLD, 25));
        l4.setBounds(600, 270, 180, 30);
        add(l4);

        t3 = new JTextField();
        t3.setBounds(780, 270, 250, 30);
        t3.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(t3);

        JLabel l5 = new JLabel("Gender :");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Tahoma", Font.BOLD, 25));
        l5.setBounds(600, 310, 180, 30);
        add(l5);

        /* t9=new JTextField();
         t9.setBounds(230, 190, 200, 30);
         t9.setFont(new Font("Tahoma",Font.BOLD,16));
         add(t9);	*/
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(780, 310, 95, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(880, 310, 95, 30);
        add(r2);

        ButtonGroup b4 = new ButtonGroup();
        b4.add(r1);
        b4.add(r2);

        JLabel l6 = new JLabel("Country :");
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Tahoma", Font.BOLD, 25));
        l6.setBounds(600, 350, 180, 30);
        add(l6);

        t4 = new JTextField();
        t4.setBounds(780, 350, 250, 30);
        t4.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(t4);

        JLabel l7 = new JLabel("Address :");
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Tahoma", Font.BOLD, 25));
        l7.setBounds(600, 390, 180, 30);
        add(l7);

        t5 = new JTextField();
        t5.setBounds(780, 390, 250, 30);
        t5.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(t5);

        JLabel l8 = new JLabel("Phone :");
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Tahoma", Font.BOLD, 20));
        l8.setBounds(600, 430, 180, 30);
        add(l8);

        t6 = new JTextField();
        t6.setBounds(780, 430, 250, 20);
        t6.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(t6);

        JLabel l9 = new JLabel("Email :");
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Tahoma", Font.BOLD, 25));
        l9.setBounds(600, 470, 180, 30);
        add(l9);

        t7 = new JTextField();
        t7.setBounds(780, 470, 250, 30);
        t7.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(t7);

        b1 = new JButton("Update");
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b1.setForeground(Color.WHITE);
        b1.setBounds(680, 520, 100, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        b2.setForeground(Color.WHITE);
        b2.setBounds(810, 520, 100, 30);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/priya8.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(100, 150, 300, 300);
        add(l10);

        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from customer1 where username = '" + username + "'");
            while (rs.next()) {
                t1.setText(rs.getString("username"));
                t2.setText(rs.getString("number"));
                t3.setText(rs.getString("name"));
                t4.setText(rs.getString("country"));
                t5.setText(rs.getString("address"));
                t6.setText(rs.getString("phone"));
                t7.setText(rs.getString("email"));
                t8.setText(rs.getString("id"));
                // t9.setText(rs.getString("gender"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String username = t1.getText();
            String id = t8.getText();
            String number = t2.getText();
            String name = t3.getText();
            //String gender=null;
            if (r1.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();

            if (username.equals("") || (id.equals("")) || (number.equals("")) || (name.equals("")) || (gender.equals("")) || (country.equals("")) || (address.equals("")) || (phone.equals("")) || (email.equals(""))) {
                JOptionPane.showMessageDialog(null, "Enter all the Details correctly!");
            } else if (number.length() > 10 || phone.length() > 10) {
                JOptionPane.showMessageDialog(null, "enter only 16 digit ID number and 10 digit phone number ");
            } else {
                String q = "update customer set username ='" + username + "',id= '" + id + "',number='" + number + "',name='" + name + "',gender='" + gender + "',country='" + country + "',address='" + address + "',phone='" + phone + "',email='" + email + "' where username='" + username + "'";
                try {
                    Connect c = new Connect();
                    c.s.executeUpdate(q);

                    JOptionPane.showMessageDialog(null, "Customer Details updated Successfully");
                    this.setVisible(false);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateCustomer("", "").setVisible(true);
    }
}
