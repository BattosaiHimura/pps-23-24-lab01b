package e2.strategies;

import java.util.List;

import e2.Pair;

public interface PlacingStrategy {

    /**
     * Given the total number of mines to place, returns a list of positions where elements
     * have been placed according to a given strategy
     * @param elements
     * @return The positions where elements have been placed
     */
    public List<Pair<Integer, Integer>> callStrategy(Integer elemens);
}
