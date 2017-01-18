import com.jimulle.drawing.Drawing;
import com.jimulle.frames.ArtFrame;

class Program {
    public static void main(String args[]) {
        ArtFrame artFrame = new ArtFrame(new Drawing());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}