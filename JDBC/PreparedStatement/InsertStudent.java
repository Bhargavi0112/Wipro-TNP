package JDBC.PreparedStatement;

import java.sql.*;

public class InsertStudent {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1522:XE";
        String user = "hr";
        String password = "hr";

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            // Record 1
            ps.setInt(1, 101);
            ps.setString(2, "AJIT");
            ps.setString(3, "IV");
            ps.setDate(4, Date.valueOf("2001-11-20"));
            ps.setDouble(5, 4000);
            ps.executeUpdate();

            // Record 2
            ps.setInt(1, 102);
            ps.setString(2, "RAHUL");
            ps.setString(3, "V");
            ps.setDate(4, Date.valueOf("2002-06-15"));
            ps.setDouble(5, 4500);
            ps.executeUpdate();

            // Record 3
            ps.setInt(1, 103);
            ps.setString(2, "KIRAN");
            ps.setString(3, "VI");
            ps.setDate(4, Date.valueOf("2003-08-25"));
            ps.setDouble(5, 5000);
            ps.executeUpdate();

            System.out.println("Records Inserted Successfully");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}