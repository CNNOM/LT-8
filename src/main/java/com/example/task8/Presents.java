package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;

public class Presents extends TreeDecorator {
    public Presents(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public void draw(Pane pane) {
        super.draw(pane);
        drawPresents(pane);
    }

    private void drawPresents(Pane pane) {
        // Рисуем подарки под ёлкой
        Rectangle present1 = new Rectangle(100, 460, 50, 50);
        present1.setFill(Color.RED);
        present1.setStroke(Color.BLACK);
        present1.setStrokeWidth(2);

        Rectangle present2 = new Rectangle(200, 470, 60, 40);
        present2.setFill(Color.GREEN);
        present2.setStroke(Color.BLACK);
        present2.setStrokeWidth(2);

        Rectangle present3 = new Rectangle(300, 450, 40, 60);
        present3.setFill(Color.BLUE);
        present3.setStroke(Color.BLACK);
        present3.setStrokeWidth(2);

        // Рисуем ленточки на подарках
        Rectangle ribbon1 = new Rectangle(120, 460, 10, 49);
        ribbon1.setFill(Color.YELLOW);

        Rectangle ribbon2 = new Rectangle(225, 470, 10, 39);
        ribbon2.setFill(Color.PURPLE);

        Rectangle ribbon3 = new Rectangle(315, 450, 10, 59);
        ribbon3.setFill(Color.ORANGE);

        Polygon bow1 = new Polygon(
                120, 460,
                125, 455,
                130, 460,
                125, 465
        );
        bow1.setFill(Color.YELLOW);

        Polygon bow2 = new Polygon(
                225, 470,
                230, 465,
                235, 470,
                230, 475
        );
        bow2.setFill(Color.PURPLE);

        Polygon bow3 = new Polygon(
                315, 450,
                320, 445,
                325, 450,
                320, 455
        );
        bow3.setFill(Color.ORANGE);

        // Добавляем подарки, ленточки и бантики на панель
        pane.getChildren().addAll(present1, present2, present3, ribbon1, ribbon2, ribbon3, bow1, bow2, bow3);
    }
}