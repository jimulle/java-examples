import com.jimulle.drawing.*;
import com.jimulle.frames.*;

class Program {
    public static void main(String args[]) {
        ArtFrame artFrame = new ArtFrame(new Drawing());
        artFrame.setSize(200, 100);
        artFrame.setVisible(true);

        ArtFrame2 artFrame2 = new ArtFrame2(new DrawingSquare());

        artFrame2.setSize(300, 200);
        artFrame2.setVisible(true);
    }
}