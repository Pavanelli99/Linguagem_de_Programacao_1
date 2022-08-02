package Atividade01;

public class MeuBanco {
        public static void main(String [] args){
        ContaCorrente conta_edu = new ContaCorrente(0, 500);
        conta_edu.setNome("edu");
        conta_edu.setAgencia(123);
        conta_edu.setConta(123);

        conta_edu.depositar(120);
        conta_edu.depositar(75.20);
        
       
        conta_edu.sacar(10000);


        ContaCorrente conta_junin = new ContaCorrente(0, 30000);
        conta_junin.setNome("junin");
        conta_junin.setAgencia(1243);
        conta_junin.setConta(6563);

        conta_junin.sacar(40000);
 
    
    }
}
