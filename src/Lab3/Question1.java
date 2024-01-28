package Lab3;

import java.sql.*;


public class Question1 {
    private static final String URL = "jdbc:mysql://localhost:3306/Student";
    private static final String USER = "root";
    private static final String PASSWORD = "rootpassword";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            insertData();
            readData();
            modifyData();
            deleteData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static void deleteData() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "DELETE FROM studenttable WHERE roll = ?";
            try (PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, 2);  // Specify the roll value to delete
                int rowsAffected = statement.executeUpdate();
                System.out.println(rowsAffected + " record(s) deleted.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void modifyData() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "UPDATE studenttable SET name = ?, roll = ?, height = ? WHERE roll = ?";
            try (PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setString(1, "Karan");
                statement.setInt(2, 5);
                statement.setFloat(3, (float) 1.5);
                statement.setInt(4, 1);  // Specify the roll value to update
                int rowsAffected = statement.executeUpdate();
                System.out.println(rowsAffected + " record(s) updated.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void readData() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM studenttable")) {

            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name")
                        + ", Roll: " + rs.getInt("roll")
                        + ", Height: " + rs.getFloat("height"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void insertData() {
        String insertQuery = "INSERT INTO studenttable (name, roll, height) VALUES (?, ?, ?)";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Inserting the first record
            try (PreparedStatement preparedStatement1 = con.prepareStatement(insertQuery)) {
                preparedStatement1.setString(1, "Nawaras");
                preparedStatement1.setInt(2, 1);
                preparedStatement1.setFloat(3, (float) 1.6);
                int rowsAffected1 = preparedStatement1.executeUpdate();
                System.out.println(rowsAffected1 + " record(s) inserted");
            }
            // Inserting the second record
            try (PreparedStatement preparedStatement2 = con.prepareStatement(insertQuery)) {
                preparedStatement2.setString(1, "Nisum");
                preparedStatement2.setInt(2, 2);
                preparedStatement2.setFloat(3, (float) 2.7);
                int rowsAffected2 = preparedStatement2.executeUpdate();
                System.out.println(rowsAffected2 + " record(s) inserted");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
