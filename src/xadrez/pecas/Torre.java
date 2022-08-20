package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecasDeXadrez;

public class Torre extends PecasDeXadrez{

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
		
	}
	
	@Override
	public String toString() {
		return "T";
	}
}
