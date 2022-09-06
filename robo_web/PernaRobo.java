package robo_web;

public class PernaRobo{

	public void andar(Robo robo){
		if(robo.getTabuleiro().validaPosicaoRobo(robo.getLinha(), robo.getColuna(), robo.getDirecao())){
			calculaMovimentoEExecutaAacaoDesejada(robo);					
		}else{
			System.out.println("Nao deu certo o movimento");
		}
	}
	
	public void calculaMovimentoEExecutaAacaoDesejada(Robo robo){
		
		robo.getTabuleiro().apagaPosicaoRobo(robo.getLinha(), robo.getColuna());
		
		FactoryDirecao direcao = new FactoryDirecao();
		
		InterfaceMovimento movimento = direcao.objetoDirecao(robo.getDirecao());
		
		movimento.movimento(robo);
		
		robo.getTabuleiro().inserePosicaoRobo(robo.getLinha(), robo.getColuna());
	}
	
}