package robo_web;

public class Robo {
	
	private String direcao = "frente";
	private static int coluna = 0;
	private static int linha = 0;
	private Tabuleiro tabuleiro ;
	private CabecaRobo cabecaRobo;
	private PernaRobo pernaRobo;
	
	public Robo(){
		this.tabuleiro = new Tabuleiro();
		this.cabecaRobo = new CabecaRobo();
		this.pernaRobo = new PernaRobo();
	};
	
	public void acao(int a){
		
		FactoryAcao acaoRobo = new FactoryAcao();
		
		InterfaceAcao interfaceAcao = acaoRobo.acaoRobo(a);
		
		interfaceAcao.acao(this);
		
	}
	
	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}	
	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		Robo.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		Robo.coluna = coluna;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public CabecaRobo getCabecaRobo() {
		return cabecaRobo;
	}

	public PernaRobo getPernaRobo() {
		return pernaRobo;
	}
	
}