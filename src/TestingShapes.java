import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TestingShapes {


    private static final ScrabbleSquare[][] board = new ScrabbleSquare[21][21];
    private static ScrabbleBoard sb = new ScrabbleBoard();

    public static void main(String[] args) {
        JFrame f = new JFrame("Scrabble Squares");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setLayout(null);
        sb.addMouseListener(new ShapeMouseListener());
        f.add(sb);
    }

    static class ShapeMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            int row = e.getY()/21;
            int col = e.getX()/21;
            sb.setLabel(row, col, "B");
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

}
