package Section20_JDBC_Database_Access.demo_transaction.application;

import Section20_JDBC_Database_Access.demo_transaction.db.DB;
import Section20_JDBC_Database_Access.demo_transaction.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DB.getConnection();

            connection.setAutoCommit(false); // start transaction, do not automatically confirm the sql operations

            statement = connection.createStatement();

            int  rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int x = 1;
            if (x < 2){
                throw new SQLException("Fake error");
            }

            int  rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit(); // commit transaction, confirm the sql operations

            System.out.println("rows1: " + rows1);
            System.out.println("rows2: " + rows2);

        }
        catch (SQLException e){
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused by: " + ex.getMessage());
            }
        }
        finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}