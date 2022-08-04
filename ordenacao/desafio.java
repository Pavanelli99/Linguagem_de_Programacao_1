//Criar numeros aleatorias sem repetir 
package ordenacao;

import java.util.Random;

public class desafio {

    public static void main(String[] args) {

        int max =20, min = 10;
        int vetor[] = new int [10];
        Random rand = new Random();

        int qtd = 0;
        
        for(int i = 0; i < 10; i++){
            boolean found = true;
            int temp = 0;
            while(found){
                found = false;
                temp = rand.nextInt(max - min ) + min;
                for(int j = 0; j < qtd; j++){
                    if (temp == vetor[j]){
                        found = true;
                        
                    }
                    
                }      
        }
        vetor[i]= temp;
        System.out.println(temp + "");
        qtd++;
        
            
        }  
     
    }
}
    


