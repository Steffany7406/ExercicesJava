import java.util.ArrayList;
import java.util.List;

public class ListaFrutas {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList();
        
        frutas.add("Maçã");
        frutas.add("Mamão");
        frutas.add("Banana");
        frutas.add("Maracuja");
        frutas.add("Pequi");
        frutas.add("Caqui");
        frutas.add("Cereja");
        frutas.add("Jaca");
        
        System.out.println("Frutas da Lista: "+ frutas);
        //System.out.println("Primeira fruta - "+ frutas.get());
        
        int i = 0;
        
        while(i < frutas.size()) {
            System.out.println("Fruta "+ i + " - " + frutas.get(i));
            i++;
        }
    }    
}