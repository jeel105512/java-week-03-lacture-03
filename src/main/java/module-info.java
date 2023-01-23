module com.example.lacture03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lacture03 to javafx.fxml;
    exports com.example.lacture03;
}