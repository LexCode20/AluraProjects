public class ProdutoFisico implements Calculavel{

    @Override
    public double calcularPrecoFinal(double preco) {
        double valorMotoboy = 8.58;
        double exportaxao = (preco * 13)/100;
        double precoF = preco - valorMotoboy - exportaxao;
        System.out.println("O preço do produto é R$: "+preco+"\nO valor da entrega via motoboy é R$: "+valorMotoboy+
                "\nO valor da exportação é R$: "+exportaxao+"" +
                "\nO preço final do produto é R$: "+precoF);
        return 0;
    }
}
