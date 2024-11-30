import java.util.Date;

class Pessoa {
    public String nome;
    public String cpf;
    public Date dataNascimento;

    public Pessoa(String nome, String cpf, Date dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
}

class Aluno extends Pessoa {
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

class Professor extends Pessoa {
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
}

public class School {
    public static void main(String[] args){
        Professor professor = new Professor("Ilza Silva", "147.895.699-25", new Date(), 4890.00, "Matemática");

        System.out.println("Informações do Professor: ");
        professor.exibirInformacoes();
    }
}