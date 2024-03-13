package com.example.demo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.sql.*;

public class StudentInfoApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Information");

        // Login Page
        GridPane loginGrid = new GridPane();
        loginGrid.setAlignment(javafx.geometry.Pos.CENTER);
        loginGrid.setHgap(10);
        loginGrid.setVgap(8);

        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");

        loginGrid.add(usernameLabel, 0, 0);
        loginGrid.add(usernameField, 1, 0);
        loginGrid.add(passwordLabel, 0, 1);
        loginGrid.add(passwordField, 1, 1);
        loginGrid.add(loginButton, 1, 2);

        // Student Info Page
        GridPane studentInfoGrid = new GridPane();
        studentInfoGrid.setAlignment(javafx.geometry.Pos.CENTER);
        TextArea studentInfoTextArea = new TextArea();
        studentInfoTextArea.setEditable(false);
        studentInfoTextArea.setPrefWidth(400);
        studentInfoTextArea.setPrefHeight(300);
        studentInfoGrid.add(studentInfoTextArea, 0, 0);

        // Login button event handler
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (checkCredentials(username, password)) {
                primaryStage.setScene(new Scene(studentInfoGrid, 400, 300));
                displayStudentInfo(studentInfoTextArea);
            } else {
                showAlert("Invalid credentials", Alert.AlertType.ERROR);
            }
        });

        Scene loginScene = new Scene(loginGrid, 300, 150);
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    private boolean checkCredentials(String username, String password) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase"; // Change this to your JDBC URL
        String dbUsername = "root"; // Change this to your database username
        String dbPassword = ""; // Change this to your database password

        String sql = "SELECT * FROM student_profile WHERE username = ? AND password = ?";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, username);
            statement.setString(2, password);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next(); // Return true if credentials match, false otherwise
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // Return false on database error
        }
    }

    private void displayStudentInfo(TextArea studentInfoTextArea) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String dbUsername = "root";
        String dbPassword = "";

        String sql = "SELECT * FROM student_profile";
        try (

                Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {
            StringBuilder sb = new StringBuilder();
            while (resultSet.next()) {
                sb.append("ID: ").append(resultSet.getInt("id")).append("\n");
                sb.append("Username: ").append(resultSet.getString("username")).append("\n");
                sb.append("Password: ").append(resultSet.getString("password")).append("\n\n");
            }
            studentInfoTextArea.setText(sb.toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void showAlert(String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setContentText(message);
        alert.showAndWait();
    }
    public static void main(String[] args) {
        launch(args); }
}