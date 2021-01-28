module com.xyz.mytipcalc20210127 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.xyz.mytipcalc20210127 to javafx.fxml;
    exports com.xyz.mytipcalc20210127;
}
