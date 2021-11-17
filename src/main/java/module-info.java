module com.example.zzz_fastfood_test1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zzz_fastfood_test1 to javafx.fxml;
    exports com.example.zzz_fastfood_test1;
}