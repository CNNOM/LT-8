package com.example.task8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    public Pane paneTree;

    private ChristmasTree tree;
    private ChristmasTree dtree;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tree = new ChristmasTreeImpl();
        dtree = tree; // Инициализируем dtree сразу с объектом ёлки
        dtree.draw(paneTree); // Рисуем ёлку сразу при запуске
    }

    public void addGarland(ActionEvent actionEvent) {
        dtree = new Girland(dtree);
        dtree.draw(paneTree);
    }

    public void addStar(ActionEvent actionEvent) {
        dtree = new Star(dtree);
        dtree.draw(paneTree);
    }
}