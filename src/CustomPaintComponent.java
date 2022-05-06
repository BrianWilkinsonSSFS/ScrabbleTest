import javax.swing.*;
import java.awt.*;

public class CustomPaintComponent extends JComponent {

    public void drawing() {
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(20,20, 50, 50);
    }
}
