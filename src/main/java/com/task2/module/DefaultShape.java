package com.task2.module;

import javafx.scene.canvas.GraphicsContext;

public class DefaultShape extends Shape {

    public DefaultShape() {
        super(0, 0, 0, null);
    }

    @Override
    public void draw(GraphicsContext gr) {
        // Ничего не рисуем
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }
}