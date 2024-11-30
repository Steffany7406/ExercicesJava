import java.util.Collection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Collection<String> livros = new ArrayList<>();

       livros.add("A Lista de Schindler");
       livros.add("Código Da Vinci");
       livros.add("A Sutil Arte de Ligar o Fod@0-se");
       livros.add("Ponto de Impacto");

        System.out.println("Lista: "+ livros);
        
        livros.clear();
        
        System.out.println("Lista Atual: "+ livros);
    }
}