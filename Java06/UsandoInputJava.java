import java.util.Scanner; //Importando documento

public class UsandoInputJava {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //Cria um objeto para entrada de usuario
        int a, b;
        
        System.out.printf("Informe o primeiro valor: ");
        a = ler.nextInt(); //Lê a entrada do usuário
        
        System.out.printf("Informe o Segundo valor: ");
        b = ler.nextInt();
        
        int soma = a + b;
        System.out.printf("O resultado é "+soma);
    }
}