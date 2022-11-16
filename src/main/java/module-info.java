module com.example.changingface {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.changingface to javafx.fxml;
    exports com.example.changingface;
}