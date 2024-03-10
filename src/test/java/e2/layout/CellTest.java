package e2.layout;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.Pair;

class CellTest {

    private Cell cell;
    private Pair<Integer, Integer> pos;

    @BeforeEach
    void BeforeEach() {
        this.cell = null;
        this.pos = new Pair<>(5, 5);
    }

    @Test
    void testCellIsEnabled() {
        assertTrue(this.cell.isEnabled());
        this.cell.setEnabled(false);
        assertFalse(this.cell.isEnabled());
        this.cell.setEnabled(true);
        assertTrue(this.cell.isEnabled());
    }

    @Test
    void testCellIsMarked() {
        assertFalse(this.cell.isMarked());
        this.cell.setMarked(true);
        assertTrue(this.cell.isMarked());
        this.cell.setMarked(false);
        assertFalse(this.cell.isMarked());
    }

    @Test
    void testSettingCellText() {

        String text = "test";

        assertTrue(cell.getText().equals(""));
        cell.setText(text);
        assertTrue(cell.getText().equals(text));
    }

    @Test
    void testCellShouldBeCreatedWithPosition() {
        assertTrue(cell.getPosition().equals(pos));
    }
}
