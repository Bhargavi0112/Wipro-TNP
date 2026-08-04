package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteQuery1 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1522:XE";
        String user = "hr";
        String password = "hr";

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT employee_id, first_name FROM employees");

            while (rs.next()) {
                int empId = rs.getInt(1);             
                String firstName = rs.getString("FIRST_NAME");  
                System.out.println(empId + " " + firstName);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println(e);
        }
    }
}