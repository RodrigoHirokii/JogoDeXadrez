package app;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		// Loop pelas linhas do tabuleiro
		for (int i = 0; i < pieces.length; i++) {
			// Imprime o número da linha (8 a 1)
			System.out.print((8 - i) + " ");
			// Loop pelas colunas do tabuleiro
			for (int j = 0; j < pieces[i].length; j++) {
				// Imprime a peça ou um espaço vazio
				printPiece(pieces[i][j]);
			}
			// Pula para a próxima linha após imprimir todas as peças da linha atual
			System.out.println();
		}
		// Imprime as letras das colunas (a a h)
		System.out.println("  a b c d e f g h");
	}

	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			// Usa print ao invés de println para manter na mesma linha
			System.out.print("- ");
		} else {
			// Usa print para a peça com um espaço para alinhamento
			System.out.print(piece + " ");
		}
	}
}
