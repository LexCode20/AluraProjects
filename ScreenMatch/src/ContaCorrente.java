public class ContaCorrente extends ContaBancaria2{
    public void cobrarTarifaMensal(){
        double tarifa = 350;
        saldo = saldo - tarifa;
    }
}
