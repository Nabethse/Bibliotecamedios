package com.nabethse.bibliotecamedios.controller;

import com.nabethse.bibliotecamedios.HelloApplication;
import com.nabethse.bibliotecamedios.models.BibliotecaDeMedios;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BuscarGeneroController {

    @FXML
    private Button buscargeneroButtom;

    @FXML
    private Button exitButtom;

    @FXML
    private TextField tipogeneroimput;

    @FXML
    void onClickbuscargeneroButtom(MouseEvent event) {

    }

    @FXML
    void onClickexitButtom(MouseEvent event) {
        Platform.exit();
    }
}
