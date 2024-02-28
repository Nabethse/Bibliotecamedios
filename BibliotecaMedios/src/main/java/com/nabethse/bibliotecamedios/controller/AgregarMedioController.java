package com.nabethse.bibliotecamedios.controller;

import com.nabethse.bibliotecamedios.HelloApplication;
import com.nabethse.bibliotecamedios.models.BibliotecaDeMedios;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AgregarMedioController {

    @FXML
    private Button agregarmedioButtom;

    @FXML
    private TextField autorimput;

    @FXML
    private Button exitButtom;

    @FXML
    private TextField generoimput;

    @FXML
    private TextField nombremedioimput;

    @FXML
    private TextField tipomedioimput;

    @FXML
    void onClickagregarmedioButtom(MouseEvent event) {
        
        }

    @FXML
    void onClickexitButtom(MouseEvent event) {
        Platform.exit();
    }
}


