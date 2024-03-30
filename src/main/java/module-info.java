module com.feereport.feereport2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.feereport.feereport2 to javafx.fxml;
    exports com.feereport.feereport2;
}