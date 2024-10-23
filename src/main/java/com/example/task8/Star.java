package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Star extends TreeDecorator {
    public Star(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public void draw(Pane pane) {
        super.draw(pane);
        drawStar(pane);
    }

    private void drawStar(Pane pane) {
        Polygon star = new Polygon();
        int numPoints = 5;
        double radius = 50;
        double centerX = 240;
        double centerY = 100;
        double offsetAngle = Math.PI / -2;

        for (int i = 0; i < numPoints * 2; i++) {
            double angle = Math.PI / numPoints * i + offsetAngle;
            double r = (i % 2 == 0) ? radius : radius / 2;
            double x = centerX + r * Math.cos(angle);
            double y = centerY + r * Math.sin(angle);
            star.getPoints().add(x);
            star.getPoints().add(y);
        }

        star.setFill(Color.YELLOW);
        star.setStroke(Color.GOLD);
        star.setStrokeWidth(1);

        pane.getChildren().add(star);
    }
}