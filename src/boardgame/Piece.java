package boardgame;

public class Piece {
	// Colocando como proteced pois não é a peça final do tabuleiro ainda.
	// É uma posição simples de matriz, não queremos que ela seja visivel na camada
	// de xadrez

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	public Board getBoard() {
		return board;
	}

	
	

}
