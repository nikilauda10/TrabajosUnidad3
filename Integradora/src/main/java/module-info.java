module com.edu.mx.integradora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.edu.mx.integradora to javafx.fxml;
    exports com.edu.mx.integradora;
}