import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TestingShapes {

    private static Character currentKey = 'a';
    private static final ScrabbleSquare[][] board = new ScrabbleSquare[21][21];
    private static ScrabbleBoard sb = new ScrabbleBoard();
    private static int row=0;
    private static int col=0;

    public static void main(String[] args) {
        JFrame f = new JFrame("Scrabble Squares");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setLayout(null);
        sb.addMouseListener(new ShapeMouseListener());
        sb.addKeyListener(new ShapeKeyListener());
        sb.setFocusable(true);
        f.add(sb);
    }

    static class ShapeMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            row = e.getY()/21;
            col = e.getX()/21;

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

    static class ShapeKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            currentKey = e.getKeyChar();
            sb.setLabel(row, col, ""+currentKey);
            col+=1;
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

}
