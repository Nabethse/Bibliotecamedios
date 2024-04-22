package com.nabethse.bibliotecamedios.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.nabethse.bibliotecamedios.models.BibliotecaDeMedios;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AgregarFavoritoController {

    protected BibliotecaDeMedios bibliotecaDeMedios = new BibliotecaDeMedios();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AgregarFavorito;

    @FXML
    private Button exitButom;

    @FXML
    private TextField nombreimput;

    @FXML
    void onClickAgregarFavorito(MouseEvent event) {
        String nombreMedio = nombreimput.getText();
        if (!nombreMedio.isEmpty() && bibliotecaDeMedios.contieneMedio(nombreMedio) && !bibliotecaDeMedios.esFavorito(nombreMedio)) {
            bibliotecaDeMedios.addFavorito(nombreMedio);
            showAlert("Medio agregado a favoritos", "El medio ha sido agregado a la lista de favoritos.");
        } else {
            showAlert("Error", "El medio no existe o ya está en la lista de favoritos.");
        }
    }

    @FXML
    void onClickexitButtom(MouseEvent event) {
        // Coloca aquí el código para cerrar la ventana
    }

    @FXML
    void initialize() {
        assert AgregarFavorito != null : "fx:id=\"AgregarFavorito\" was not injected: check your FXML file 'agregarfavorito-view.fxml'.";
        assert exitButom != null : "fx:id=\"exitButom\" was not injected: check your FXML file 'agregarfavorito-view.fxml'.";
        assert nombreimput != null : "fx:id=\"nombreimput\" was not injected: check your FXML file 'agregarfavorito-view.fxml'.";

    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
