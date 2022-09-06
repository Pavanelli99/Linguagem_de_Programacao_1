package robo_web;

public class FactoryAcao {

	public InterfaceAcao acaoRobo(int i){
		
	switch (i) {
	case 1:
		return new Andar();
	case 2:
		return new VirarParaFrente();
	case 3:
		return new VirarParaEsquerda();
	case 4:
		return new VirarParaDireita();
	case 5:
		return new VirarParaTras();
	case 6:
		return new PosicaoDoRobo();
		
	default:
	}	
	
	return new Andar();
		
	}	
	
}
