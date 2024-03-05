package e1;

public interface Chessmaster {
    
    /**
     * Checks wether if a given knight is allowed to move to a given position given its current one
     * and returns the new position if the move is valid, same position otherwise.
     * 
     * @param knight
     * @param row
     * @param col
     * @return
     */
    Pair<Integer, Integer> moveKnight(Pair<Integer, Integer> knight, int row, int col);
}
