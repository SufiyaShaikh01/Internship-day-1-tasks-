package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String args[]) {


        String URL = "jdbc:postgresql://localhost:5432/internship_task1";
        String USERNAME = "postgres";
        String PASSWORD = "010705";


        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");


            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to PostgreSQL database!");


            stmt = conn.createStatement();


            String createTableSQL =
                    "CREATE TABLE IF NOT EXISTS departments (" +
                            "department_id SERIAL PRIMARY KEY, " +
                            "department_name VARCHAR(100)" +
                            ")";

            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'departments' created");

            String insertSQL1 = "INSERT INTO departments (department_name) VALUES ('Artificial Intelligence')";
            String insertSQL2 = "INSERT INTO departments (department_name) VALUES ('Cyber Security')";
            String insertSQL3 = "INSERT INTO departments (department_name) VALUES ('Data Science')";


            stmt.executeUpdate(insertSQL1);
            stmt.executeUpdate(insertSQL2);
            stmt.executeUpdate(insertSQL3);

            System.out.println("Sample departments inserted.");


            String selectSQL = "SELECT * FROM departments";
            rs = stmt.executeQuery(selectSQL);

            System.out.println("\n--- Department List ---");
            while (rs.next()) {
                int id = rs.getInt("department_id");
                String name = rs.getString("department_name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (Exception e) {

            System.out.println("Connection failed!");
            e.printStackTrace();

        } finally {


            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}

            System.out.println("All database resources closed.");
        }
    }
}