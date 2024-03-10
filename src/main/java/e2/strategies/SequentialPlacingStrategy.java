package e2.strategies;

import java.util.ArrayList;
import java.util.List;

import e2.Pair;

public class SequentialPlacingStrategy implements PlacingStrategy {

    @Override
    public List<Pair<Integer, Integer>> callStrategy(Integer elements) {
        List<Pair<Integer, Integer>> placedElements = new ArrayList<>();

        for (int i = 0; i < elements; i++) {
            placedElements.add(new Pair<>(0, i));
        }

        return placedElements;
    }

}
