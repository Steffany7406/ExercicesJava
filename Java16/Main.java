import java.util.Collection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Collection<String> letras = new ArrayList<>();

        letras.add("S");
        letras.add("T");
        letras.add("E");
        letras.add("F");
        letras.add("F");
        letras.add("A");
        letras.add("N");
        letras.add("Y");

        if (letras.isEmpty()){
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Contém valores "+ letras);
        }
    }
}