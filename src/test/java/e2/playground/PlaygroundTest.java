package e2.playground;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.Pair;
import e2.strategies.PlacingStrategy;
import e2.strategies.RandomPlacingStrategy;
import e2.strategies.SequentialPlacingStrategy;

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
        playground.setMines(SIZE);
        assertEquals(SIZE, this.playground.getMines().size());
    }

    @Test
    void testIfThereIsAMineInAGivenPosition() {
        playground.setMines(SIZE);
        playground.getMines().stream().forEach(c -> {
            assertTrue(this.playground.hasMine(c.getPosition()));
        });
    }

    @Test
    void testIfThereIsNoMineInAGivenPosition() {
        this.playground = new PlaygroundImpl(SIZE, new SequentialPlacingStrategy());

        for (int i = 1; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                assertFalse(this.playground.hasMine(new Pair<Integer, Integer>(i, j)));
            }
        }
    }
}
