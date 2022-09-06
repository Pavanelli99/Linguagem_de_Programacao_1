package robo_web;

public class Tabuleiro {

	private String[][] tabuleiro = new String[7][7];
	
	
	public boolean validaPosicaoRobo(int linha, int coluna, String direcao){
		if("direita".equals(direcao) && coluna<6){			
			return true;			
		}else if("esquerda".equals(direcao) && coluna>0){			
			return true;
		}else if("tras".equals(direcao) && linha>0){
			return true;
		}else if("frente".equals(direcao) && linha<6){
			return true;
		}else{
			return false;
		}		
	}

	public void apagaPosicaoRobo(int linha, int coluna){
		getTabuleiro()[linha][coluna] = null;		
		}
	
	public void inserePosicaoRobo(int linha, int coluna){
		getTabuleiro()[linha][coluna] = "robo";		
	}

	public String[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

}