package robo_web;

import java.util.Scanner;


public class ProgramaDoRobo {

	public static void main(String[] args) {
	
		Robo robo = new Robo();
		int acao = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Aperte 1 para andar uma casa , 2 para frente, " +
				"3 para virar para a esquerda e 4 para virar para direita " +
				"5 para tras. Pegar posicao 6. E para " +
				"sair digite zero. Bom divertimento");

		while(acao != 0){
			System.out.println("Digite o comando desejado : ");
			acao = scan.nextInt();
			robo.acao(acao);
		}

	  in.close();
		
	}
	
}