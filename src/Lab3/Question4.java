package Lab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Question4 {

    private static final String URL = "jdbc:mysql://localhost:3306/Question4";
    private static final String USER = "root";
    private static final String PASSWORD = "rootpassword";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            insertData();
            updateData();
            deleteData();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertData() throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
        	
            Statement statement = connection.createStatement();
        	 String createTableSQL = "CREATE TABLE employees (" +
                     "id INT PRIMARY KEY," +
                     "name VARCHAR(255)," +
                     "position VARCHAR(255)," +
                     "salary DOUBLE)";
             
             statement.execute(createTableSQL);
             
             
            String insertSQL = "INSERT INTO employees (id, name, position, salary) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, "Nawaras");
                preparedStatement.setString(3, "Software Engineer");
                preparedStatement.setDouble(4, 75000.0);
                
                int rowsInserted = preparedStatement.executeUpdate();
                System.out.println(rowsInserted + " row(s) inserted.");
            }
        }
    }

    private static void updateData() throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String updateSQL = "UPDATE employees SET salary = ? WHERE name = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
                preparedStatement.setDouble(1, 80000.0);
                preparedStatement.setString(2, "John Doe");
                
                int rowsUpdated = preparedStatement.executeUpdate();
                System.out.println(rowsUpdated + " row(s) updated.");
            }
        }
    }

    private static void deleteData() throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String deleteSQL = "DELETE FROM employees WHERE name = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
                preparedStatement.setString(1, "John Doe");
                
                int rowsDeleted = preparedStatement.executeUpdate();
                System.out.println(rowsDeleted + " row(s) deleted.");
            }
        }
    }
}
