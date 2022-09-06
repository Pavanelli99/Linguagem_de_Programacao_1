package lista;



public class ListaLinear {

    public static class Lista{
        public No inicio;
        public int tam;
    }

    public static class No{
        public int info;
        public No prox;
    }

    public static void main(String[] args) {
        Lista l = iniciarLista();
        l = addInicio(l, 10);
        l = addInicio(l, 5);
        l = addInicio(l, 1);
        printLista(l);

         
    }

    public static Lista iniciarLista( ){
        Lista l = new Lista();
        l.inicio = null;
        l.tam = 0;
        return l;

    }

    public static Lista addInicio( Lista l, int val) {
        No n1 = new No();
        n1.info = val;
        n1.prox = l.inicio;
        l.inicio = n1;
        l.tam++;
        return l;
        
    }

    public static void printLista(Lista l) {
        System.out.print("L -> ");
        No aux = l.inicio;
        while(l.inicio != null){  
            System.out.print(aux.info + " -> ");
            aux = aux.prox;
        }
        System.out.println("NULL");
        
    }
    
}
