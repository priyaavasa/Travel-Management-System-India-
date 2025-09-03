package com.travel;

import java.sql.*;

public class Connect {

    Connection c;
    Statement s;

    Connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms", "root", "your_password");
            s = c.createStatement();

        } catch (Exception e) {
        }

    }

}


