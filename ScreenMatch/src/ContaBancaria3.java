public class ContaBancaria3 {
    private int conta;
    private double saldo;

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void CriarConta(int conta, double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }
}
