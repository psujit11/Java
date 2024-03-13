module org.example.studentinfo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.studentinfo to javafx.fxml;
    exports org.example.studentinfo;
}