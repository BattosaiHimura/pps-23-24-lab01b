package e2.playground;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaygroundTest {

    private Playground playground;

    @BeforeEach
    void BeforeEach() {
        this.playground = null;
    }

    @Test
    void testPlaygroundMineSetup() {

        int totalMines = 10;

        playground.setMines(totalMines);
        assertEquals(playground.getMines().size(), totalMines);
    }

}
