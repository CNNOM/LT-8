package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class ChristmasTreeImpl implements ChristmasTree {
    @Override
    public void draw(Pane pane) {
        // Очищаем панель перед рисованием новой ёлки
        pane.getChildren().clear();

        // Рисуем большой треугольник для ёлки
        Polygon tree = new Polygon(
                80, 400,  // Левая нижняя точка
                400, 400,  // Правая нижняя точка
                240, 100   // Вершина
        );
        tree.setFill(Color.GREEN);

        // Рисуем ствол дерева
        Rectangle trunk = new Rectangle(215, 400, 50, 100);
        trunk.setFill(Color.BROWN);

        // Добавляем треугольник и ствол на панель
        pane.getChildren().addAll(tree, trunk);
    }
}