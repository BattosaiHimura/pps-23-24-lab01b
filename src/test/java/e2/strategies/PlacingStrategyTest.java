package e2.strategies;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlacingStrategyTest {

    private PlacingStrategy placingStrategy;

    @BeforeEach
    void BeforeEach() {
        this.placingStrategy = null;
    }

    @Test
    void testTotalNumberOfPlacedElements() {
        int totalElements = 10;
        assertEquals(totalElements, placingStrategy.callStrategy(totalElements).size());
    }
}
