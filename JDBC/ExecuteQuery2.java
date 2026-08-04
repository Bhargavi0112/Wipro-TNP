package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteQuery2 {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1522:XE";
        String user = "hr";
        String password = "hr";

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                "SELECT first_name, job_id, salary, commission_pct " +
                "FROM employees "
            );

            while (rs.next()) {
                System.out.println(
                    rs.getString("FIRST_NAME") + "  " +
                    rs.getString("JOB_ID") + "  " +
                    rs.getDouble("SALARY") + "  " +
                    rs.getString("COMMISSION_PCT")
                );
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}