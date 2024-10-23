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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tree = new ChristmasTreeImpl();
        tree.draw(paneTree);
    }

    public void addGarland(ActionEvent actionEvent) {
        tree = new Girland(tree);
        tree.draw(paneTree);
    }

    public void addStar(ActionEvent actionEvent) {
        tree = new Star(tree);
        tree.draw(paneTree);
    }

    public void addPresents(ActionEvent actionEvent) {
        tree = new Presents(tree);
        tree.draw(paneTree);
    }

    public void addAll(ActionEvent actionEvent) {
        tree = new Girland(tree);
        tree = new Star(tree);
        tree = new Presents(tree);
        tree.draw(paneTree);
    }
    public void removeAll(ActionEvent actionEvent) {
        tree = new ChristmasTreeImpl();
        tree.draw(paneTree);
    }
}