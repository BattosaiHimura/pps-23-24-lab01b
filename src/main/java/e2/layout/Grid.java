package e2.layout;

import java.util.List;

import e2.Pair;

public interface Grid {

    /**
     * Returns the Cell of the grid in a given position, null if it is outside the boundaries of the grid.
     * @param pos
     * @return
     */
    public Cell getCell(Pair<Integer, Integer> pos);

    /**
     * Given a position in the grid, returns all valid adjacent cells, taking into account that cells 
     * beside the boundaries of the grid have less adjacent cells.
     * @param pos
     * @return
     */
    public List<Cell> getAdjacentCells(Pair<Integer, Integer> pos);
}
