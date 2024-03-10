package e2.playground;

import java.util.List;

import e2.Pair;
import e2.layout.Cell;
import e2.layout.Grid;

public interface Playground {

    public Grid getGrid();

    public void setMines(int totalMines);

    public List<Cell> getMines();

    public boolean hasMine(Pair<Integer, Integer> pos);
}
