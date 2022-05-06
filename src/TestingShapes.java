import javax.swing.*;
import java.awt.*;

public class TestingShapes {


    private static ScrabbleSquare[][] board = new ScrabbleSquare[21][21];
    public static void main(String[] args) {
       JFrame f = new JFrame("Scrabble Squares");
        f.setVisible(true);
       f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //f.setLayout(null);
       ScrabbleBoard sb = new ScrabbleBoard();
        f.add(sb);
        //cpc.drawing();
    }




}
