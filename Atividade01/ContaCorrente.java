package Atividade01;

public class ContaCorrente {
    //-----------Atributos--------------//
    private String nome;
    private double saldo;
    private int conta;
    private int agencia;
    private double limite;
     
    //---------- Construtor-------------------------//
    public ContaCorrente(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }
    //---------- Getters e Setters ---------------//
     public void setNome (String n){
        this.nome = n;
     }
     public String getNome (){
        return this.nome;
     }
     public double getSaldo (){
        return this.saldo;
     }
     public void setConta (int conta){
        this.conta = conta;
     }
     public int getConta (){
        return this.conta;
     }
     public void setAgencia (int agencia){
        this.agencia = agencia;
     }
     public int getN_agencia (){
        return this.agencia;
     }
     public void setLimite (Double l){
        this.limite = l;
     }
     public double getLimite (){
        return this.limite;
     }

     //------------Metodo ----------------------//
     public String depositar (double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Saldo = " + this.saldo);
            return "Deposito efetuado !";
            }
        return "Deposito não efuado, verifique o valor !";
    }

    public void sacar (int valor){
        if(valor > 0 && valor < this.saldo + this.limite){
            this.saldo -= valor;
            System.out.println ("Saque efetuado");
            System.out.println("Saldo da conta: " + this.saldo);
        }
        System.out.println("Saque não efetuado pois o valor é maior que o saldo disponivel!");
       
    }
     

}
