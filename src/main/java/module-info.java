module com.example.demogit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demogit to javafx.fxml;
    exports com.example.demogit;
}