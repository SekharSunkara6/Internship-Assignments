import java.sql.*;

public class PatientRecords {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/patient";
        String username = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, name, problem, bill FROM patients")) {

            System.out.println("Patient Records:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Problem: " + rs.getString("problem"));
                System.out.println("Bill: $" + rs.getDouble("bill"));
                System.out.println("---------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
