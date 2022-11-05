module com.example.final_git {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.final_git to javafx.fxml;
    exports com.example.final_git;
}