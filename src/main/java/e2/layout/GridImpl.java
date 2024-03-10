package e2.layout;

import java.util.ArrayList;
import java.util.List;

import e2.Pair;

public class GridImpl implements Grid {

    private Cell[][] cells;
    private Integer size;

    public GridImpl(int size) {
        this.size = size;
        this.cells = new Cell[this.size][this.size];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                Pair<Integer, Integer> pos = new Pair<>(i, j);
                cells[i][j] = new CellImpl(pos);
            }
        }
    }

    @Override
    public Cell getCell(Pair<Integer, Integer> pos) {
        return cells[pos.getX()][pos.getY()];
    }

    @Override
    public List<Cell> getAdjacentCells(Pair<Integer, Integer> pos) {
        ArrayList<Cell> adjacentCells = new ArrayList<>();

        for (int x = pos.getX() - 1; x <= pos.getX() + 1; x++) {
            for (int y = pos.getY() - 1; y <= pos.getY() + 1; y++) {
                if (x >= 0 && y >= 0 && x < size && y < size) {
                    if (!(x == pos.getX() && y == pos.getY())) {
                        adjacentCells.add(cells[x][y]);
                    }
                }
            }
        }

        return adjacentCells;
    }

    @Override
    public Integer getTotalCells() {
        return this.size * this.size;
    }

}
