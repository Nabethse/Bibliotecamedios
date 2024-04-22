package com.nabethse.bibliotecamedios.controller;

import com.nabethse.bibliotecamedios.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class AgregarMedioController {

    @FXML
    private Button cancionButtom;

    @FXML
    private Button libroButtom;

    @FXML
    private Button peliculaButtom;

    @FXML
    private Button serieButtom;

    @FXML
    void onClickcancionButtom(MouseEvent event) {
        HelloApplication.newStage("cancion-view","CANCION");
    }

    @FXML
    void onClicklibroButtom(MouseEvent event) {
        HelloApplication.newStage("libro-view","LIBRO");
    }

    @FXML
    void onClickpeliculaButtom(MouseEvent event) {
        HelloApplication.newStage("pelicula-view", "PELICULA");
    }

    @FXML
    void onClickserieButtom(MouseEvent event) {
        HelloApplication.newStage("serie-view", "SERIE");
    }

}
