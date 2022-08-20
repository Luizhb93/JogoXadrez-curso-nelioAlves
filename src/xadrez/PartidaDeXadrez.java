package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;
	//Quando iniciar a partida cria um tabuleiro e inicia a partida
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		iniciarPartida();
	}
	
	public PecasDeXadrez[][] getPecas(){
		PecasDeXadrez[][] matriz = new PecasDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas(); i++) {
			for(int j=0; j<tabuleiro.getColunas();j++) {
				matriz[i][j] = (PecasDeXadrez)tabuleiro.peca(i,j);
			}
		}
		return matriz;
	}
	private void iniciarPartida() {
		tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.BRANCO), new Posicao(2,1));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.PRETO ), new Posicao(0,4));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.BRANCO ), new Posicao(7,4));
	}
}
