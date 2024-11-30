import java.util.Date;

public class Professor extends Pessoa {
    public double salario;
    public String disciplina;

    public Professor(String nome, String cpf, Date dataNascimento, double salario, String disciplina) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Salário: " + salario);
        System.out.println("Disciplina: " + disciplina);
    }

    public static void main(String[] args){
        Professor professor = new Professor("Ilza Silva", "147.895.699-25", new Date(), 4890.00, "Matemática");

        System.out.println("Informações do Professor: ");
        professor.exibirInformacoes();
    }
}