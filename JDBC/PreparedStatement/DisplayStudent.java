package JDBC.PreparedStatement;

import java.sql.*;

public class DisplayStudent {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1522:XE";
        String user = "hr";
        String password = "hr";

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");

            System.out.println("ROLLNO\tNAME\tSTANDARD\tDOB\t\tFEES");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("ROLLNO") + "\t" +
                        rs.getString("STUDENTNAME") + "\t" +
                        rs.getString("STANDARD") + "\t\t" +
                        rs.getDate("DATE_OF_BIRTH") + "\t" +
                        rs.getDouble("FEES"));
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}