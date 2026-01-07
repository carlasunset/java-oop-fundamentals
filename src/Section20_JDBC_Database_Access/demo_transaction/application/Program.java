package Section20_JDBC_Database_Access.demo_transaction.application;

import Section20_JDBC_Database_Access.demo_transaction.db.DB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DB.getConnection();

            statement = connection.createStatement();

            int  rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int x = 1;
            if (x < 2){
                throw new SQLException("Fake error");
            }

            int  rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            System.out.println("rows1: " + rows1);
            System.out.println("rows2: " + rows2);

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}