package xadrez;

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
	
	private void colocarNovaPeca(char coluna, int linha, PecasDeXadrez peca) {
		tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna, linha).paraPosicao());
	}
	
	private void iniciarPartida() {
		colocarNovaPeca('b',6,new Torre(tabuleiro,Cor.BRANCO));
		colocarNovaPeca('e',8,new Rei(tabuleiro, Cor.PRETO ));
		colocarNovaPeca('e',1,new Rei(tabuleiro, Cor.BRANCO ));
	}
}
