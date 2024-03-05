package e1;

import java.util.*;

public class LogicsImpl implements Logics {
	
	private final Pair<Integer,Integer> pawn;
	private Pair<Integer,Integer> knight;

	private Chessboard chessboard;
	 
    public LogicsImpl(int size){
		this.chessboard = new ChessboardImpl(size);
        this.pawn = this.chessboard.randomPosition();
		do {
			this.knight = this.chessboard.randomPosition();
		} while (this.pawn.equals(this.knight));
    }

	public LogicsImpl(int size, Pair<Integer,Integer> pawn, Pair<Integer,Integer> knight){
    	this.chessboard = new ChessboardImpl(size);
        this.pawn = pawn;
        this.knight = knight;	
    }
    
    
	@Override
	public boolean hit(int row, int col) {
		if (this.chessboard.hasPosition(row, col)) {
			// Below a compact way to express allowed moves for the knight
		int x = row-this.knight.getX();
		int y = col-this.knight.getY();
		if (x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3) {
			this.knight = new Pair<>(row,col);
			return this.pawn.equals(this.knight);
		}
		}
		return false;
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knight.equals(new Pair<>(row,col));
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.equals(new Pair<>(row,col));
	}
}
