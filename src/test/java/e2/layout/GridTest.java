package e2.layout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.Pair;

class GridTest {

    private Grid grid;
    private static final int SIZE = 10;

    @BeforeEach
    void BeforeEach() {
        this.grid = null;
    }

    @Test
    void testGridSetup() {
        assertEquals(grid.getTotalCells(), GridTest.SIZE * GridTest.SIZE);
    };

    @Test
    void testCellPicking() {

        Pair<Integer, Integer> pos = new Pair<>(5, 5);
        Cell cell = grid.getCell(pos);

        assertTrue(cell.getPosition().equals(pos));
    }

    @Test
    void testCornersShouldHaveThreeAdjacentCells() {
        Pair<Integer, Integer> topLeft = new Pair<>(0, 0);
        Pair<Integer, Integer> topRight = new Pair<>(0, SIZE - 1);
        Pair<Integer, Integer> bottomLeft = new Pair<>(SIZE - 1, 0);
        Pair<Integer, Integer> bottomRight = new Pair<>(SIZE - 1, SIZE - 1);

        assertEquals(3, grid.getAdjacentCells(topLeft).size());
        assertEquals(3, grid.getAdjacentCells(topRight).size());
        assertEquals(3, grid.getAdjacentCells(bottomLeft).size());
        assertEquals(3, grid.getAdjacentCells(bottomRight).size());
    }

    @Test
    void testNonCornerBordersShouldHaveFiveAdjacentCells() {
        for (int i = 1; i < SIZE - 1; i++) {
            Pair<Integer, Integer> topBorder = new Pair<>(0, i);
            Pair<Integer, Integer> bottomBorder = new Pair<>(SIZE - 1, i);
            Pair<Integer, Integer> leftBorder = new Pair<>(i, 0);
            Pair<Integer, Integer> rightBorder = new Pair<>(i, SIZE-1);

            assertEquals(5, grid.getAdjacentCells(topBorder).size());
            assertEquals(5, grid.getAdjacentCells(bottomBorder).size());
            assertEquals(5, grid.getAdjacentCells(leftBorder).size());
            assertEquals(5, grid.getAdjacentCells(rightBorder).size());
        }
    }

    @Test
    void testNonBorderlineCellsShouldHaveEightAdjacentCells() {
        for (int i = 1; i < SIZE - 1; i++) {
            for (int j = 1; j < SIZE - 1; j++) {
                Pair<Integer, Integer> pos = new Pair<>(i, j);

                assertEquals(8, grid.getAdjacentCells(pos));
            }
        }
    }
}
