package com.travel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class About extends JFrame implements ActionListener {

    String s;
    JButton b1;

    About() {
        setBounds(0, 0, 1980, 1080);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("Travel & Tourism Management System");
        l1.setBounds(300, 10, 750, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        add(l1);

        s = " About this Project :- \n  "
                + "\nThe objective of the Travel and Tourism Management System "
                + "project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours "
                + "by this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:-"
                + "\nGives accurate information."
                + "\nSimplifies the manual work."
                + "\nIt minimizes the documentation related work."
                + "\nProvides up to date information."
                + "\nFriendly Environment by providing warning messages."
                + "\ntravellers details can be provided."
                + "\nbooking confirmation notification."
                + "\n\n"
                + "				THANK YOU ";

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(150, 100, 950, 300);
        t1.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(t1);

        b1 = new JButton("Back");
        b1.setBounds(550, 450, 150, 40);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
