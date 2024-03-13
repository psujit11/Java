package org.example.newjavafx;



import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StudentInfoController {

    @FXML
    private Label studentName;
    @FXML
    private Label studentAge;
    @FXML
    private Label studentEmail;

    public void initialize() {
        // Assuming you have a way to get the current logged-in student's details
        String name = "John Doe"; // Example
        String age = "20"; // Example
        String email = "john.doe@example.com"; // Example

        studentName.setText(name);
        studentAge.setText(age);
        studentEmail.setText(email);
    }
}
