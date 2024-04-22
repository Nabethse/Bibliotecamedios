package com.nabethse.bibliotecamedios.controller;

import com.nabethse.bibliotecamedios.HelloApplication;
import com.nabethse.bibliotecamedios.models.BibliotecaDeMedios;
import com.nabethse.bibliotecamedios.models.Pelicula;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.awt.*;
import java.util.ArrayList;

public class PeliculaController {
protected BibliotecaDeMedios bibliotecaDeMedios =new BibliotecaDeMedios();
    @FXML
    private Button agregarButtom;

    @FXML
    private TextField directorimput;

    @FXML
    private TextField duracionimput;

    @FXML
    private Button exitButtom;

    @FXML
    private TextField generoimput;

    @FXML
    private TextField tituloimput;
    @FXML
    private Label alertLabel;

    @FXML
    void onClickagregarButtom(MouseEvent event) {
        try {
            String director = directorimput.getText();
            int duracionminutos = Integer.parseInt(duracionimput.getText());
            String genero = generoimput.getText();
            String titulo = tituloimput.getText();
            Pelicula pelicula = new Pelicula(titulo, genero,duracionminutos, director);
            if (bibliotecaDeMedios.agregarMedio(pelicula)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hecho");
                alert.setContentText("Película agregada con éxito");
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
