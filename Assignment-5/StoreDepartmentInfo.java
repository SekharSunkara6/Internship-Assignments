import java.sql.*;

public class StoreDepartmentInfo {

    public static void main(String[] args) {
        DepartmentInfo departmentInfo = new DepartmentInfo(10, "Engineering");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/departments", "your_username", "your_password");
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO department (id, name) VALUES (?, ?)")) {

            preparedStatement.setInt(1, departmentInfo.getId());
            preparedStatement.setString(2, departmentInfo.getName());
            preparedStatement.executeUpdate();

            System.out.println("Department information inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class DepartmentInfo {
    private int id;
    private String name;

    public DepartmentInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
