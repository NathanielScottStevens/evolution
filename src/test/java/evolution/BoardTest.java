package evolution;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void periodsAtInit(){
        Board board = new Board(5, 5);
        for (int i = 0; i < board.height; i++){
            for (int j = 0; j < board.width; j++){
                assertEquals('.', board.getChars()[i][j]);
            }
        }
    }

    @Test
    public void getAndSetChar(){
        Board board = new Board(5, 5);
        board.setChar(0, 0, 'x');
        board.setChar(2, 1, 'x');
        board.setChar(4, 4, 'x');

        assertEquals('x', board.getChar(0, 0));
        assertEquals('x', board.getChar(2, 1));
        assertEquals('x', board.getChar(4, 4));
    }

    @Test
    public void getAndSetCharWithPoint(){
        Board board = new Board(5, 5);
        Point a = new Point(0, 0);
        Point b = new Point(2, 1 );
        Point c = new Point(4, 4);

        board.setChar(a, 'x');
        board.setChar(b, 'x');
        board.setChar(c, 'x');

        assertEquals('x', board.getChar(a));
        assertEquals('x', board.getChar(b));
        assertEquals('x', board.getChar(c));
    }
}
