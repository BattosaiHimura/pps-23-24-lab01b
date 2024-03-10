package e2.playground;

import java.util.List;

import e2.Pair;
import e2.layout.Cell;

public interface Playground {

    public void setMines(int totalMines);

    public List<Cell> getMines();

    public boolean hasMine(Pair<Integer, Integer> pos);
}
