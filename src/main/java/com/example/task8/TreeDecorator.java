package com.example.task8;

import javafx.scene.layout.Pane;

public abstract class TreeDecorator implements ChristmasTree {
    protected ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public void draw(Pane pane) {
        tree.draw(pane);
    }
}