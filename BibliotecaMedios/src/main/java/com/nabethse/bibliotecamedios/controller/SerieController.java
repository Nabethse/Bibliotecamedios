package com.nabethse.bibliotecamedios.controller;

import com.nabethse.bibliotecamedios.HelloApplication;
import com.nabethse.bibliotecamedios.models.BibliotecaDeMedios;
import com.nabethse.bibliotecamedios.models.Serie;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.util.ArrayList;

public class SerieController {
protected BibliotecaDeMedios bibliotecaDeMedios = new BibliotecaDeMedios();
    @FXML
    private Button agregarButtom;

    @FXML
    private TextField creadorimput;

    @FXML
    private Button exitButtom;

    @FXML
    private TextField generoimput;

    @FXML
    private TextField temporadaimput;

    @FXML
    private TextField tituloimput;
    @FXML
    private Label alertLabel;

    @FXML
    void onClickagregarButtom(MouseEvent event) {
        try {
            String creador = creadorimput.getText();
            String genero = generoimput.getText();
            String temporada = temporadaimput.getText();
            String titulo = tituloimput.getText();
            Serie serie = new Serie(titulo, genero, creador, temporada);
            if (bibliotecaDeMedios.agregarMedio(serie)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Hecho");
                alert.setContentText("Serie agregada con éxito");
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
