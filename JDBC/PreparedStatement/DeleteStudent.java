package JDBC.PreparedStatement;

import java.sql.*;

public class DeleteStudent {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1522:XE";
        String user = "hr";
        String password = "hr";

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "DELETE FROM STUDENT WHERE ROLLNO = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 101);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student Deleted Successfully");
            else
                System.out.println("Student Not Found");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}