package boardgame;

public class Piece {
	// Colocando como proteced pois não é a peça final do tabuleiro ainda.
	// É uma posição simples de matriz, não queremos que ela seja visivel na camada
	// de xadrez

	// OBS: Não colocamos os getters e setters da posição (peça) recém criada
	// pois a peça não foi colocada no tabuleiro ainda

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
