package classes;

    public class Aula1{
    
        public static void main(String[] args){

         Cachorro doguinho = new Cachorro("doguinho");// o name é o 'inlay'

         doguinho.setNome("Rex");
         doguinho.setIdade(7);
         doguinho.setRaca("Caramelo");
         doguinho.setDono(true);
         doguinho.setCastrado(false);
         doguinho.setPeso(7.3);

         //System.out.println("O nome do cahorro é: " + doguinho.nome);

         System.out.println(doguinho.toString());
         
         Cachorro toto = new Cachorro("toto");

         toto.setNome("Birulaybe");
         toto.setIdade(10);
         toto.setRaca("Caramelo");
         toto.setDono(true);
         toto.setCastrado(false);
         toto.setPeso(10.0);

         System.out.println(toto.toString());

   
    
    }
}