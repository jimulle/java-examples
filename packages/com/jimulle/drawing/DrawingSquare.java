package com.jimulle.drawing;

import java.awt.Graphics;
import static java.lang.System.out;

public class DrawingSquare extends Drawing {

    public DrawingSquare() {
        super(60, 30, 30, 60);
    }

    public void paint(Graphics g) {
        out.println(x);
        g.drawRect(x, y, width, height);
    }
}