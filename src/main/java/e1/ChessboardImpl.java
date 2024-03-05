package e1;

import java.util.Random;

class ChessboardImpl implements Chessboard {

    private int size;
    private final Random random = new Random();

    public ChessboardImpl(int size) {
        this.size = size;
    }

    @Override
    public Pair<Integer, Integer> randomPosition() {
        return new Pair<>(this.random.nextInt(size),this.random.nextInt(size));
    }

    @Override
    public boolean hasPosition(int row, int col) {
        if (row >= 0 && col >= 0 && row < this.size && col < this.size) {
            return true;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
    
}
