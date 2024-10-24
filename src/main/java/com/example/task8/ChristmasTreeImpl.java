package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class ChristmasTreeImpl implements ChristmasTree {
    @Override
    public void draw(Pane pane) {
        pane.getChildren().clear();

        Polygon tree = new Polygon(
                80, 400,
                400, 400,
                240, 100
        );
        tree.setFill(Color.GREEN);

        Rectangle trunk = new Rectangle(215, 400, 50, 100);
        trunk.setFill(Color.BROWN);

        pane.getChildren().addAll(tree, trunk);
    }
}