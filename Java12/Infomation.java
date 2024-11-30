abstract class Veiculo {
    protected double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public abstract void transportar();

    public double getCargaMaxima() {
        return cargaMaxima;
    }
}

class Caminhao extends Veiculo {
    public Caminhao(double cargaMaxima) {
        super(cargaMaxima);
    }

    @Override
    public void transportar() {
        System.out.println("Transportando carga com o caminhão. \nCarga Máxima: "+ cargaMaxima +" kg");
    }    
    
}

class Van extends Veiculo {
    public Van(double cargaMaxima){
        super(cargaMaxima);
    }

    @Override
    public void transportar(){
        System.out.println("Transportando carga com a Van. \nCarga Máxima: "+ cargaMaxima +" kg");
    }
}

public class Infomation {
    public static void main(String[] args){
        Veiculo caminhao = new Caminhao(10000); // 10 toneladas
        Veiculo van = new Van(20000); // 2 toneladas

        caminhao.transportar();
        van.transportar();
    }
}