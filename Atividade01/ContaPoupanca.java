package Atividade01;

public class ContaPoupanca {
    //-----------Atributos--------------//
    private String nome;
    private double saldo;
    private int poupanca;
    private int agencia;

    //---------- Construtor-------------------------//
    public ContaPoupanca(double saldo_inicial){
        this.saldo = saldo_inicial;
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
     public void setPoupanca (int poupanca){
        this.poupanca = poupanca;
     }
     public int getPoupanca (){
        return this.poupanca;
     }
     public void setAgencia (int agencia){
        this.agencia = agencia;
     }
     public int getAgencia (){
        return this.agencia;
     }

     //------------Metodo ----------------------//
     public String depositar (double valor){
        if(valor > 0){
        this.saldo += valor;
        return "Deposito efetuado !";
        }
        return "Deposito não efuado, verifique o valor !";
    }

    public String sacar (int valor){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
            return "Saque efetuado";
        }
        return "Valor é maior que o saldo disponivel";
       
    }
        


}
     