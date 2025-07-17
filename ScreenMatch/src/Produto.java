public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double preco){
        double desc = 10;
        double valorComDesc = preco - (preco * desc / 100);
        System.out.println("O valor do produto é R$:"+preco+"\nO valor do produto com desconto de 10% R$:"+valorComDesc);
    }
}
