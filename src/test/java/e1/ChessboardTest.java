package e1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChessboardTest {
    
    Chessboard chessboard;
    private static final int SIZE = 8;
    private final Random random = new Random();

    @BeforeEach
    void BeforeEach() {
        this.chessboard = new ChessboardImpl(this.SIZE);
    }

    @Test
    void testRandomPosition() {
        Pair<Integer, Integer> pos = this.chessboard.randomPosition();
        assertTrue(pos.getX() >= 0);
        assertTrue(pos.getY() >= 0);
        assertTrue(pos.getX() < SIZE);
        assertTrue(pos.getY() < SIZE);
    }

    @Test
    void testHasPosition() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                assertTrue(this.chessboard.hasPosition(i, j));
            }
        }
    }

    @Test
    void testHasNoPositionOutsideBoundaries() {
        assertThrows(IndexOutOfBoundsException.class, () -> this.chessboard.hasPosition(SIZE, SIZE));
    }

    @Test
    void testHasNoNegativePositions() {
        int negativeCol = -random.nextInt(SIZE);
        int negativeRow = -random.nextInt(SIZE);
        assertThrows(IndexOutOfBoundsException.class, () -> this.chessboard.hasPosition(negativeRow, negativeCol));
    }
}
