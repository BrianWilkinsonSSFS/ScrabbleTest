import javax.swing.*;
import java.awt.*;

public class ScrabbleSquare extends JComponent {

    private int x, y;

    public ScrabbleSquare(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 20, 20);
    }

}
