package e2.playground;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.strategies.PlacingStrategy;
import e2.strategies.RandomPlacingStrategy;

class PlaygroundTest {

    private Playground playground;
    private static final int SIZE = 10;
    private PlacingStrategy strategy;

    @BeforeEach
    void BeforeEach() {
        this.strategy = new RandomPlacingStrategy();
        this.playground = new PlaygroundImpl(SIZE, strategy);
    }

    @Test
    void testPlaygroundMineSetup() {

        int totalMines = 10;

        playground.setMines(totalMines);
        assertEquals(totalMines, this.playground.getMines().size());
    }

}
