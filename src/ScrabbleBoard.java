import javax.swing.*;
import java.awt.*;

public class ScrabbleBoard extends JComponent {

    private final int ROWS = 21;
    private final int COLS = 21;
    private final ScrabbleSquare[][] board;

    public ScrabbleBoard() {
        board = new ScrabbleSquare[ROWS][COLS];
        setUpGrid();
    }

    public void setUpGrid() {
        int x = 0, y = 0;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                board[row][col] = new ScrabbleSquare(x, y);
                x+=21;
            }
            y+=21;
            x = 0;
        }
    }

    public void paint(Graphics g) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                board[row][col].paint(g);
            }
        }
    }

    public void setLabel(int row, int col, String lbl) {
        ScrabbleSquare ssq = board[row][col];
        ssq.setLabel(lbl);
        repaint();
    }

}
