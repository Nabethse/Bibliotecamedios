module com.nabethse.bibliotecamedios.controller {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.nabethse.bibliotecamedios to javafx.fxml;
    exports com.nabethse.bibliotecamedios;
    exports com.nabethse.bibliotecamedios.controller;
    opens com.nabethse.bibliotecamedios.controller to javafx.fxml;
}