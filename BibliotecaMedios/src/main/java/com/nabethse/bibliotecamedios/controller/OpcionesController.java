package com.nabethse.bibliotecamedios.controller;

import com.nabethse.bibliotecamedios.HelloApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class OpcionesController {

    @FXML
    private Button buscarButtom;


    @FXML
    private Button favoritoButtom;

    @FXML
    private Button medioButtom;

    @FXML
    private Button salirButtom;

    @FXML
    void buscarButtom(MouseEvent event) {
           HelloApplication.newStage("buscar-view","BUSCAR");
    }

    @FXML
    void onClickfavoritoButtom(MouseEvent event) {
        HelloApplication.newStage("agregarfavorito-view","FAVORITO");
    }

    @FXML
    void onClickmedioButtom(MouseEvent event) {
        HelloApplication.newStage("agregarmedio-view","AGREGAR");
    }

    @FXML
    void onClicksalirButtom(MouseEvent event) {
        Platform.exit();
    }
}
