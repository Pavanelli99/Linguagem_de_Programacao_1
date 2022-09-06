package robo_web;

public class FactoryDirecao {

	public InterfaceMovimento objetoDirecao(String direcao){
		switch (direcao) {
		case "direita":
			return new MoveParaDireita();
		case "esquerda":
			return new MoveParaEsquerda();
		case "tras":
			return new MoveParaTras();
		case "frente":
			return new MoveParaFrente();
		default:
			return new MoveParaFrente(); 
		}
	}
}
