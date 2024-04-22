package com.nabethse.bibliotecamedios.controller;

import com.nabethse.bibliotecamedios.HelloApplication;
import com.nabethse.bibliotecamedios.models.BibliotecaDeMedios;
import com.nabethse.bibliotecamedios.models.Cancion;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.awt.*;
import java.util.ArrayList;

public class CancionController {
protected BibliotecaDeMedios bibliotecaDeMedios=new BibliotecaDeMedios();
    @FXML
    private Button agregarcancionButtom;

    @FXML
    private TextField artistaimput;

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
    void onClickagregarcancionButtom(MouseEvent event) {
        try {
            String genero = generoimput.getText();
            String nombre = tituloimput.getText();
            String duracion = duracionimput.getText();
            String artista = artistaimput.getText();
            Cancion cancion = new Cancion(nombre, genero, artista, duracion);
            if (bibliotecaDeMedios.agregarMedio(cancion)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hecho");
                alert.setContentText("Canción agregada con éxito");
                alert.showAndWait();
                System.out.println(cancion);
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
