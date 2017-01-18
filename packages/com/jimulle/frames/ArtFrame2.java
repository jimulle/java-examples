package com.jimulle.frames;

import java.awt.Graphics;
import javax.swing.JFrame;
import com.jimulle.drawing.*;

public class ArtFrame2 extends JFrame {
    private static final long serialVersionUID = 1L;

    DrawingSquare drawing;

    public ArtFrame2(DrawingSquare drawing) {
        this.drawing = drawing;
        setTitle("Abstract Art");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        drawing.paint(g);
    }
}