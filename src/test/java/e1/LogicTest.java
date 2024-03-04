package e1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class LogicTest {

  Logics logics;
  private final int SIZE = 5;
  
  @BeforeEach
  void BeforeEach() {
    Pair<Integer, Integer> pawn = new Pair<Integer,Integer>(3, 1);
    Pair<Integer, Integer> knight = new Pair<Integer,Integer>(4, 3);
    this.logics = new LogicsImpl(SIZE, pawn, knight);
  }

  @Test
  void testHasPawnOnPosition() {
    assertTrue(this.logics.hasPawn(3, 1));
  }

  @Test
  void testHasNotPawnOnPosition() {
    assertTrue(this.logics.hasPawn(0, 0));
  }

  @Test
  void testHasKnightOnPosition() {
    assertTrue(this.logics.hasKnight(4, 3));
  }

  @Test
  void testHasNotKnightOnPosition() {
    assertFalse(this.logics.hasKnight(0, 0));
  }

  @Test
  void hitXIndexMustBeWithinRange() {
    assertThrows(IndexOutOfBoundsException.class, () -> this.logics.hit(SIZE, 0));
  }

  @Test
  void hitYIntexMustBeWithinRange() {
    assertThrows(IndexOutOfBoundsException.class, () -> this.logics.hit(0, SIZE));
  }

  @Test
  void hitXIndexMustBePositive() {
    assertThrows(IndexOutOfBoundsException.class, () -> this.logics.hit(-1, 0));
  }

  @Test
  void hitYIndexMustBePositive() {
    assertThrows(IndexOutOfBoundsException.class, () -> this.logics.hit(0, -1));
  }

  @Test
  void testValidKnightMove() {
    assertFalse(this.logics.hit(3,2));
    assertTrue(this.logics.hasKnight(2, 2));
  }

  @Test
  void testInvalidKnightMove() {
    assertFalse(this.logics.hit(3,3));
    assertFalse(this.logics.hasKnight(3, 3));
    assertTrue(this.logics.hasKnight(4, 3));
  }

  @Test
  void testValidPawnHit() {
    assertTrue(this.logics.hit(3,1));
  }

  @Test
  void testInvalidPawnHit() {
    this.testValidKnightMove();
    assertFalse(this.logics.hit(3,1));
    assertTrue(this.logics.hasKnight(2, 2));
  }
}
