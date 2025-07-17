public class Livro2 implements Calculavel{
    private String livro;
    private double precoOriginal;

    @Override
    public double calcularPrecoFinal(double preco) {
        double frete = 7.49;
        double desconto = (preco * 10)/100;
        double precoF = preco + frete - desconto;
        System.out.println("O preço Original do livro é R$:"+preco+
                "\nO desconto é de R$:"+desconto+
                "\nO frete é de "+frete+"\n" +
                "O preco final do Livro é de R$:"+precoF);
        return 0;
    }
}
