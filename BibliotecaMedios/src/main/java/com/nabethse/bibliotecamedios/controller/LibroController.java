package com.nabethse.bibliotecamedios.controller;

import com.nabethse.bibliotecamedios.HelloApplication;
import com.nabethse.bibliotecamedios.models.BibliotecaDeMedios;
import com.nabethse.bibliotecamedios.models.Cancion;
import com.nabethse.bibliotecamedios.models.Libro;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.awt.*;
import java.util.ArrayList;

public class LibroController {
    protected BibliotecaDeMedios bibliotecaDeMedios = new BibliotecaDeMedios();

    @FXML
    private Button agregarButtom;

    @FXML
    private TextField autorimput;

    @FXML
    private Button exitButtom;

    @FXML
    private TextField generoimput;

    @FXML
    private TextField paginasimput;

    @FXML
    private TextField tituloimput;
    @FXML
    private Label alertLabel;

    @FXML
    void onClickagregarButtom(MouseEvent event) {
        try {
            String autor = autorimput.getText();
            String genero = generoimput.getText();
            int paginas = Integer.parseInt(paginasimput.getText());
            String titulo = tituloimput.getText();
            Libro libro = new Libro(titulo, genero, autor, paginas);
            if (bibliotecaDeMedios.agregarMedio(libro)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hecho");
                alert.setContentText("Libro agregado con éxito");
                alert.showAndWait();
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Ha habido un error al guardar datos: " + e.getMessage());
            alert.showAndWait();
        }

    }

    @FXML
    void onClickexitButtom(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

}
