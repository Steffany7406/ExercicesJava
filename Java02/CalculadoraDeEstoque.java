public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        
        double livroJava = 59.90;
        double livroTDD = 59.90;       
        double soma = livroJava + livroTDD;
        System.out.println("O total em estoque é "+soma);
    
        
        if (soma < 150){
            System.out.println("O estoque está baixo!");
        } else{
            System.out.println("O estoque está ótimo!");
        }    
    }
}