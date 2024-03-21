module org.example.programimidistribuar {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.programimidistribuar to javafx.fxml;
    exports org.example.programimidistribuar;
}