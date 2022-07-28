package classes;

public class Cachorro {
    //-----------Atributos--------------//
    private String nome;
    private int idade;
    private String raca;
    private boolean dono;
    private boolean castrado;
    private Double peso;
   
    //-------- Construtor --------------//
    public Cachorro(String name){  // Cria o objeto para a jvm
       System.out.println("\nCriando o Objeto: " + name);
    }
    //---------- Getters e Setters ---------------//
     public void setNome (String n){
        this.nome = n;
     }
     public String getNome (){
        return this.nome;
     }
     public void setIdade (int idade){
        this.idade = idade;
     }
     public int getIdade (){
        return this.idade;
     }
     public void setRaca (String raca){
        this.raca = raca;
     }
     public String getRaca (){
        return this.raca;
     }
     public void setDono (boolean dono){
        this.dono = dono;
     }
     public boolean getDono (){
        return this.dono;
     }
     public void setCastrado (boolean castrado){
        this.castrado = castrado;
     }
     public boolean getCastrado (){
        return this.castrado;
     }
     public void setPeso (Double peso){
        this.peso = peso;
     }
     public Double getPeso (){
        return this.peso;
     }

     //---------- Metodos ----------------//
    public String toString(){

        return ("Nome: " + this.nome +
        "\nIdade: " + this.idade + 
        "\nRaça: " + this.raca + 
        "\nDono: " + this.dono + 
        "\nCastrado: " + this.castrado + 
        "\nPeso: " + this.peso);
     }


}
