package ordenacao;

import java.util.Random;

public class Selection {

    private static final int TAM = 8;
    public static void main(String[] args) {

        int vetor[] = new int [TAM];
        Random rand = new Random();
        
           for(int i=0; i < vetor.length; i++){
                vetor [i] = rand.nextInt(TAM - 1) + 1;
           }
           System.out.println("Vetor Desordenado:");
           print(vetor);

           for(int i = 0; i < TAM; i++){
            int min = i;
            for(int j = i + 1; j < TAM; j++){
                if (vetor[j] < vetor[min]){  
                    min = j;
                }  
           }
           // troca elemento
           int aux = vetor[i];
           vetor[i] = vetor[min];
           vetor[min] = aux;
             
           }
           System.out.println("\nVetor Ordenado:");
           print(vetor);
        } 
         //----------------------------------------------------------------
         public static void print(int vetor[]) { //
           for (int i = 0; i < vetor.length; i++) {
             System.out.print(vetor[i] + " \t ");
           }
         }
       }

