package robo_web;


public class CabecaRobo {

	public String virarParaDireita(){
		return "direita";
	}
	
	public String virarParaFrente(){
		return "frente";
	}
	
	public String virarParaEsquerda(){
		return "esquerda";
	}
	
	public String virarParaTras(){
		return "tras";
	}
	
	public void pegarPosicaoDoRobo(Robo robo){
		System.out.println("Seu robo esta na linha : "+robo.getLinha()+" . E na coluna : "+robo.getColuna() +" E virado para :" + robo.getDirecao());
	}
	
}