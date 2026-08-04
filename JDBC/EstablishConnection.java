package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnection {

    public static void main(String[] args) {
        try {
            

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1522:XE",
                    "hr",
                    "hr");

            System.out.println("Connection Established Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println(e);
        }
    }
}