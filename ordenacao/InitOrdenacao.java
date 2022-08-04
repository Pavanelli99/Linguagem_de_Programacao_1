package ordenacao;

import java.util.Random;
import java.util.Scanner;

public class InitOrdenacao {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // fazer leitura pelo teclado

        int vetor[] = new int [5];
        
        int vetor2[] = {1,2,3,4,5,6};

        int matriz[][] = new int [3] [3];

        vetor[2] = 30;
        vetor2 [0] = 20;
        matriz [0][0] = 2;

        for (int i = 0; i < 5; i++){
           System.out.println(vetor [i]);
        }
        
        for (int i = 0; i < 5; i++){
           System.out.println(vetor2 [i]);
        }

        for (int i = 0; i < 5; i++){
           System.out.println(matriz [i]);
        }


        //for (int i = 0; i < 5; i++){
        //    System.out.println("Digite o # " + i + "número");
        //    vetor[i] = in.nextInt(); //ler um numero e armazena no vetor na posição i.
       // }
        //--------------------------------------------------------------------------------
        int min = 2, max = 10;

        Random rand = new Random();
        System.out.println(rand.nextInt(max - min) + min);






     in.close();
    }
    
}
