package xadrez;

import tabuleiro.Tabuleiro;
import tabuleiro.Peca;

public class PecasDeXadrez extends Peca {
	
	private Cor cor;

	public PecasDeXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

}
