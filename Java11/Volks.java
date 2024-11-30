class Carro {
    public void acelerar(){
        System.out.println("O carro está acelerando!!");
    }
}

class Fusca extends Carro {
    @Override // Usado para sobrescrever
    public void acelerar() {
        System.out.println("Acelerando lentamente, mas aproveitando muito mais!");
    }
}

class Gol extends Carro {
    @Override
    public void acelerar(){
        System.out.println("O Gol acelera 5x mais rápido que o Fusca!");
    }
}

class Jetta extends Carro {
    @Override
    public void acelerar() {
        System.out.println("O Jetta acelera 10x mais rápido que o Gol!");
    }
}

public class Volks {
    public static void main(String[] args){
        Carro[] carros = new Carro[3];
        carros[0] = new Fusca();
        carros[1] = new Gol();
        carros[2] = new Jetta();

        for (Carro carro : carros){
            carro.acelerar(); // polimorfismo em ação!
        }
    }
}