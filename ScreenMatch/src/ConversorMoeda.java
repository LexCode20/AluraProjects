public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double dolar) {
        double valorReal = dolar * 5.41;
        System.out.println("R$:"+dolar+" dólares equivalem a R$:"+valorReal+" reais");
        return 0;
    }
}
