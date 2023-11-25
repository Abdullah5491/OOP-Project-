module com.example.bookthebus {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.bookthebus to javafx.fxml;
    exports com.example.bookthebus;
}