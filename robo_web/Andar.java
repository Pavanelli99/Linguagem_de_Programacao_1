package robo_web;

public class Andar implements InterfaceAcao {

	@Override
	public void acao(Robo robo) {
		robo.getPernaRobo().andar(robo);
		System.out.print("O robo andou uma casa para frente. E ");
		robo.getCabecaRobo().pegarPosicaoDoRobo(robo);	
		
	}

}
