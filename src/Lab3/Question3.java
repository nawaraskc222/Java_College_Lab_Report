package Lab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question3 {

    private static final String URL = "jdbc:mysql://localhost:3306/Question3";
    private static final String USER = "root";
    private static final String PASSWORD = "rootpassword";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            createTable();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable() throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            String createTableSQL = "CREATE TABLE hamroStudent (" +
                    "id INT PRIMARY KEY," +
                    "name VARCHAR(255)," +
                    "position VARCHAR(255)," +
                    "salary DOUBLE)";
            
            statement.execute(createTableSQL);

            System.out.println("Table 'hamroStudent' created successfully.");
        }
    }
}
