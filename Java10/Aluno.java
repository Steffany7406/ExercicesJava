import java.util.Date;

public class Aluno extends Pessoa {
    public String matricula;

    // Removi o parêntese extra na declaração do construtor
    public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Matricula: " + matricula);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Jose Macedo", "147.292.625.14", new Date(), "2024-3645");
        
        System.out.println("Informações do Aluno: ");
        aluno.exibirInformacoes();
    }
}