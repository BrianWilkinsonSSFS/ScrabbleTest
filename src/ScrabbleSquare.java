import javax.swing.*;
import java.awt.*;

public class ScrabbleSquare extends JComponent {

    private final int x;
    private final int y;
    private String label;

    public ScrabbleSquare(int x, int y) {
        this.x = x;
        this.y = y;
        label = "";
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 20, 20);
        g.setFont(Font.decode("Helvetica Neue-14"));
        g.drawString(label, x+5, y+15);
    }

    public void setLabel(String lbl) {
        label = lbl;
    }

}
