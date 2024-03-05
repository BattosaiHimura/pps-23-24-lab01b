package e1;

public class ChessmasterImpl implements Chessmaster {

    @Override
    public Pair<Integer, Integer> moveKnight(Pair<Integer, Integer> knight, int row, int col) {
        int x = row - knight.getX();
		int y = col - knight.getY();
		if (x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3) {
			knight = new Pair<>(row,col);
        }

        return knight;
    }
    
}
