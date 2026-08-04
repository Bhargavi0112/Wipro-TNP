package JDBC.CallableStatement;

import java.sql.*;

public class CallProcedure {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1522:XE";
        String user = "hr";
        String password = "hr";

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "{call CAL_NETSAL(?, ?)}";

            CallableStatement cs = con.prepareCall(sql);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES");

            System.out.println("EMP_ID\tNAME\tNET SALARY");

            while (rs.next()) {

                int id = rs.getInt("EMPLOYEE_ID");
                String name = rs.getString("FIRST_NAME");

                cs.setInt(1, id);
                cs.registerOutParameter(2, Types.NUMERIC);

                cs.execute();

                double netSalary = cs.getDouble(2);

                System.out.println(id + "\t" + name + "\t" + netSalary);
            }

            rs.close();
            stmt.close();
            cs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}