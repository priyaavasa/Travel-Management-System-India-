package com.travel;

import java.sql.*;

public class Connect {

    Connection c;
    Statement s;

    Connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms", "root", "Priyavasa@16");
            s = c.createStatement();

        } catch (Exception e) {
        }

    }

}

