package JDBC.PreparedStatement;

import java.sql.*;

public class DAOClass {

    String url = "jdbc:oracle:thin:@localhost:1522:XE";
    String user = "hr";
    String password = "hr";

    Connection con;

    public DAOClass() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        con = DriverManager.getConnection(url, user, password);
    }

    public void insert(int rollno, String name, String standard, String dob, double fees) throws Exception {

        String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, rollno);
        ps.setString(2, name);
        ps.setString(3, standard);
        ps.setDate(4, Date.valueOf(dob));
        ps.setDouble(5, fees);

        ps.executeUpdate();

        System.out.println("Record Inserted Successfully");

        ps.close();
    }

    public void delete(int rollno) throws Exception {

        String sql = "DELETE FROM STUDENT WHERE ROLLNO=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, rollno);

        ps.executeUpdate();

        System.out.println("Record Deleted Successfully");

        ps.close();
    }

    public void modify(int rollno, double fees) throws Exception {

        String sql = "UPDATE STUDENT SET FEES=? WHERE ROLLNO=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setDouble(1, fees);
        ps.setInt(2, rollno);

        ps.executeUpdate();

        System.out.println("Record Updated Successfully");

        ps.close();
    }

    public void display() throws Exception {

        String sql = "SELECT * FROM STUDENT";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {

            System.out.println(
                    rs.getInt("ROLLNO") + " "
                    + rs.getString("STUDENTNAME") + " "
                    + rs.getString("STANDARD") + " "
                    + rs.getDate("DATE_OF_BIRTH") + " "
                    + rs.getDouble("FEES"));
        }

        rs.close();
        ps.close();
    }

    public void close() throws Exception {
        con.close();
    }
}