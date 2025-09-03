package com.travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;

public class AddCustomer extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6, t7;
    JComboBox c1;
    JRadioButton r1, r2;
    JButton b1, b2;

    CallableStatement data;
    Connection c;
    private Object JClass;

    AddCustomer(String username) {

        setBounds(0, 0, 2000, 1000);
        setTitle("Customer ");
        getContentPane().setBackground(Color.WHITE);

        JLabel l11 = new JLabel("Add Personal Details");
        l11.setBounds(580, 90, 350, 40);
        l11.setForeground(Color.BLUE);
        l11.setFont(new Font("Times New Roman", Font.BOLD, 36));
        add(l11);

        setLayout(null);
        JLabel l1 = new JLabel("Username :");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
        l1.setBounds(550, 150, 180, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(730, 150, 200, 30);
        t1.setFont(new Font("Tahoma", Font.BOLD, 22));
        t1.setBorder(new LineBorder(new Color(133, 193, 233)));
        t1.setEditable(false);
        add(t1);

        JLabel l2 = new JLabel("ID :");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma", Font.BOLD, 22));
        l2.setBounds(550, 190, 180, 30);
        add(l2);

        c1 = new JComboBox(new String[]{"Passport", "Aadhar Card", "Voter Id", "Driving license"});
        c1.setFont(new Font("Tahoma", Font.BOLD, 18));
        c1.setBorder(new LineBorder(new Color(133, 193, 233)));
        c1.setBounds(730, 190, 200, 30);
        add(c1);

        JLabel l3 = new JLabel("ID Number :");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Tahoma", Font.BOLD, 22));
        l3.setBounds(550, 230, 180, 30);
        add(l3);

        t2 = new JTextField();
        t2.setBounds(730, 230, 200, 30);
        t2.setFont(new Font("Tahoma", Font.BOLD, 22));
        t2.setBorder(new LineBorder(new Color(133, 193, 233)));
        add(t2);

        JLabel l4 = new JLabel("Name :");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma", Font.BOLD, 22));
        l4.setBounds(550, 270, 180, 30);
        add(l4);

        t3 = new JTextField();
        t3.setBounds(730, 270, 200, 30);
        t3.setEditable(false);
        t3.setFont(new Font("Tahoma", Font.BOLD, 22));
        t3.setBorder(new LineBorder(new Color(133, 193, 233)));
        add(t3);

        JLabel l5 = new JLabel("Gender :");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Tahoma", Font.BOLD, 22));
        l5.setBounds(550, 310, 180, 30);
        add(l5);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(730, 310, 95, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(835, 310, 95, 30);
        add(r2);

        ButtonGroup b4 = new ButtonGroup();
        b4.add(r1);
        b4.add(r2);

        //this.add(r1);
        //this.add(r2);
        JLabel l6 = new JLabel("Country :");
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Tahoma", Font.BOLD, 22));
        l6.setBounds(550, 350, 180, 30);
        add(l6);

        t4 = new JTextField();
        t4.setBounds(730, 350, 200, 30);
        t4.setFont(new Font("Tahoma", Font.BOLD, 22));
        t4.setBorder(new LineBorder(new Color(133, 193, 233)));
        add(t4);

        JLabel l7 = new JLabel("Address :");
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Tahoma", Font.BOLD, 22));
        l7.setBounds(550, 390, 180, 30);
        add(l7);

        t5 = new JTextField();
        t5.setBounds(730, 390, 200, 30);
        t5.setFont(new Font("Tahoma", Font.BOLD, 22));
        t5.setBorder(new LineBorder(new Color(133, 193, 233)));
        add(t5);

        JLabel l8 = new JLabel("Phone :");
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Tahoma", Font.BOLD, 22));
        l8.setBounds(550, 430, 180, 30);
        add(l8);

        t6 = new JTextField();
        t6.setBounds(730, 430, 200, 30);
        t6.setFont(new Font("Tahoma", Font.BOLD, 22));
        t6.setBorder(new LineBorder(new Color(133, 193, 233)));
        add(t6);

        JLabel l9 = new JLabel("Email :");
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Tahoma", Font.BOLD, 22));
        l9.setBounds(550, 470, 180, 30);
        add(l9);

        t7 = new JTextField();
        t7.setBounds(730, 470, 200, 30);
        t7.setFont(new Font("Tahoma", Font.BOLD, 22));
        t7.setBorder(new LineBorder(new Color(133, 193, 233)));
        add(t7);

        b1 = new JButton("Add");
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        b1.setForeground(Color.WHITE);
        b1.setBounds(650, 520, 100, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        b2.setForeground(Color.WHITE);
        b2.setBounds(800, 520, 100, 30);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/travel/priya6.png"));
        Image i2 = i1.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(90, 150, 350, 350);
        add(l10);

        try {
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from account where username = '" + username + "'");
            while (rs.next()) {
                t1.setText(rs.getString("username"));
                t3.setText(rs.getString("name"));
            }
        } catch (Exception e) {

        }

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String username = t1.getText();
            String id = (String) c1.getSelectedItem();
            String number = t2.getText();
            String name = t3.getText();
            String gender = null;

            if (r1.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();
            if (number.length() > 16 || phone.length() > 10) {
                JOptionPane.showMessageDialog(null, "enter only 16 digit ID number and 10 digit phone number ");
            } else {
                String q = "insert into customer1 values('" + username + "','" + id + "','" + number + "','" + name + "','" + gender + "','" + country + "','" + address + "','" + phone + "','" + email + "')";
                try {

                    Connect c = new Connect();
                    c.s.executeUpdate(q);

                    JOptionPane.showMessageDialog(null, "Customer Added Successfully");
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
        new AddCustomer("").setVisible(true);
    }
}
