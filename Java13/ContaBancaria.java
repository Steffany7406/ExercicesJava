public class ContaBancaria {
    public String titular;
    public String agencia;
    public  double saldo;
    
    public ContaBancaria (String titular, String agencia, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getTitular() {
        return  titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getSaldo() {
        return String.valueOf(saldo);
    }

    public void setSaldo(double saldo){
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo.");
        }
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Steffany", "1234", 1850);
        System.out.println("\nNome do Titular: "+conta.getTitular());
        System.out.println("Agência: "+conta.getAgencia());
        System.out.println("Saldo: "+conta.getSaldo());

        conta.setSaldo(650);
    }    
}
