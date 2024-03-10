package e2.playground;

import java.util.ArrayList;
import java.util.List;

import e2.Pair;
import e2.layout.Cell;
import e2.layout.CellImpl;
import e2.layout.Grid;
import e2.layout.GridImpl;
import e2.strategies.PlacingStrategy;

public class PlaygroundImpl implements Playground {

    private Integer size;
    private Grid grid;
    private ArrayList<Cell> mines;

    PlacingStrategy strategy;

    public PlaygroundImpl(int size, PlacingStrategy strategy) {
        this.size = size;
        this.strategy = strategy;
        this.grid = new GridImpl(this.size);
        this.mines = new ArrayList<>();
    }

    @Override
    public void setMines(int totalMines) {
        for (Pair<Integer, Integer> pos : this.strategy.callStrategy(this.size)) {
            this.mines.add(new CellImpl(pos));
        }
    }

    @Override
    public List<Cell> getMines() {
        return this.mines;
    }

    public Grid getGrid() {
        return this.grid;
    }

    @Override
    public boolean hasMine(Pair<Integer, Integer> pos) {
        return this.mines.stream().anyMatch(c -> c.getPosition().equals(pos));
    }

}
