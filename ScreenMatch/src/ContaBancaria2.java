public class ContaBancaria2 {
    double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        saldo += deposito;
    }
    public void sacar(double saque){
        saldo -= saque;
    }
    public void consultarSaldo(){
        System.out.println(saldo);
    }
}
