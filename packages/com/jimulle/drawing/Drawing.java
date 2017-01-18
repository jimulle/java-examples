package com.jimulle.drawing;

import java.awt.Graphics;

public class Drawing {
    public int x;
    public int y;
    public int width;
    public int height;

    public Drawing() {
        this.x = 40;
        this.y = 40;
        this.width = 40;
        this.height = 40;
    }

    public Drawing(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void paint(Graphics g) {
        g.drawOval(x, y, width, height);
    }
}