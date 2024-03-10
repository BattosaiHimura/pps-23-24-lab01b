package e1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChessmasterTest {

    private Chessmaster chessmaster;

    @BeforeEach
    void BeforeEach() {
        this.chessmaster = new ChessmasterImpl();
    }

    @Test
    void testMoveKnightToValidPosition() {
        Pair<Integer, Integer> knight = new Pair<Integer, Integer>(0, 0);
        Pair<Integer, Integer> movedKnight = this.chessmaster.moveKnight(knight, 1, 2);
        assertEquals(1, movedKnight.getX());
        assertEquals(2, movedKnight.getY());
    }

    @Test
    void testMoveKnightToInvalidPosition() {
        Pair<Integer, Integer> knight = new Pair<Integer, Integer>(0, 0);
        Pair<Integer, Integer> movedKnight = this.chessmaster.moveKnight(knight, 1, 1);
        assertEquals(knight.getX(), movedKnight.getX());
        assertEquals(knight.getY(), movedKnight.getY());
    }

    @Test
    void testMoveKnightToSamePosition() {
        Pair<Integer, Integer> knight = new Pair<Integer, Integer>(0, 0);
        Pair<Integer, Integer> movedKnight = this.chessmaster.moveKnight(knight, knight.getX(), knight.getY());
        assertEquals(knight.getX(), movedKnight.getX());
        assertEquals(knight.getY(), movedKnight.getY());
    }
}
