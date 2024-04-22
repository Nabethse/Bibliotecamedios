package com.nabethse.bibliotecamedios.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.nabethse.bibliotecamedios.models.BibliotecaDeMedios;
import com.nabethse.bibliotecamedios.models.Medio;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BuscarGeneroController {

    protected BibliotecaDeMedios bibliotecaDeMedios = new BibliotecaDeMedios();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buscargeneroButtom;

    @FXML
    private Button exitButtom;

    @FXML
    private TextField tipogeneroimput;

    @FXML
    void onClickbuscargeneroButtom(MouseEvent event) {
        try {
            String genero = tipogeneroimput.getText().trim();
            List<Medio> mediosEncontrados = bibliotecaDeMedios.buscarMedioPorGenero(genero);
            if (mediosEncontrados.isEmpty()) {
                mostrarAlerta("Error", "No se encontraron medios con el género buscado.", Alert.AlertType.INFORMATION);
            } else {
                for (Medio medio : mediosEncontrados) {
                    medio.mostrarDetalles();
                }
            }
        } catch (Exception e) {
            mostrarAlerta("Error", "Hubo un error al buscar el medio por género: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @FXML
    void onClickexitButtom(MouseEvent event) {
        // Coloca aquí el código para cerrar la ventana
    }

    @FXML
    void initialize() {
        assert buscargeneroButtom != null : "fx:id=\"buscargeneroButtom\" was not injected: check your FXML file 'buscar-view.fxml'.";
        assert exitButtom != null : "fx:id=\"exitButtom\" was not injected: check your FXML file 'buscar-view.fxml'.";
        assert tipogeneroimput != null : "fx:id=\"tipogeneroimput\" was not injected: check your FXML file 'buscar-view.fxml'.";

    }

    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}
