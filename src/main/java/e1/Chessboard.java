package e1;

public interface Chessboard {
    
    /**
     * Return a random position on the chessboard in terms of a pair of Integers representing the column and row numbers
     */
    Pair<Integer,Integer> randomPosition();

    /**
     * 
     * Given a position, checks if it is within the boundaries of the chessboard
     * 
     * @param row
     * @param col
     * @return
     */
    boolean hasPosition(int row, int col);
}
