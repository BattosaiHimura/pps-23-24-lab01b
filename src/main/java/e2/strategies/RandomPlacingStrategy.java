package e2.strategies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import e2.Pair;

public class RandomPlacingStrategy implements PlacingStrategy {

    private Random random;

    public RandomPlacingStrategy() {
        this.random = new Random();
    }

    @Override
    public List<Pair<Integer, Integer>> callStrategy(Integer elements) {
        List<Pair<Integer, Integer>> placedElements = new ArrayList<>();

        while (placedElements.size() < elements) {
            Pair<Integer, Integer> pos = new Pair<>(this.random.nextInt(elements), this.random.nextInt(elements));

            if (!placedElements.contains(pos)) {
                placedElements.add(pos);
            }
        }

        return placedElements;
    }

}
