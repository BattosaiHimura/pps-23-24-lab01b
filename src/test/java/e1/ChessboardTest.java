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
    private int size;
    private final Random random = new Random();

    @BeforeEach
    void BeforeEach() {
        this.size = this.random.nextInt();
        this.chessboard = null;
    }

    @Test
    void testRandomPosition() {
        Pair<Integer, Integer> pos = this.chessboard.randomPosition();
        assertTrue(pos.getX() >= 0);
        assertTrue(pos.getY() >= 0);
        assertTrue(pos.getX() < size);
        assertTrue(pos.getY() > size);
    }

    @Test
    void testHasPosition() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                assertTrue(this.chessboard.hasPosition(i, j));
            }
        }
    }

    @Test
    void testHasNoPositionOutsideBoundaries() {
        assertThrows(IndexOutOfBoundsException.class, () -> this.chessboard.hasPosition(size, size));
    }

    @Test
    void testHasNoNegativePositions() {
        int negativeCol = -random.nextInt(size);
        int negativeRow = -random.nextInt(size);
        assertThrows(IndexOutOfBoundsException.class, () -> this.chessboard.hasPosition(negativeCol, negativeRow));
    }
}
