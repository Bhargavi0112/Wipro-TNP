package JDBC.PreparedStatement;

import java.sql.*;

public class UpdateStudent {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1522:XE";
        String user = "hr";
        String password = "hr";

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "UPDATE STUDENT SET FEES = ? WHERE ROLLNO = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, 5000);
            ps.setInt(2, 102);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student Updated Successfully");
            else
                System.out.println("Student Not Found");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}