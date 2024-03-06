package e1;

import java.util.*;

public class LogicsImpl implements Logics {
	
	private final Pair<Integer,Integer> pawn;
	private Pair<Integer,Integer> knight;

	private Chessboard chessboard;
	private Chessmaster chessmaster;
	 
    public LogicsImpl(int size) {
		this.chessboard = new ChessboardImpl(size);
		this.chessmaster = new ChessmasterImpl();

        this.pawn = this.chessboard.randomPosition();
		do {
			this.knight = this.chessboard.randomPosition();
		} while (this.pawn.equals(this.knight));
    }

	public LogicsImpl(int size, Pair<Integer,Integer> pawn, Pair<Integer,Integer> knight) {
    	this.chessboard = new ChessboardImpl(size);
		this.chessmaster = new ChessmasterImpl();
        this.pawn = pawn;
        this.knight = knight;	
    }
    
	@Override
	public boolean hit(int row, int col) {
		if (this.chessboard.hasPosition(row, col)) {
			this.knight = this.chessmaster.moveKnight(knight, row, col);
			return this.pawn.equals(this.knight);
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
