package JDBC.PreparedStatement;

public class JDBCCalls {

    public static void main(String[] args) {

        try {

            DAOClass dao = new DAOClass();

            dao.insert(101, "AJIT", "IV", "2001-11-20", 4000);

            dao.display();

            dao.modify(101, 4500);

            dao.display();

            dao.delete(101);

            dao.display();

            dao.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}