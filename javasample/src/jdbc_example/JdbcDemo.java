package jdbc_example;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/employee";
        String user = "postgres";
        String password = "Dhana13122004";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            String query = "SELECT * FROM emp";
            rs = stmt.executeQuery(query);

            System.out.println("Employee Details:");
            System.out.println("--------------------------------");
            while (rs.next()) {
                int eid = rs.getInt("eid");
                String ename = rs.getString("ename");
                String city = rs.getString("city");

                System.out.println("ID: " + eid + ", Name: " + ename + ", City: " + city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } // ✅ Properly closed
    }
}
 