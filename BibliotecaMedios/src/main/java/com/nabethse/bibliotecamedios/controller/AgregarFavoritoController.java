package com.nabethse.bibliotecamedios.controller;

import com.nabethse.bibliotecamedios.HelloApplication;
import com.nabethse.bibliotecamedios.models.BibliotecaDeMedios;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AgregarFavoritoController {

    @FXML
    private Button agregarfavoritoBottom;

    @FXML
    private Button exitButom;

    @FXML
    private TextField nombreimput;

    @FXML
    void onClickagregarfavoritoButtom(MouseEvent event) {

    }

    @FXML
    void onClickexitButtom(MouseEvent event) {
        Platform.exit();
    }
}
