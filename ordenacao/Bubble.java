package ordenacao;

import java.util.Random;

public class Bubble {
    private static final int TAM = 10;
    public static void main(String[] args) {

        int vetor[] = new int [TAM];
        Random rand = new Random();
        
           for(int i=0; i < vetor.length; i++){
                vetor [i] = rand.nextInt(TAM * TAM - 1) + 1;
           }
           System.out.println("Vetor Desordenado");
            print(vetor);
            for(int i=0; i < vetor.length; i++){
               System.out.print(vetor[i] + " \t ");
          }

            System.out.println("\n\nVetor Ordenado");
            
            Boolean troca = false;  
            int numComparacao = 0;  
            do {
                troca = false;
               // for(int i=0; i < vetor.length; i++){
                for(int j=0; j < vetor.length -1; j++){
                numComparacao++;
                if (vetor[j] > vetor [j + 1]){
                    troca = true;
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                } 
            }          
        }while (troca);

         print(vetor);
                  
        }
      private static void print(int[] vetor) {
    }  
}
    
